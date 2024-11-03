package com.samikhao.kotlincourse.lesson18.homework.printer

import com.samikhao.kotlincourse.lesson18.Background
import com.samikhao.kotlincourse.lesson18.Colors

class LaserPrinter : Printer() {
    override fun myPrint(string: String) {
        for (word in string.split(" ")) {
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}")
        }
    }
}