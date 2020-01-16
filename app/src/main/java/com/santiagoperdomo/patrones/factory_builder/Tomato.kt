package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Filling

class Tomato : Filling() {

    override fun name(): String {
        return "Tomate"
    }

    override fun calories(): Int {
        return 20
    }

    override fun description(): String {
        return "Frescos y recién cogidos del huerto"
    }

    override fun image(): String {
        return "R.drawable.tomato"
    }
}
