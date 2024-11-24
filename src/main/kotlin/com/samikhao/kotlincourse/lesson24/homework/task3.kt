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
            is NullPointerException -> println("Поймано NullPointerException: Попытка обращения к null-объекту!")
            is ArrayIndexOutOfBoundsException -> println("Поймано ArrayIndexOutOfBoundsException: Обращение к неверному индексу массива!")
            is ClassCastException -> println("Поймано ClassCastException: Неправильное приведение типов!")
            is NumberFormatException -> println("Поймано NumberFormatException: Не удалось преобразовать строку в число!")
            is OutOfMemoryError -> println("Поймано OutOfMemoryError: Недостаточно памяти для выполнения операции!")
            is StackOverflowError -> println("Поймано StackOverflowError: Бесконечная рекурсия вызвала переполнение стека!")
            else -> println("Неизвестное исключение")
        }
    }
}
