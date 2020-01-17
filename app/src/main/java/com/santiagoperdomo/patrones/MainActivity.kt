package com.santiagoperdomo.patrones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.santiagoperdomo.patrones.adapter.AdapterDessert
import com.santiagoperdomo.patrones.adapter.Dessert
import com.santiagoperdomo.patrones.adapter.NewDessert
import com.santiagoperdomo.patrones.adapter.OldDessert
import com.santiagoperdomo.patrones.bridge.Hamburguesa
import com.santiagoperdomo.patrones.bridge.HamburguesaAbierta
import com.santiagoperdomo.patrones.bridge.HamburguesaAbstract
import com.santiagoperdomo.patrones.bridge.HamburguesaCerrada
import com.santiagoperdomo.patrones.facade.Facade
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

        factory()
        builder()
        strategy()
        adapter()
        bridge()
        facade()
    }

    fun factory(){
        /*val fillingFactory = FillingFactory()
        val filling = fillingFactory.getFilling("TOM")
        Log.d(TAG, filling!!.name() + filling.calories())

        val breadFactory = BreadFactory()
        val bread = breadFactory.getBread("BAG")
        Log.d(TAG, bread!!.name() + bread.calories())*/
    }

    fun builder(){
        val sandwich = SandwichBuilder.sandwichCheeseAndHam()
        sandwich.getIngredients()
        sandwich.getCalories()
    }

    fun strategy(){
        val process = "Card"
        when(process){
            "Card" -> Payment(Card())
            "Cash" -> Payment(Cash())
            "Cupon" -> Payment(Cupon())
            else -> Payment(Cupon())
        }
    }

    fun adapter(){
        val oldDessert: OldDessert = Dessert()
        oldDessert.setMass("Chocolate")
        oldDessert.setCream("Vainilla")
        oldDessert.setFruit("Fresa")
        val newDessert: NewDessert = AdapterDessert(oldDessert)
        Log.d(TAG, "Torta de " + newDessert.getMass() + " con " + newDessert.getCream())
    }

    fun bridge(){
        val abierta: HamburguesaAbstract = Hamburguesa("Carne", "Queso", HamburguesaAbierta())
        abierta.hacer()

        val cerrada: HamburguesaAbstract = Hamburguesa("Pollo", "Tomate", HamburguesaCerrada())
        cerrada.hacer()
    }

    fun facade(){
        val facade = Facade()
        Log.d(TAG, facade.getNameApple())
    }
}
