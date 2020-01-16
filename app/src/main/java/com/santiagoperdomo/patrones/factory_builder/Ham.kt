package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Filling

class Ham : Filling() {

    override fun name(): String {
        return "Jamón"
    }

    override fun calories(): Int {
        return 194
    }

    override fun description(): String {
        return "Una loncha de jamón serrano"
    }

    override fun image(): String {
        return "R.drawable.ham"
    }
}
