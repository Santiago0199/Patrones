package com.santiagoperdomo.patrones.factory_builder.builder

interface Ingredient {
    fun name(): String
    fun calories(): Int
    fun description(): String
    fun image(): String
}