package com.samikhao.kotlincourse.lesson18.homework.figures

class Square(
    val side: Double
): Shape() {
    fun area(side: Double) = side * side
}