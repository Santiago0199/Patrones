package com.santiagoperdomo.patrones.adapter

class AdapterDessert(oldDessert: OldDessert): NewDessert {


    private lateinit var mass: String
    private lateinit var cream: String

    init {
        setMass(oldDessert.getMass())
        setCream(oldDessert.getCream())
    }

    override fun setMass(mass: String) {
         this.mass =  mass
    }

    override fun setCream(cream: String) {
        this.cream = cream
    }

    override fun getMass(): String {
        return mass
    }

    override fun getCream(): String {
        return cream
    }

}