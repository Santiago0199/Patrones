package com.santiagoperdomo.patrones

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