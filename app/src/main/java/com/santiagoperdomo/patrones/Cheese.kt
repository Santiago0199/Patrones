package com.santiagoperdomo.patrones

class Cheese : Filling {

    override fun name(): String {
        return "Queso"
    }

    override fun calories(): String {
        return " : 52 kcal"
    }
}
