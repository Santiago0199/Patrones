package com.santiagoperdomo.patrones.factory_builder.builder

import com.santiagoperdomo.patrones.factory_builder.Cheese
import com.santiagoperdomo.patrones.factory_builder.Ham
import com.santiagoperdomo.patrones.factory_builder.Sliced

class SandwichBuilder {

    companion object{
        fun sandwichCheeseAndHam(): Sandwich {
            val s = Sandwich()
            s.addIngredient(Sliced())
            s.addIngredient(Cheese())
            s.addIngredient(Ham())
            return s
        }

        fun customSandwich(ingredients: ArrayList<Ingredient>): Sandwich {
            val s = Sandwich()
            for (i in ingredients){
                s.addIngredient(i)
            }
            return s
        }
    }
}