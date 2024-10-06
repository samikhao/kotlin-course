package com.samikhao.kotlincourse.lesson10

fun main() {
    // task 1
    val arr1 = arrayOf(1, 2, 3, 4, 5)

    // task 2
    val arr2 = Array(10) { "" }

    // task 3
    val arr3 = arrayOfNulls<Double>(5)
    for (i in arr3.indices) {
        arr3[i] = 2.0 * i
    }

    // task 4
    val arr4 = intArrayOf(5)
    for (i in arr4.indices) {
        arr4[i] = i * 3
    }

    // task 5
    val arr5: Array<String?> = arrayOf(null, "one", "two")

    // task 6
    val arr6 = arrayOf(1, 2, 3, 4, 5)
    val arr6Copy = arrayOfNulls<Int>(5)
    for (i in arr6.indices) {
        arr6Copy[i] = arr6[i]
    }

    // task 7
    val arr7 = arrayOf(1, 2, 3, 4, 5)
    val arr7b = arrayOf(1, 2, 3, 4, 5)
    val arr7c = arrayOfNulls<Int>(5)
    for (i in arr7.indices) {
        arr7c[i] = arr7[i] - arr7b[i]
    }

    // task 8
    val arr8 = arrayOf(1, 2, 3, 4, 5)
    println(searchFive(arr8, arr8.lastIndex))

    // task 9
    val arr9 = arrayOf(1, 2, 3, 4, 5)
    for (i in arr9) {
        print(i)
        if (i % 2 == 0) {
            println(" чётное")
        }
        else {
            println(" нечётное")
        }
    }

    // task 10
    val arr10 = arrayOf("abc", "def", "ghi")
    println(contains(arr10, "ef"))
}

fun searchFive(arr: Array<Int>, end: Int): Int {
    var res = -1
    var i = 0

    while (i <= end) {
        if (arr[i] == 5) {
            res = i
            break
        }
        i++
    }

    return res
}

fun contains(arr: Array<String>, str: String): String {
    var res = "not found"

    for (i in arr) {
        if (str in i) {
            res = i
            break
        }
    }

    return res
}
