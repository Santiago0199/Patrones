package com.santiagoperdomo.patrones.observer

import java.util.*

class Sandwich: Observable() {

    var state: Boolean = false

    fun getReady(): Boolean {
        return state
    }

    fun setReady(state: Boolean) {
        this.state = state

        setChanged()
        notifyObservers()
    }
}