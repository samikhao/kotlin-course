package com.samikhao.kotlincourse.lesson21.homework


// Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
// которая будет создавать карту из списков ключей и значений.
// Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.

fun <K, V> toMap (keys: List<K>, values: List<V>): Map<K, V> {
    val res = mutableMapOf<K, V>()
    val size = minOf(keys.size, values.size)

    for (i in 0 until size) {
        res[keys[i]] = values[i]
    }

    return res
}

// Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет
// возвращать средний элемент списка, если он существует.

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isNotEmpty()) {
        return list[list.size / 2]
    }
    return null
}

fun main() {
    println("----------- task 1 -----------")
    println(toMap(listOf<Int>(), listOf<String>()))
    println(toMap(listOf<Int>(1, 2), listOf<String>("a")))
    println(toMap(listOf<Int>(2), listOf<String>("b", "a")))

    println("\n----------- task 2 -----------")
    println(getMiddleElement(listOf()))
    println(getMiddleElement(listOf(1, 2, 3)))

    println("\n----------- task 3 -----------")
    val holder = ListHolder(mutableListOf<Int>())
    holder.addItem(505)
    print(holder.getItems())

    println("\n----------- tasks 4, 5 -----------")
    println(PhrasesToListOfStrings().transform("i'm going back to 505"))

    println("\n----------- task 6 -----------")
    val list1 = listOf("if it's a seven hour flight", "or a forty-five minute drive")
    println(PhrasesToListOfStrings().transformList(list1))

    println("\n----------- tasks 7, 8 -----------")
    println(StringValidator().check(""))
    println(StringValidator().check(" "))
    println(StringValidator().check(null))
    println(StringValidator().check("arctic monkeys"))

    println("\n----------- task 9 -----------")
    println(OddValidator().check(0))
    println(OddValidator().check(1))

    println("\n----------- task 10 -----------")
    println(ListValidator<Number>().check(listOf()))
    println(ListValidator<Number>().check(listOf(null)))
    println(ListValidator<Number>().check(listOf(5, 0, 5)))
    println(ListValidator<Number>().check(listOf(1, 2, 3)))
}