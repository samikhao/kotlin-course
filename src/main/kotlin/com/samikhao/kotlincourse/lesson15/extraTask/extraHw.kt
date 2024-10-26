package com.samikhao.kotlincourse.lesson15.extraTask

fun main() {
    val rack = Rack(mutableListOf(), 50)
    rack.addShelf()
    println(rack.addItem(Item("Ball", 4)))
    rack.printContent()
}