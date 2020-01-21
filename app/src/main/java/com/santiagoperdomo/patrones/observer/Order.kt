package com.santiagoperdomo.patrones.observer

import android.util.Log
import java.util.*

class Order(private var sandwich: Sandwich): Observer {

    val TAG = "OBSERVER"

    override fun update(o: Observable?, arg: Any?) {
        if(sandwich.getReady()){
            sandwich.deleteObserver(this)
            Log.d(TAG, "Orden lista.")
        }else{
            Log.d(TAG, "No esta lista la orden.")
        }
    }

}