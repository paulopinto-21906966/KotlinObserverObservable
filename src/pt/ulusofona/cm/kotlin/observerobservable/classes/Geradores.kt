package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

abstract class Gerador(val maxLeitores: Int) {

    private fun notificarLeitores() {
//        envia noticias a todos os leitores
//        leitores.forEach( send noticias)
    }

    fun iniciar() {
        notificarLeitores()
    }
}


class CorreioDaLusofona(maxLeitores: Int, private var noticias: ArrayList<Noticia>) : Gerador(maxLeitores) {

    private var leitores = ArrayList<OnNoticiaListener>()

    fun adicionarLeitor(leitor: OnNoticiaListener) {
        if (leitores.size >= maxLeitores) throw LimiteDeLeitoresAtingidoException(this, maxLeitores)
        leitores.add(leitor)
    }

    fun removeLeitor(leitor: OnNoticiaListener) {
        if (!leitores.contains(leitor)) throw LeitorInexistenteException()
    }

    private fun notificarLeitores() {
        leitores.forEach {
            it.onReceiveNoticia(noticias[0])
        }
    }
}

class GeradorNumerico(maxLeitores: Int, private var numeros: ArrayList<Int>) : Gerador(maxLeitores) {

    private var leitores = ArrayList<OnNumeroListener>()

    fun adicionarLeitor(leitor: OnNumeroListener) {
        if (leitores.size >= maxLeitores) throw LimiteDeLeitoresAtingidoException(this, maxLeitores)
        leitores.add(leitor)
    }

    fun removeLeitor(leitor: OnNumeroListener) {
        if (!leitores.contains(leitor)) throw LeitorInexistenteException()
    }

    private fun notificarLeitores() {
        leitores.forEach {
            it.onReceiveNumero(numeros[0])
        }
    }
}