package com.samikhao.kotlincourse.lesson24.homework

// Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
// NullPointerException
// ArrayIndexOutOfBoundsException
// ClassCastException
// NumberFormatException
// -IllegalArgumentException
// -IllegalStateException
// OutOfMemoryError
// StackOverflowError

fun count(uint: UInt) {}

fun main() {
    val nullInt = null
    // nullInt as Int

    val arr = listOf(1, 2)
    // arr[2]

    val num = 123
    // num as String

    val strNum = "12.3"
    // strNum.toInt()

    // val largeArray = IntArray(Int.MAX_VALUE)

    /*
    fun rec() {
        rec()
    }
    rec()
     */
}