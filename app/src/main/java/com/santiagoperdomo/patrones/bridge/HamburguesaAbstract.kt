package com.santiagoperdomo.patrones.bridge

abstract class HamburguesaAbstract(tipoHamburguesaInterface: TipoHamburguesaInterface) {

    protected var tipoHamburguesaInterface: TipoHamburguesaInterface

    init {
        this.tipoHamburguesaInterface = tipoHamburguesaInterface
    }

    abstract fun hacer()

}