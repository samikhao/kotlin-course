package com.samikhao.kotlincourse.lesson18.homework.logger

import com.samikhao.kotlincourse.lesson18.Background
import com.samikhao.kotlincourse.lesson18.Colors

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }
    fun log(logLevel: String, message: String?) {
        if (logLevel == "WARNING") {
            println("${Colors.YELLOW}$logLevel: $message${Colors.RESET}")
        }
        if (logLevel == "ERROR") {
            println("${Colors.WHITE}${Background.RED}$logLevel: $message${Colors.RESET}")
        }
    }
    fun log(messageList: List<String>) {
        messageList.forEach { log(it) }
    }
    fun log(exception: Exception) {
        log("ERROR", exception.message)
    }
}