package com.samikhao.kotlincourse.lesson24.homework

fun main() {
    // NullPointerException
    try {
        val nullInt = null
        nullInt as Int
    } catch (e: NullPointerException) {
        println("Ошибка NullPointerException: ${e.message}")
    }

    // ArrayIndexOutOfBoundsException
    try {
        val arr = listOf(1, 2)
        arr[2]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Ошибка ArrayIndexOutOfBoundsException: ${e.message}")
    }

    // ClassCastException
    try {
        val num = 123
        num as String
    } catch (e: ClassCastException) {
        println("Ошибка ClassCastException: ${e.message}")
    }

    // NumberFormatException
    try {
        val strNum = "12.3"
        strNum.toInt()
    } catch (e: NumberFormatException) {
        println("Ошибка NumberFormatException: ${e.message}")
    }

    // OutOfMemoryError
    try {
        val largeArray = IntArray(Int.MAX_VALUE)
    } catch (e: OutOfMemoryError) {
        println("Ошибка OutOfMemoryError: ${e.message}")
    }

    // StackOverflowError
    try {
        fun rec() {
            rec()
        }
        rec()
    } catch (e: StackOverflowError) {
        println("Ошибка StackOverflowError: ${e.message}")
    }
}
