package com.samikhao.kotlincourse.lesson18.homework.figures

import kotlin.math.PI

class Circle(
    val r: Double
): Shape() {
    fun area(r: Double) = 2 * PI * r
}