package com.santiagoperdomo.patrones.bridge

import android.util.Log

class HamburguesaCerrada: TipoHamburguesaInterface {

    override fun hacerHamburguesa(rellenoUno: String, rellenoDos: String) {
        Log.d("Hamburguesa Cerrada", "Hamburguesa cerrada rellena de $rellenoUno $rellenoDos")
    }

}