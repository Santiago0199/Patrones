package com.santiagoperdomo.patrones.criteria

interface Filter {

    fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient>

}