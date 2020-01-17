package com.santiagoperdomo.patrones.adapter

interface NewDessert {

    fun setMass(mass: String)
    fun setCream(cream: String)

    fun getMass(): String
    fun getCream(): String

}