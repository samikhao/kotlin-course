package com.samikhao.kotlincourse.lesson12


fun main() {
    println(multiplyByTwo(7))
    println(isEven(3))
    printNumbersUntil(5)
    println(findFirstNegative(listOf(0, 4, -1, -3, 1)))
    processList(listOf("nest", null, "egg"))
    newDrawRectangle(24, 5)
    // oldDrawRectangle(24, 5)
    printMap(-12, 15)
}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun none() = Unit

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun str(string: String) = Unit

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun avg(list: List<Int>) = list.sum() / list.size

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun lengthNull(str: String?) = str?.length

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
// fun noneR(): Double?

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun noneList(list: List<Int>?) = Unit

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
// fun noneInt(num: Int): String?

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
//fun noneListStr(): List<String?>

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
//fun noneBool(str: String?, num: Int?): Boolean?

// task 1
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(num: Int) = num * 2

// task 2
// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(num: Int) = num % 2 == 0

// task 3
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// task 4
// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(list: List<Int>): Int? {
    for (i in list) {
        if (i < 0) return i
    }
    return null
}

// task 5
// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(list: List<String?>) {
    for (i in list) {
        if (i == null) return
        println(i)
    }
}

// refactoring
private fun throwException(value: Int, name: String) {
    if (value <= 0) throw IllegalArgumentException("$name должно быть положительным")
}

private fun borders(border: String, value: Int, symbol: String) {
    var line = border
    for (i in 1 until value - 1) {
        line += symbol
    }
    line += "$border\n"
    print(line)
}

fun newDrawRectangle(width: Int, height: Int) {
    throwException(width, "width")
    throwException(height, "height")

    // Верхняя граница
    borders("+", width, "-")

    // Боковые границы
    for (i in 1 until height - 1) {
        borders("|", width, " ")
    }

    // Нижняя граница
    borders("+", width, "-")
}

/*
fun oldDrawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}
*/

// extra task
private fun argException(size: Int, name: String) {
    if (size == 0) throw IllegalArgumentException("$name не должно быть равным нулю")
}

private fun range(size: Int): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}

private fun myFormat(size: Int, value: Any) {
    print("%${size}s".format(value))
}

private fun calc(m: Int, i: Int): String {
    return when {
        m % 2 == 0 -> if (m % 3 == 0) "." else "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}

fun printMap(xSize: Int, ySize: Int) {
    argException(xSize, "xSize")
    argException(ySize, "ySize")

    val formatterSize = " $xSize".length
    val xRange = range(xSize)
    val yRange = range(ySize)

    print(" ".repeat(formatterSize))
    for (i in xRange) {
        myFormat(formatterSize, i)
    }
    println()
    for (i in yRange) {
        myFormat(formatterSize, i)
        for (j in xRange) {
            val m = i * j
            val result = calc(m, i)
            myFormat(formatterSize, result)
        }
        println()
    }
}
