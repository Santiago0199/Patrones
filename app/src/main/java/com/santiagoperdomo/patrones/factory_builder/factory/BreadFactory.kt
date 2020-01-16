package com.santiagoperdomo.patrones.factory_builder.factory

import com.santiagoperdomo.patrones.factory_builder.Baguette
import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Bread
import com.santiagoperdomo.patrones.factory_builder.Roll
import com.santiagoperdomo.patrones.factory_builder.Sliced

class BreadFactory {

    fun getBread(breadType: String?): Bread? {
        if (breadType == null) return null
        if (breadType === "BAG") {
            return Baguette()
        } else if (breadType === "ROL") {
            return Roll()
        } else if (breadType === "SLI") {
            return Sliced()
        }
        return null
    }
}