package com.santiagoperdomo.patrones.factory_builder

import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Drink

class Coke : Drink {

    override fun name(): String {
        return "Coca cola"
    }

    override fun calories(): String {
        return " : 140 kcal"
    }
}
