package com.samikhao.kotlincourse.lesson15

class Concert(
    var group: String,
    val location: String,
    var price: Int,
    val capacity: Int
) {
    private var ticketsSold: Int = 113

    fun info() {
        println("Group: $group\n Location: $location\n Price: $price")
    }

    fun buyTicket() {
        if (ticketsSold + 1 < capacity) {
            ticketsSold++
        }
        else {
            println("Sold out")
        }
    }
}