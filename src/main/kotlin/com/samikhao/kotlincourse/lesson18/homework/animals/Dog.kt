package com.samikhao.kotlincourse.lesson18.homework.animals

import com.samikhao.kotlincourse.lesson18.Colors

class Dog : Animal() {
    override fun makeSound(color: String) {
        println("${color}Bark${Colors.RESET}")
    }
}