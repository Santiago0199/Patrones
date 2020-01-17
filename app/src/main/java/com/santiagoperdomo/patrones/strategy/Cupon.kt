package com.santiagoperdomo.patrones.strategy

class Cupon: Strategy {

    override fun processPayment(precio: Int): Int {
        return 80
    }

}