package com.santiagoperdomo.patrones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.santiagoperdomo.patrones.adapter.AdapterDessert
import com.santiagoperdomo.patrones.adapter.Dessert
import com.santiagoperdomo.patrones.adapter.NewDessert
import com.santiagoperdomo.patrones.adapter.OldDessert
import com.santiagoperdomo.patrones.factory_builder.builder.SandwichBuilder
import com.santiagoperdomo.patrones.strategy.Card
import com.santiagoperdomo.patrones.strategy.Cash
import com.santiagoperdomo.patrones.strategy.Cupon
import com.santiagoperdomo.patrones.strategy.Payment

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
        sandwich.getCalories()

        //Patron Strategy
        val process = "Card"

        when(process){
            "Card" -> Payment(Card())
            "Cash" -> Payment(Cash())
            "Cupon" -> Payment(Cupon())
            else -> Payment(Cupon())
        }

        //Patron adapter
        val oldDessert: OldDessert = Dessert()
        oldDessert.setMass("Chocolate")
        oldDessert.setCream("Vainilla")
        oldDessert.setFruit("Fresa")
        val newDessert: NewDessert = AdapterDessert(oldDessert)

        Log.d(TAG, "Torta de " + newDessert.getMass() + " con " + newDessert.getCream())

    }
}
