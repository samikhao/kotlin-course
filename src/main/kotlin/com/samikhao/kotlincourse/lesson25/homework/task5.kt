package com.samikhao.kotlincourse.lesson25.homework

// Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun List<Int>.uniqueNumbers(): List<Int> {
    return this.toSet().toList()
}

fun main() {
    val uniqueNumbers1 = fun List<Int>.(): List<Int> {
        return this.toSet().toList()
    }

    val uniqueNumbers2: List<Int>.() -> List<Int> = {
        this.toSet().toList()
    }

    val list1 = listOf(1, 1, 2, 2, 3)
    val list2 = listOf<Int>()

    println(list1.uniqueNumbers())
    println(list1.uniqueNumbers1())
    println(list1.uniqueNumbers2())
}