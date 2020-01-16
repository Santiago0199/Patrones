package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Drink

class Beer : Drink {

    override fun name(): String {
        return "Cerveza"
    }

    override fun calories(): String {
        return " : 155 kcal"
    }
}
