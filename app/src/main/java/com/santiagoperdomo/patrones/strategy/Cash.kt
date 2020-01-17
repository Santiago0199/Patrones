package com.santiagoperdomo.patrones.strategy

class Cash: Strategy {

    override fun processPayment(precio: Int): Int {
        return 100
    }

}