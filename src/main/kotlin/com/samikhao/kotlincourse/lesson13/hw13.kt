package com.samikhao.kotlincourse.lesson13

fun main() {
    val collection = listOf(22, 23, 24, 17)
    val strings = listOf("de", "bc", "cd")
// Проверить, что размер коллекции больше 5 элементов.
    println((collection.size > 5))

//Проверить, что коллекция пустая
    println(collection.isEmpty())

//Проверить, что коллекция не пустая
    println(collection.isNotEmpty())

//Взять элемент по индексу или создать значение если индекса не существует
    println(collection.getOrElse(2) { 5 })

//Собрать коллекцию в строку
    println(collection.joinToString(" "))

//Посчитать сумму всех значений
    println(collection.sum())

//Посчитать среднее
    println(collection.average())

//Взять максимальное число
    println(collection.max())

//Взять минимальное число
    println(collection.min())

//Взять первое число или null
    println(collection.firstOrNull())

//Проверить что коллекция содержит элемент
    println(collection.contains(3))

    // Отфильтровать коллекцию по диапазону 18-30
    println(collection.filter { it in 18..30 })

    //Выбрать числа, которые не делятся на 2 и 3 одновременно
    println(collection.filterNot { it % 2 == 0 && it % 3 == 0 })

    //Очистить текстовую коллекцию от null элементов
    println(collection.filterNotNull())

    //Преобразовать текстовую коллекцию в коллекцию длин слов
    println(collection.map { "$it".length })

    //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    println(strings.map { it to it.reversed() })

    //Отсортировать список в алфавитном порядке
    println(strings.sorted())

    //Отсортировать список по убыванию
    println(strings.sortedDescending())

    //Распечатать квадраты элементов списка
    println(collection.map { it * it })

    //Группировать список по первой букве слов
    //println(strings.associate { it[0] })

    //Очистить список от дублей
    //Взять первые 3 элемента списка
    //Взять последние 3 элемента списка
}
