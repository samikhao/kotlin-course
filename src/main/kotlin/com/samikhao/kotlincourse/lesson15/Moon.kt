package com.samikhao.kotlincourse.lesson15

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        println(phase)
    }
}