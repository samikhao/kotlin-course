package com.samikhao.kotlincourse.lesson18.homework.figures

class Triangle(
    val side1: Double,
    val side2: Double,
    val sin: Double
): Shape() {
    fun area(side1: Double, side2: Double, sin: Double) = 0.5 * side1 * side2 * sin
}