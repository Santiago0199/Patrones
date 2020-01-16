package com.santiagoperdomo.patrones.factory_builder.factory

import com.santiagoperdomo.patrones.factory_builder.Beer
import com.santiagoperdomo.patrones.factory_builder.Coke
import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Drink

class DrinkFactory {

    fun getDrink(drinkType: String?): Drink? {
        if (drinkType == null) return null
        if (drinkType === "COK") {
            return Coke()
        } else if (drinkType === "BEE") {
            return Beer()
        }
        return null
    }
}