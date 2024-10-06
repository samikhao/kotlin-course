package com.samikhao.kotlincourse.lesson10

fun main() {
    // task 1
    val set1 = setOf<Int>()

    // task 2
    val set2 = setOf(1, 2, 3)

    // task 3
    val set3 = mutableSetOf("kotlin", "java", "scala")

    // task 4
    set3.add("swift")
    set3.add("go")

    // task 5
    val set5 = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(2)

    // task 6
    val set6 = setOf(1, 2, 3, 4, 5)
    for (i in set6) {
        println(i)
    }

    // task 7
    println(searchString(set3, "java"))
    println(searchString(set3, "python"))

    // task 8
    val set8a = setOf("one", "two", "three")
    val set8b = setOf("uno", "due", "three")
    val set8c = mutableSetOf<String>()

    for (i in set8a) {
        set8c += i
    }
    for (i in set8b) {
        set8c += i
    }

    println(set8c)

    // task 9
    val set9a = setOf(1, 2, 3)
    val set9b = setOf(3, 4, 5)
    val set9c = mutableSetOf<Int>()

    for (i in set9a) {
        for (j in set9b) {
            if (i != j) { break }
            set9c += i
        }
    }

    println(set9c)

    // task 10
    val set10a = setOf("one", "two", "three")
    val set10b = setOf("uno", "due", "three")
    val set10c = mutableSetOf<String>()
    var flag = true

    for (i in set10a) {
        for (j in set10b) {
            if (i == j) {
                flag = false
                break
            }
        }
        if (flag) {
            set10c += i
        }
        flag = true
    }

    println(set10c)

    // task 11
    val set11 = setOf("one", "two", "three")
    val list11 = mutableListOf<String>()

    for (i in set11) {
        list11.add(i)
    }
}

fun searchString(set: Set<String>, str: String): Boolean {
    var flag = false

    for (i in set) {
        if (i == str) {
            flag = true
            break
        }
    }

    return flag
}