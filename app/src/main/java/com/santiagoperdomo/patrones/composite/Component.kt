package com.santiagoperdomo.patrones.composite

interface Component {

    fun add(c: Component)
    fun getName(): String
    fun inflate()

}