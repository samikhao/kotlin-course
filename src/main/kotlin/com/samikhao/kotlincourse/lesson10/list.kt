package com.samikhao.kotlincourse.lesson10

fun main() {
    // task 1
    val list1: List<Int> = listOf()

    // task 2
    val list2 = listOf("hello", "world", "kotlin")

    // task 3
    val list3 = mutableListOf(1, 2, 3, 4, 5)

    // task 4
    list3.add(6)
    list3.add(7)
    list3.add(8)

    // task 5
    val list5 = mutableListOf("hello", "world", "kotlin")
    list5.remove("hello")

    // task 6
    val list6 = listOf(1, 2, 3, 4, 5)
    for (i in list6) {
        println(i)
    }

    // task 7
    val list7 = listOf("hello", "world", "kotlin")
    println(list7[1])

    // task 8
    list3[1] = 11
    println(list3)

    // task 9
    val list9 = mutableListOf("one", "two", "three")
    val list9b = mutableListOf("uno", "due", "tre")
    val list9c = mutableListOf<String>()
    for (i in list9) {
        list9c.add(i)
    }
    for (i in list9b) {
        list9c.add(i)
    }
    println(list9c)

    // task 10
    val list10 = listOf(1, 2, 3, 4, 5)
    var min = list10[0]
    var max = list10[0]

    for (i in list10) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println(min)
    println(max)

    // task 11
    val list11 = mutableListOf<Int>()
    for (i in list10) {
        if (i % 2 == 0) {
            list11.add(i)
        }
    }
    println(list11)
}