package pt.ulusofona.cm.kotlin.observerobservable.interfaces

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.*

interface Registavel {

    fun leitorAdicionadoComSucesso() {
//        registado = true
        println("registado true")
        return
    }

    fun leitorRemovidoComSucesso() {
//        if (!estaLigado()) throw VeiculoDesligadoException()
        println("registado false")
        return
    }

    fun checkLeitor() {
//        if (leitor não existe)  LeitorInexistenteException
    }
}