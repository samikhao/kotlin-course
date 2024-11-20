package com.samikhao.kotlincourse.lesson23.homework

// Напишите функцию analyzeDataType, принимающую параметр типа Any
// Функция должна определить тип аргумента и вывести сообщение

fun analyzeDataType(arg: Any) {
    when (arg) {
        is String -> println("Это строка: $arg")
        is Int -> println("Это целое число: $arg")
        is List<*> -> println("Это список, количество элементов: ${arg.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${arg.size}")
        else -> println("Неизвестный тип данных")
    }
}

// Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка,
// если аргумент можно безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1.
// Используйте as? для безопасного приведения типа.

fun safeCastToList(list: Any): Int {
    return if (list as? List<*> != null) {
        list.size
    } else {
        -1
    }
}

// Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки,
// если аргумент можно привести к типу String. В случае, если аргумент равен null или не является строкой,
// функция должна возвращать 0.

fun getStringLengthOrZero(arg: Any?): Int {
    return if (arg is String) {
        arg.length
    } else {
        0
    }
}

// Создайте функцию, которая принимает параметр типа Any. Функция гарантированно ожидает число
// (в виде числа или строки, например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа.
// Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать
// в число через функцию toDouble() и возвести в квадрат.

fun square(num: Any): Double {
    if (num is Number) {
        return num.toDouble() * num.toDouble()
    } else {
        val num = (num as String).toDouble()
        return num * num
    }
}

// Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any
// и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений в списке.
// Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(list: List<Any>): Double {
    var res = 0.0

    for (i in list) {
        when (i) {
            is Int -> res += i
            is Double -> res += i
        }
    }

    return res
}

// Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>
// Если приведение успешно, функция должна напечатать все строки из списка,
// если элемент не является строкой то вывести предупреждение об этом.
// Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

fun tryCastToListAndPrint(list: Any) {
//    if (list is List<*>) {
//        list.forEach { if (it is String) println(it) }
//    }
    if (list as? List<*> != null) {
        list.forEach { if (it is String) println(it) else println("$it isn't a string")}
    } else {
        println("ERROR: $list isn't a list")
    }
}

fun main() {
    val str: Any = "54.2"
    val num: Any = 123
    val list: Any = listOf("aaa", "bbb", "ccc")
    val map: Any = mapOf("aaa" to 1, "bbb" to 2)
    val bool: Any = true

    println("---------- task 1 ----------")
    analyzeDataType(str)
    analyzeDataType(num)
    analyzeDataType(list)
    analyzeDataType(map)
    analyzeDataType(bool)

    println("\n---------- task 2 ----------")
    println(safeCastToList(list))
    println(safeCastToList(map))

    println("\n---------- task 3 ----------")
    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(str))
    println(getStringLengthOrZero(num))

    println("\n---------- task 4 ----------")
    println(square(num))
    println(square(str))

    println("\n---------- task 5 ----------")
    val list1: List<Any> = listOf(1, 3, 5.5, "aaa", true, 7)
    println(sumIntOrDoubleValues(list1))

    println("\n---------- task 6 ----------")
    tryCastToListAndPrint(list1)
    tryCastToListAndPrint(num)
    tryCastToListAndPrint(map)
}
