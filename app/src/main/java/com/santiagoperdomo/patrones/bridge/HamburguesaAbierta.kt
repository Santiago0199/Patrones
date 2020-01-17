package com.santiagoperdomo.patrones.bridge

import android.util.Log

class HamburguesaAbierta: TipoHamburguesaInterface {

    override fun hacerHamburguesa(rellenoUno: String, rellenoDos: String) {
        Log.d("Hamburguesa Abierta", "Hamburguesa abierta rellena de $rellenoUno $rellenoDos")
    }

}