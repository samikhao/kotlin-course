package com.samikhao.kotlincourse.lesson6


fun main() {
    println("task 1")
    println(season(0))
    println(season(12))

    println("\ntask 2")
    println(humanAge(4.0))
    // println(humanAge(-1.0)) // throw an exception

    println("\ntask 3")
    println(means(4))
    println(means(-1))

    println("\ntask 4")
    println(bonusPoints(1234))
    // println(bonusPoints(-1000)) // throw an exception

    println("\ntask 5")
    println(fileType(".xlsx"))
    println(fileType(".dmg"))

    println("\ntask 6")
    println(temperatureConvert(66.0, 'C'))
    println(temperatureConvert(0.0, 'K'))

    println("\ntask 7")
    println(clothingSelection(36))
    println(clothingSelection(-1))

    println("\ntask 8")
    println(filmSelection(-22))
    println(filmSelection(22))
}

fun season(month: Int): String {
    return when (month) {
        12 -> "winter"
        in 1..2 -> "winter"
        in 3..5 -> "spring"
        in 6..8 -> "summer"
        in 9..11 -> "fall"
        else -> "enter a number from 1 to 12"
    }
}

fun humanAge(petAge: Double): Double {
    return if (petAge > 2) {
        2 * 10.5 + (petAge - 2) * 4
    }
    else if (petAge >= 0) {
        petAge * 10.5
    }
    else {
        throw Exception("age must be a non-negative number")
    }
}

fun means(routeLength: Int): String {
    return if (routeLength >= 5) {
        "автотранспорт"
    }
    else if (routeLength >= 1) {
        "велосипед"
    }
    else if (routeLength >= 0) {
        "пешком"
    }
    else {
        "route length must be a non-negative number"
    }
}

fun bonusPoints(purchaseAmount: Int): Int {
    return if (purchaseAmount < 0) {
        throw Exception("purchase amount must be a non-negative number")
    }
    else if (purchaseAmount < 1000) {
        purchaseAmount / 100 * 2
    }
    else {
        2 * 10 + (purchaseAmount - 1000) / 100 * 5
    }
}

fun fileType(fileExtension: String): String {
    return when (fileExtension) {
        ".txt" -> "Текстовый документ"
        ".png" -> "Изображение"
        ".xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

fun temperatureConvert(temperature: Double, unit: Char): String {
    return if (unit == 'C') {
        "${temperature * 9 / 5 + 32} F"
    }
    else if (unit == 'F') {
        "${(temperature - 32) * 5 / 9} C"
    }
    else {
        "wrong unit argument (enter C or F)"
    }
}

fun clothingSelection(temperature: Int): String {
    return if (temperature in -35 until 0) {
        "куртка и шапка"
    }
    else if (temperature <= 15) {
        "ветровка"
    }
    else if (temperature <= 35) {
        "футболка и шорты"
    }
    else {
        "stay home"
    }
}

fun filmSelection(age: Int): String {
    return if (age < 0) {
        "age must be a non-negative number"
    }
    else if (age < 13) {
        "детские"
    }
    else if (age < 18) {
        "подростковые"
    }
    else {
        "18+"
    }
}
