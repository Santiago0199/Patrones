package com.santiagoperdomo.patrones.criteria

class AndFilter(filterOne: Filter, filterTwo: Filter): Filter {

    var filterOne: Filter
    var filterTwo: Filter

    init {
        this.filterOne = filterOne
        this.filterTwo = filterTwo
    }

    override fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient> {
        val listFilterOne = filterOne.meetIngredients(ingredients)
        return filterTwo.meetIngredients(listFilterOne)
    }
}