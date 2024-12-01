package com.samikhao.kotlincourse.lesson25.homework

// Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк,
// длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun longStrings(list: List<String>, num: Int): List<String> {
    require(list.isNotEmpty()) { "list is empty" }
    return list.filter { it.length >= num }
}

fun main() {
    val longStrings1 = fun (list: List<String>, num: Int): List<String> {
        require(list.isNotEmpty()) { "list is empty" }
        return list.filter { it.length >= num }
    }

    val longStrings2: (list: List<String>, num: Int) -> List<String> = {list, num ->
        require(list.isNotEmpty()) { "list is empty" }
        list.filter { it.length >= num }
    }

    val longStrings3 = { list: List<String>, num: Int ->
        require(list.isNotEmpty()) { "list is empty" }
        list.filter { it.length >= num }
    }

    val list = listOf("a", "bb", "ccc")
    val emptyList = listOf<String>()

    println(longStrings(list, 2))
    println(longStrings1(list, 2))
    println(longStrings2(list, 2))
    println(longStrings3(list, 2))
}