package com.santiagoperdomo.patrones.composite

import android.util.Log

class Composite(private var name: String): Component {

    var TAG = "COMPOSITE"
    val listNodes = ArrayList<Component>()

    override fun add(c: Component) {
        listNodes.add(c)
    }

    override fun getName(): String {
        return name
    }

    override fun inflate() {
        Log.d(TAG, name)

        for (c in listNodes){
            c.inflate()
        }
    }


}