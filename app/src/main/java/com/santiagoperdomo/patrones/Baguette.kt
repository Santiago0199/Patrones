package com.santiagoperdomo.patrones

class Baguette : Bread {

    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): String {
        return " : 250 kcal"
    }
}
