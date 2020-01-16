package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Bread

class Sliced : Bread() {

    override fun name(): String {
        return "Pan de molde"
    }

    override fun calories(): Int {
        return 80
    }

    override fun description(): String {
        return "Suave y tierno"
    }

    override fun image(): String {
        return "R.drawable.sliced"
    }
}
