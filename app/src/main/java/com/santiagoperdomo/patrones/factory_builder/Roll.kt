package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Bread

class Roll : Bread() {

    override fun name(): String {
        return "Pan de pita"
    }

    override fun calories(): Int {
        return 169
    }

    override fun description(): String {
        return "Pan de pita recién horneado"
    }

    override fun image(): String {
        return "R.drawable.roll"
    }
}
