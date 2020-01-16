package com.santiagoperdomo.patrones.factory_builder.factory

import com.santiagoperdomo.patrones.factory_builder.Cheese
import com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass.Filling
import com.santiagoperdomo.patrones.factory_builder.Ham
import com.santiagoperdomo.patrones.factory_builder.Tomato

class FillingFactory {

    fun getFilling(fillingType: String): Filling? {
        if (fillingType == null) return null
        if (fillingType === "CHE") {
            return Cheese()
        } else if (fillingType === "TOM") {
            return Tomato()
        } else if (fillingType === "HAM") {
            return Ham()
        }
        return null
    }
}