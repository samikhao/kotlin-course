package com.samikhao.kotlincourse.lesson21.homework

// Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.

class OddValidator : Validator<Int> {
    override fun check(int: Int) = int % 2 == 0
}