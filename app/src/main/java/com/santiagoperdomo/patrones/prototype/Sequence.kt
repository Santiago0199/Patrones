package com.santiagoperdomo.patrones.prototype

abstract class Sequence: Cloneable {

    lateinit var id: String
    var result: Long = 0

    public override fun clone(): Any {
        var clone: Any? = null

        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }

        return clone!!
    }

}