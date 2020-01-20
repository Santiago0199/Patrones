package com.santiagoperdomo.patrones.criteria

class OrFilter(filterOne: Filter, filterTwo: Filter): Filter {

    var filterOne: Filter
    var filterTwo: Filter

    init {
        this.filterOne = filterOne
        this.filterTwo = filterTwo
    }

    override fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient> {
        val listFilterOne = filterOne.meetIngredients(ingredients)
        val listFilterTwo = filterTwo.meetIngredients(ingredients)
        val listOr = ArrayList<Ingredient>()

        for (ingredient in ingredients){
            if(listFilterOne.contains(ingredient) || listFilterTwo.contains(ingredient)){
                listOr.add(ingredient)
            }
        }

        return listOr
    }
}