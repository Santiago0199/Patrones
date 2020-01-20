package com.santiagoperdomo.patrones.criteria

class LocalFilter: Filter {

    override fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient> {
        val localList = ArrayList<Ingredient>()

        for (ingredient in ingredients){
            if(ingredient.local == "Producto local"){
                localList.add(ingredient)
            }
        }
        return localList
    }

}