package com.santiagoperdomo.patrones.bridge

class Hamburguesa(rellenoUno: String, rellenoDos: String, tipoHamburguesaInterface: TipoHamburguesaInterface): HamburguesaAbstract(tipoHamburguesaInterface) {

    var rellenoUno: String
    var rellenoDos: String

    init {
        this.rellenoUno = rellenoUno
        this.rellenoDos = rellenoDos
    }

    override fun hacer() {
        tipoHamburguesaInterface.hacerHamburguesa(rellenoUno, rellenoDos)
    }

}