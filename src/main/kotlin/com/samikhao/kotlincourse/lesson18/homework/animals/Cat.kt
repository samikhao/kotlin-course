package com.samikhao.kotlincourse.lesson18.homework.animals

class Cat : Animal() {
    override fun makeSound(color: String) {
        println("${color}Meow${Colors.RESET}")
    }
}