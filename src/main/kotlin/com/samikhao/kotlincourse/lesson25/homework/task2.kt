package com.samikhao.kotlincourse.lesson25.homework

// Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
// С помощью require проверь, что список не пустой.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun avg(list: List<Int>): Double {
    require(list.isNotEmpty()) { "list is empty" }
    return list.average()
}

fun main() {
    val list1 = fun (list: List<Int>): Double {
        require(list.isNotEmpty()) { "list is empty" }
        return list.average()
    }

    val list2: (List<Int>) -> Double = {
        require(it.isNotEmpty()) { "list is empty" }
        it.average()
    }

    val list3 = { list: List<Int> ->
        require(list.isNotEmpty()) { "list is empty" }
        list.average()
    }

    val emptyList = listOf<Int>()
    val list = listOf(1, 2, 3)

    println(avg(list))
    println(list1(list))
    println(list2(list))
    println(list3(list))
}
