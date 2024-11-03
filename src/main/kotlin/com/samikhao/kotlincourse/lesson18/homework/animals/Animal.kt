package com.samikhao.kotlincourse.lesson18.homework.animals

abstract class Animal {
    abstract fun makeSound(color: String)

    protected fun makeSound() {
        println("This animal makes no sound")
    }
}