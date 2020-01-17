package com.santiagoperdomo.patrones.strategy

class Payment(strategy: Strategy) {

    val strategy: Strategy

    init {
        this.strategy = strategy
    }

}