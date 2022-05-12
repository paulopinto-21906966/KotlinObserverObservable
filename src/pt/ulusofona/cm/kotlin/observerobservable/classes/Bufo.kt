package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class Bufo : OnNumeroListener, OnNoticiaListener {
    fun imprimeNoticias(): String {
        return "bufo leu as seguintes noticias: $ noticias"
    }

    fun imprimeNumeros(): String {
        return "bufo escutou os seguintes numeros: $ numeros"
    }
}