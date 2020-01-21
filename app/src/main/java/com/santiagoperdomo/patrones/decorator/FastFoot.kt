package com.santiagoperdomo.patrones.decorator

abstract class FastFoot {

    internal var price: Int = 0
    internal lateinit var description: String

    open fun getDescription(): String {
        return description
    }

    open fun getPrice(): Int {
        return price
    }

}