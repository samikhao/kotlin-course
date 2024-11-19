package com.samikhao.kotlincourse.lesson22.homework.extensions

// Реализуйте для класса String два метода расширения: encrypt и decrypt.
// Метод encrypt должен сдвигать каждый символ исходной строки на заданное число позиций вперед по таблице Unicode,
// а метод decrypt — на то же число позиций назад. Оба метода принимают один параметр base типа Int,
// который определяет величину сдвига. Протестируйте вашу реализацию, убедившись, что после шифрования
// и последующей расшифровки строка возвращается к исходному состоянию.
// Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.

fun String.encrypt(base: Int): String {
    var res = ""
    for (i in this) {
        res += i + base
    }
    return res
}

fun String.decrypt(base: Int): String {
    var res = ""
    for (i in this) {
        res += i - base
    }
    return res
}

// Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы.
// Напиши метод расширения строки, который будет принимать список имён пользователей и выводить
// в консоли эту строку побуквенно в столбик: имя автора и букву под ним.
// Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов, будет очень круто.

fun String.twitter(userList: List<String>) {
    val comment = "\uD83D\uDCAC" // 💬
    val retweet = "\uD83D\uDD01" // 🔁
    val like = "\u2764"          // ❤️
    val stats = "\uD83D\uDCCA"   // 📊
    val bookmark = "\uD83D\uDD16" // 🔖

    // val len = minOf(this.length, userList.size)

    for (i in 0 until length) {
        println("${userList[i % userList.size]} 02.11.2005")
        println(this[i].uppercase())
        println("$comment     $retweet     $like     $stats  $bookmark\n")
    }
}