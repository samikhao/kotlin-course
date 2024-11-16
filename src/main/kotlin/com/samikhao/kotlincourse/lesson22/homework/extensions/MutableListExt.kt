package com.samikhao.kotlincourse.lesson22.homework.extensions

// Создайте функцию-расширение для класса изменяемого списка элементов с дженериком,
// которая принимает два аргумента: один типа дженерик, допускающий null, и другой типа число,
// и возвращает значение типа дженерик, допускающий null.

fun <T> MutableList<T>.funC(arg1: T?, arg2: Number): T? {
    return this[0]
}