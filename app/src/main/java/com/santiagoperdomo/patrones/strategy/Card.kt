package com.santiagoperdomo.patrones.strategy

class Card: Strategy {

    override fun processPayment(precio: Int): Int {
        return 120
    }

}