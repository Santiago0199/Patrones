package com.santiagoperdomo.patrones.decorator

class Ketchup(fastFoot: FastFoot): FastFootDecorator() {

    var fastFoot: FastFoot

    init {
        this.fastFoot = fastFoot
    }

    override fun getPrice(): Int {
        return fastFoot.getPrice() + 4
    }

    override fun getDescription(): String {
        return fastFoot.getDescription() + " con ketchup"
    }
}