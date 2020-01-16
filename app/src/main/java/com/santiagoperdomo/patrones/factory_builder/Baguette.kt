package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Bread

class Baguette : Bread() {

    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): Int {
        return 250
    }

    override fun description(): String {
        return "Un baguette recien hecha y muy crujiente"
    }

    override fun image(): String {
        return "R.drawable.baguette"
    }
}
