package com.samikhao.kotlincourse.lesson21.homework

// Напишите интерфейс Validator<T>, который будет проверять значение типа T на
// соответствие определенным условиям и возвращать булево значение (успешная или неуспешная проверка)

interface Validator<T> {
    fun check(value: T): Boolean
}