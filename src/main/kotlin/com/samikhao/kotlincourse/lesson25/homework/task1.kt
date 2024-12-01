package com.samikhao.kotlincourse.lesson25.homework

// Задание 1. Создай константу в файле с текстом.
// Создай функцию, которая ничего не принимает и не возвращает и печатает в консоль текст константы.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь как функция работает

const val text = "aaa"

fun fun1() {
    println(text)
}

fun main() {
    val fun2 = fun () { println(text) }

    val fun3: () -> Unit = { println(text) }

    val fun4 = { println(text) }

    fun1()
    fun2()
    fun3()
    fun4()
}