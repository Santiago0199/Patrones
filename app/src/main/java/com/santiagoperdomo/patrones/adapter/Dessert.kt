package com.santiagoperdomo.patrones.adapter

class Dessert : OldDessert {

    private lateinit var mass: String
    private lateinit var cream: String
    private lateinit var fruit: String

    override fun setMass(mass: String) {
        this.mass = mass
    }

    override fun setCream(cream: String) {
        this.cream = cream
    }

    override fun setFruit(fruit: String) {
        this.fruit = fruit
    }

    override fun getMass(): String {
        return mass
    }

    override fun getCream(): String {
        return cream
    }

    override fun getFruit(): String {
        return fruit
    }


}