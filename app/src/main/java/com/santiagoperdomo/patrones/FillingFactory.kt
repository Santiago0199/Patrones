package com.santiagoperdomo.patrones

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