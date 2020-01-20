package com.santiagoperdomo.patrones.prototype

import java.util.*

class SequenceCache {

    companion object{

        val sequenceHashtable = Hashtable<String, Sequence>()

        fun loadCache() {
            val p = Prime()
            p.id = "1"
            sequenceHashtable[p.id] = p


            val f = Fibonacci()
            f.id = "2"
            sequenceHashtable[f.id] = f
        }

    }



}