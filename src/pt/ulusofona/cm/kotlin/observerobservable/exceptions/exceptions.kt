package pt.ulusofona.cm.kotlin.observerobservable.exceptions

import pt.ulusofona.cm.kotlin.observerobservable.classes.Gerador

class LeitorInexistenteException() : Exception()

// TODO : trocar para Correiodalusofona ou geradornumerico
class LimiteDeLeitoresAtingidoException(gerador: Gerador, nrLeitores: Int) :
    Exception("$gerador atingiu o número máximo de leitores: $nrLeitores.")