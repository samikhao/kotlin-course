package com.samikhao.kotlincourse.lesson25.homework

// Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
// По аналогии с предыдущим заданием выполни трансформации и проверки.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun numberSum(num: Int): Int {
    var res = 0

    num
        .toString()
        .forEach { res += it.digitToInt() }

    return res
}

fun main() {
    val num = 123

    val numberSum1 = fun (num: Int): Int {
        var res = 0

        num
            .toString()
            .forEach { res += it.digitToInt() }

        return res
    }

    val numberSum2: (Int) -> Int = {
        var res = 0

        num
            .toString()
            .forEach { res += it.digitToInt() }

        res
    }

    val numberSum3 = { num: Int -> var res = 0

        num
            .toString()
            .forEach { res += it.digitToInt() }

        res
    }

    println(numberSum(num))
    println(numberSum1(num))
    println(numberSum2(num))
    println(numberSum3(num))
}