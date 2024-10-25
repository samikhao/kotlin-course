package com.samikhao.kotlincourse.lesson15

class Party(var location: String, var attendees: Int) {
    fun details() {
        println("location: $location, attendees: $attendees")
    }
}