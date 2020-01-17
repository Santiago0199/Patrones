package com.santiagoperdomo.patrones.facade

class Facade {

    val apple: Fruit
    val mango: Fruit
    val pear: Fruit
    val lulo: Fruit

    init {
        apple = Apple()
        mango = Mango()
        pear = Pear()
        lulo = Lulo()
    }

    fun getNameApple(): String{
        return apple.getName()
    }

    fun getNamePear(): String{
        return pear.getName()
    }

    fun getNameMango(): String{
        return mango.getName()
    }

    fun getNameLulo(): String{
        return lulo.getName()
    }

}