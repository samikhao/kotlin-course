package com.samikhao.kotlincourse.lesson18.homework.animals

import com.samikhao.kotlincourse.lesson18.Colors

class Bird : Animal() {
    override fun makeSound(color: String) {
        println("${color}Tweet${Colors.RESET}")
    }
}