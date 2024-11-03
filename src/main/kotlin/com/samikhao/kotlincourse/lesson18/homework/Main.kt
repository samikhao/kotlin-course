package com.samikhao.kotlincourse.lesson18.homework

import com.samikhao.kotlincourse.lesson18.homework.animals.Bird
import com.samikhao.kotlincourse.lesson18.homework.animals.Cat
import com.samikhao.kotlincourse.lesson18.homework.animals.Dog
import com.samikhao.kotlincourse.lesson18.Colors
import com.samikhao.kotlincourse.lesson18.homework.printer.InkjetPrinter
import com.samikhao.kotlincourse.lesson18.homework.printer.LaserPrinter

fun main() {
    val animals = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound(Colors.CYAN) }

    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()
    laser.myPrint("I feel like i'm drowning")
    inkjet.myPrint("I feel like i'm drowning aaa bbb ccc ddd eee fff ggg hhh")

    val shoppingCart = ShoppingCart(mutableMapOf("aaa" to 1, "bbb" to 2, "ccc" to 4))
    shoppingCart.addToCart("aaa")
    shoppingCart.addToCart("ddd")
    println(shoppingCart.toString())

}