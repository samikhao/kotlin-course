package com.samikhao.kotlincourse.lesson21.homework

// Создайте интерфейс Mapper<T, R>, который будет определять метод
// для преобразования элементов типа T в элементы типа R.

// Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать
// список элементов типа T в список элементов типа R.
// Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.

interface Mapper<T, R> {
    fun transform(elem: T): R

    fun transformList(list: List<T>): List<R>
}