package pt.ulusofona.cm.kotlin.observerobservable.interfaces

import pt.ulusofona.cm.kotlin.observerobservable.classes.Noticia

interface OnNoticiaListener : Registavel {

    fun onReceiveNoticia(n: Noticia) {
//        noticias.add(n)
    }

}

interface OnNumeroListener : Registavel {

    fun onReceiveNumero(n: Int) {
//        numeros.add(n)
    }

}



