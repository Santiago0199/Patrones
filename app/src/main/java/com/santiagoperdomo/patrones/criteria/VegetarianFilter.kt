package com.santiagoperdomo.patrones.criteria

class VegetarianFilter: Filter {

    override fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient> {

        val vegetarianList = ArrayList<Ingredient>()

        for (ingredient in ingredients){
            if(ingredient.vegetarian){
                vegetarianList.add(ingredient)
            }
        }
        return vegetarianList
    }

}