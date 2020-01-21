package com.santiagoperdomo.patrones.composite

import android.util.Log

class Node(private var name: String): Component {

    var TAG = "COMPOSITE"

    override fun add(c: Component) {
    }

    override fun getName(): String {
        return name
    }

    override fun inflate() {
        Log.d(TAG, name)
    }
}