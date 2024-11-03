package com.samikhao.kotlincourse.lesson17.homework

open class Figure

open class Polygon(
    val angles: Int
): Figure()

class Circle(
    val r: Double
): Figure() {
    val pi = 3.14
    fun length() = 2 * pi * r
    fun square() = pi * r * r
}

class Triangle(
    angles: Int
): Polygon(3) {
    fun square(height: Double, side: Double) = 0.5 * height * side
}

class Quadrangle(
    angles: Int
): Polygon(4) {
    fun square(d1: Double, d2: Double, sin: Double) = 0.5 * d1 * d2 * sin
}