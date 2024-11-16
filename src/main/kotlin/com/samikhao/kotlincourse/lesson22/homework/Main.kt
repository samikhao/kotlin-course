package com.samikhao.kotlincourse.lesson22.homework

import com.samikhao.kotlincourse.lesson22.homework.extensions.decrypt
import com.samikhao.kotlincourse.lesson22.homework.extensions.encrypt
import com.samikhao.kotlincourse.lesson22.homework.extensions.funA
import com.samikhao.kotlincourse.lesson22.homework.extensions.funB
import com.samikhao.kotlincourse.lesson22.homework.extensions.funC
import com.samikhao.kotlincourse.lesson22.homework.extensions.funE
import com.samikhao.kotlincourse.lesson22.homework.extensions.revert
import com.samikhao.kotlincourse.lesson22.homework.extensions.twitter
import com.samikhao.kotlincourse.lesson22.homework.extensions.within

fun main() {
    println("---------- task 1, 2 ----------")
    println(listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89).funA())
    println('a'.funB(1, 2, true))
    println(mutableListOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 27).funC(2, 2))
    println(mapOf(2 to 1, 3 to 2, 4 to 3))
    println(null.funE())

    println("\n---------- task 3 ----------")
    println(Pair(null, 1).revert())
    println(Pair("sasha", true).revert())

    println("\n---------- task 4 ----------")
    var num = 123
    println(num.within(11.23, 115))
    println(num.toFloat().within(121, 1))

    println("\n---------- task 5 ----------")
    var str = "aleksandra"
    str = str.encrypt(1)
    println(str)
    println(str.decrypt(1))

    println("\n---------- task 6 ----------")
    val users = listOf("Lev Shevtsov", "Sergei", "сергей северин", "Daniil Puris", "саша\uD83E\uDD0D", "Daria Truefanoff", "Mazaeva")
    "kotlin".twitter(users)
}