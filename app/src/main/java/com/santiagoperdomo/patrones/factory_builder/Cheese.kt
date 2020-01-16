package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Filling

class Cheese : Filling() {

    override fun name(): String {
        return "Queso"
    }

    override fun calories(): Int {
        return 52
    }

    override fun description(): String {
        return "Una loncha de queso francés"
    }

    override fun image(): String {
        return "R.drawable.cheese"
    }
}
