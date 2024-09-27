package com.samikhao.kotlincourse.lesson7

fun main() {
    println("прямой диапазон")
    for (i in 1..5) {
        println(i)
    }
    println()

    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    println("\nобратный диапазон")
    for (i in 5 downTo 1) {
        println(i)
    }
    println()

    for (i in 10 downTo 1) {
        println(i - 2)
    }

    println("\nstep")
    for (i in 1..9 step 2) {
        println(i)
    }
    println()

    for (i in 1..20 step 3) {
        println(i)
    }

    println("\nuntil")
    for (i in 1 until 9) {
        println(i)
    }
    println()

    for (i in 3 until 15) {
        println(i)
    }

    println("\nwhile")
    var i = 1
    while (i <= 5) {
        println(i * i++)
    }
    println()


    i = 10
    while (--i > 5) {""}
    println(i)

    println("\ndo ... while")
    i = 5
    do {
        println(i--)
    } while (i > 0)
    println()

    i = 5
    do {
        println(i++)
    } while (i < 10)

    println("\nbreak")
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
    println()

    i = 1
    while (true) {
        println(i++)
        if (i == 10) {
            break
        }
    }

    println("\ncontinue")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
    println()

    i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i++)
    }

    println("\nвложенный цикл")
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
        println()
    }
}