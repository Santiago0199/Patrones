package com.santiagoperdomo.patrones.criteria

class NoLocalFilter: Filter {

    override fun meetIngredients(ingredients: List<Ingredient>): List<Ingredient> {
        val noLocalList = ArrayList<Ingredient>()

        for (ingredient in ingredients){
            if(ingredient.local != "Producto local"){
                noLocalList.add(ingredient)
            }
        }
        return noLocalList
    }
}