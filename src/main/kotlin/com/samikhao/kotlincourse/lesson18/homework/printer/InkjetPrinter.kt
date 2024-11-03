package com.samikhao.kotlincourse.lesson18.homework.printer

import com.samikhao.kotlincourse.lesson18.Background
import com.samikhao.kotlincourse.lesson18.Colors

/*
Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно
цветными буквами на цветном фоне. Слова должны быть разноцветны.
Можно сделать список пар с цветом текста и фона и проходить циклически по этому списку при выводе текста.
Проверить работу на длинном тексте.
 */

class InkjetPrinter : Printer() {
    val colorPairs = listOf<Pair<String, String>>(
        Colors.CYAN to Background.BLACK,
        Colors.BLACK to Background.CYAN,
        Colors.RED to Background.BLUE,
        Colors.BLUE to Background.RED,
        Colors.WHITE to Background.GREEN,
        Colors.GREEN to Background.WHITE,
        Colors.PURPLE to Background.YELLOW,
        Colors.YELLOW to Background.PURPLE
    )

    override fun myPrint(string: String) {
        val list = string.split(" ")
        val len = colorPairs.size
        for (i in list.indices) {
            println("${colorPairs[i % len].first}${colorPairs[i % len].second}${list[i]}${Colors.RESET}")
        }
    }
}