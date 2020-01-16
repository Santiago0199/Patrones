package com.santiagoperdomo.patrones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagoperdomo.patrones.factory_builder.builder.SandwichBuilder

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Patron Factory
        /*val fillingFactory = FillingFactory()
        val filling = fillingFactory.getFilling("TOM")
        Log.d(TAG, filling!!.name() + filling.calories())

        val breadFactory = BreadFactory()
        val bread = breadFactory.getBread("BAG")
        Log.d(TAG, bread!!.name() + bread.calories())*/

        //Patron Builder
        val sandwich = SandwichBuilder.sandwichCheeseAndHam()
        sandwich.getIngredients()
    }
}
