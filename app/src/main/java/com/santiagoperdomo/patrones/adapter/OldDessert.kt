package com.santiagoperdomo.patrones.adapter

interface OldDessert {

    fun setMass(mass: String)
    fun setCream(cream: String)
    fun setFruit(fruit: String)

    fun getMass(): String
    fun getCream(): String
    fun getFruit(): String

}