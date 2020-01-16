package com.santiagoperdomo.patrones

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