package com.santiagoperdomo.patrones.criteria

class Ingredient(name: String, local: String, vegetarian: Boolean) {

    var name: String
    var local: String
    var vegetarian: Boolean

    init{
        this.name = name
        this.local = local
        this.vegetarian = vegetarian
    }

}