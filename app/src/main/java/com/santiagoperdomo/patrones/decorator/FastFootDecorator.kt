package com.santiagoperdomo.patrones.decorator

abstract class FastFootDecorator: FastFoot() {

    abstract override fun getPrice(): Int

    abstract override fun getDescription(): String

}