package com.samikhao.kotlincourse.lesson18.homework.animals

class Bird : Animal() {
    override fun makeSound(color: String) {
        println("${color}Tweet${Colors.RESET}")
    }
}