package com.samikhao.kotlincourse.lesson17.homework

open class Furniture(
    val name: String,
    var price: Int
) {
    open fun printPrice() {
        println("$name costs $price euros")
    }
}

open class Beds(
    name: String,
    price: Int,
    val places: Int
): Furniture(name, price)

class SingleBed(
    name: String,
    price: Int,
    places: Int
): Beds(name, price, 1)

class KingSizeBed(
    name: String,
    price: Int,
    places: Int
): Beds(name, price, 2)

class Tables(
    name: String,
    price: Int
): Furniture(name, price)

class Chairs(
    name: String,
    price: Int
): Furniture(name, price)