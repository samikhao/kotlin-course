package com.samikhao.kotlincourse.lesson8

fun main() {
    println("\n0 task:")
    println(changeString("Это невозможно выполнить за один день."))
    println(changeString("Я не уверен в успехе этого проекта."))
    println(changeString("Произошла катастрофа на сервере."))
    println(changeString("Этот код работает без проблем."))
    println(changeString("Удача"))

    println("\n1 task:")
    extractDataFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println("\n2 task:")
    println(identityMasking("4539 1488 0343 6467"))

    println("\n3 task:")
    println(formattingEmail("username@example.com"))

    println("\n4 task:")
    println(extractFileName("C:/Пользователи/Документы/report.txt"))

    println("\n5 task:")
    println(getAbbreviation("Объектно-ориентированное программирование"))

    println("\n+1 task:")
    println(capitalCase("converting STRINGS to cAPITAL case"))

    println("\n+2 task:")
    println(encrypt("KotlinW"))
    println(decrypt("oKltni W"))

    println("\n+3 task:")
    multiplicationTable(-13, -5)
}

fun changeString(str: String): String {
    return when {
        "невозможно" in str -> str.replace("невозможно", "совершенно точно возможно, просто требует времени")
        str.startsWith("Я не уверен") -> "$str, но моя интуиция говорит об обратном"
        "катастрофа" in str -> str.replace("катастрофа", "интересное событие")
        str.endsWith("без проблем") -> str.replace("без проблем", "с парой интересных вызовов на пути")
        " " !in str -> "Иногда, $str, но не всегда"
        else -> str
    }
}

fun extractDataFromLog(str: String){
    println(str.split(" ").takeLast(2).joinToString())
}

fun identityMasking(str: String): String {
    return "**** **** **** ${str.split(" ")[3]}"
}

fun formattingEmail(str: String): String {
    return str.replace("@", " [at] ").replace(".", " [dot] ")
}

fun extractFileName(str: String): String {
    return str.split("/").takeLast(1).joinToString()
}

fun getAbbreviation(str: String): String {
    var res = ""
    for (word in str.split("-", " ")) {
        res += word[0]
    }
    return res.uppercase()
}

fun capitalCase(str: String): String {
    var res = ""
    for (word in str.split(" ")) {
        res += word[0].uppercase() + word.substring(1).lowercase() + " "
    }
    return res.dropLast(1)
}

fun encrypt(str: String): String {
    var strVar = str
    if (str.length % 2 != 0) {
        strVar += " "
    }
    var res = ""
    for (i in 0 until (strVar.length) step 2) {
        res += strVar[i + 1]
        res += strVar[i]
    }
    return res
}

fun decrypt(str: String): String {
    var res = ""
    for (i in 0 until str.length step 2) {
        res += str[i + 1]
        res += str[i]
    }
    return res
}

fun getSign(num: Int): Int {
    return when {
        num < 0 -> -1
        num > 0 -> 1
        else -> 0
    }
}

fun multiplicationTable(x: Int, y: Int) {
    if (x * y == 0) throw Exception("Zero is not allowed")

    var signX = getSign(x)
    var signY = getSign(y)

    var w = "${x * y}".length + 1 // width
    if ("$x".length + 1 > w) {
        w = "$x".length + 1
    }

    print(" ".repeat(w)) // default indent
    var i = signX
    while (i != x + signX) {
        print("%${w}s".format(i))
        i += signX
    }
    println()

    var j = signY

    while (j != y + signY) {
        i = signX
        print("%${w}s".format(j))
        while (i != x + signX) {
            print("%${w}s".format(i * j))
            i += signX
        }
        j += signY
        println()
    }
}
