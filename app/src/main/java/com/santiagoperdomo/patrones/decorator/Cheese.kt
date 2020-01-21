package com.santiagoperdomo.patrones.decorator

class Cheese(fastFoot: FastFoot): FastFootDecorator() {

    var fastFoot: FastFoot

    init {
        this.fastFoot = fastFoot
    }

    override fun getPrice(): Int {
        return fastFoot.getPrice() + 6
    }

    override fun getDescription(): String {
        return fastFoot.getDescription() + " con queso"
    }

}