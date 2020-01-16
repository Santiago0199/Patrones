package com.santiagoperdomo.patrones.factory_builder.interfaces_absstractclass

import com.santiagoperdomo.patrones.factory_builder.builder.Ingredient

abstract class Bread: Ingredient {
    abstract override fun name(): String
    abstract override fun calories(): Int
    abstract override fun description(): String
    abstract override fun image(): String
}

