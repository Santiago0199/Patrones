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
import com.santiagoperdomo.patrones.criteria.*
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
        criteria()
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
        when("Card"){
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

    fun criteria(){
        val ingredients = ArrayList<Ingredient>()
        ingredients.add(Ingredient("Cereal", "Producto local", true))
        ingredients.add(Ingredient("Jamon", "Producto no local", false))
        ingredients.add(Ingredient("Queso", "Producto local", true))
        ingredients.add(Ingredient("Carne", "Producto no local", false))
        ingredients.add(Ingredient("Pan", "Producto local", false))
        ingredients.add(Ingredient("Helado", "Producto local", false))

        var list: List<Ingredient>

        Log.d(TAG, "INGREDIENTES VEGETARIANOS")
        val vegetarians: Filter = VegetarianFilter()
        list = vegetarians.meetIngredients(ingredients)
        printList(list)

        Log.d(TAG, "INGREDIENTES LOCALES")
        val locals: Filter = LocalFilter()
        list = locals.meetIngredients(ingredients)
        printList(list)

        Log.d(TAG, "INGREDIENTES NO LOCALES")
        val noLocals: Filter = NoLocalFilter()
        list = noLocals.meetIngredients(ingredients)
        printList(list)

        Log.d(TAG, "INGREDIENTES VEGETARIANOS Y LOCALES")
        val vegetariansAndLocals: Filter = AndFilter(vegetarians, locals)
        list = vegetariansAndLocals.meetIngredients(ingredients)
        printList(list)

        Log.d(TAG, "INGREDIENTES VEGETARIANOS O NO LOCALES")
        val vegetariansAndNoLocals: Filter = OrFilter(vegetarians, noLocals)
        list = vegetariansAndNoLocals.meetIngredients(ingredients)
        printList(list)
    }

    fun printList(list: List<Ingredient>){
        for (i in list){
            Log.d(TAG, i.name + ", " + i.local + ", " + i.vegetarian)
        }
    }
}
