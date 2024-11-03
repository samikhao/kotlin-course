package com.samikhao.kotlincourse.lesson18.homework.animals

import com.samikhao.kotlincourse.lesson18.Colors

class Cat : Animal() {
    override fun makeSound(color: String) {
        println("${color}Meow${Colors.RESET}")
    }
}