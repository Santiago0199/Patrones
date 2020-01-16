package com.santiagoperdomo.patrones.factory_builder.builder

import android.util.Log

class Sandwich {

    private val SANDWICH = "SANDWICH"
    private val ingredients = ArrayList<Ingredient>()

    fun addIngredient(ingredient: Ingredient){
        ingredients.add(ingredient)
    }

    fun getCalories(){
        var calories = 0
        for (i in ingredients){
            calories = i.calories()
        }
        Log.d(SANDWICH, "Las colorias del sandwich son $calories")
    }

    fun getIngredients(){
        for (i in ingredients){
            Log.d(SANDWICH,i.name() + ": " + i.calories())
        }
    }

}