package com.samikhao.kotlincourse.lesson18.homework.animals

class Dog : Animal() {
    override fun makeSound(color: String) {
        println("${color}Bark${Colors.RESET}")
    }
}