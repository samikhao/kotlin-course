package com.samikhao.kotlincourse.lesson24.homework

fun main() {
    try {
        // NullPointerException
        val nullInt = null
        nullInt as Int

        // ArrayIndexOutOfBoundsException
        val arr = listOf(1, 2)
        arr[2]

        // ClassCastException
        val num = 123
        num as String

        // NumberFormatException
        val strNum = "12.3"
        strNum.toInt()

        // OutOfMemoryError
        val largeArray = IntArray(Int.MAX_VALUE)

        // StackOverflowError
        fun rec() {
            rec()
        }
        rec()
    } catch (e: Throwable) { // Ловим все исключения
        when (e) {
            is NullPointerException -> println("Поймано NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("Поймано ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("Поймано ClassCastException")
            is NumberFormatException -> println("Поймано NumberFormatException")
            is OutOfMemoryError -> println("Поймано OutOfMemoryError")
            is StackOverflowError -> println("Поймано StackOverflowError")
            else -> println("Неизвестное исключение")
        }
    }
}
