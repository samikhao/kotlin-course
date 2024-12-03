package com.samikhao.kotlincourse.lesson25.homework

// Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает число
// и возвращает список ключей, длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.
// По аналогии с предыдущим заданием выполни трансформации и проверки.

fun Map<String, Int>.correctKeys(num: Int): List<String> {
    val res = filter { it.key.length < it.value && it.key.length > num }
        .map { it.key }
    if (res.isNotEmpty()) {
        return res
    } else {
        throw Exception("IllegalState")
    }
}

fun main() {
    val correctKeys1 = fun Map<String, Int>.(num: Int): List<String> {
        val res = filter { it.key.length < it.value && it.key.length > num }
            .map { it.key }
        if (res.isNotEmpty()) {
            return res
        } else {
            throw Exception("IllegalState")
        }
    }

    val correctKeys2: Map<String, Int>.(num: Int) -> List<String> = {num ->
        val res = filter { it.key.length < it.value && it.key.length > num }
            .map { it.key }
        if (res.isNotEmpty()) {
            res
        } else {
            throw Exception("IllegalState")
        }
    }

    val badMap = mapOf("aaa" to 1)
    val emptyMap = mapOf<String, Int>()
    val goodMap = mapOf("aaa" to 4, "bbbb" to 5)

    println(goodMap.correctKeys(2))
    println(goodMap.correctKeys1(2))
    println(goodMap.correctKeys2(2))
}