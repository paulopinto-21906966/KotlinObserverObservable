package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel

abstract class Leitor(val nome: String, private var registado: Boolean = false) : Registavel {
    fun estaRegistado() = this.registado
}

class LeitorPar(nome: String) : Leitor(nome), OnNumeroListener {
    private var numeros = ArrayList<Int>()

    fun imprimeNumeros(): String {
        var pares: String = ""
        var impares: String = ""

        numeros.forEach {
            if (it % 2 == 0) {
                pares += it
            } else {
                impares += it
            }
        }

        return """
            para os impares $nome leu os seguintes numeros impares: $impares
            para os impares $nome leu os seguintes numeros pares: $pares            
        """.trimIndent()
    }

}

class LeitorImpar(nome: String) : Leitor(nome), OnNoticiaListener {
    private var noticias = ArrayList<Noticia>()

    fun imprimeNoticias(): String {
        return noticias.toString()
    }

}