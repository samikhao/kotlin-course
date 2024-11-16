package com.samikhao.kotlincourse.lesson22.homework.extensions

// Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.

fun List<Int>.funA(): Pair<Int, Int> {
    var a = 0
    var b = 0

    for (i in this.indices) {
        if (i % 2 == 0) {
            a += this[i]
        } else {
            b += this[i]
        }
    }

    return Pair(a, b)
}