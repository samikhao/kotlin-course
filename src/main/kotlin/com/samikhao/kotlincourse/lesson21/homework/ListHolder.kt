package com.samikhao.kotlincourse.lesson21.homework

// Напишите класс ListHolder, который будет хранить список элементов типа T
// и иметь метод для добавления и получения всех элементов.

class ListHolder<T>(private val items: MutableList<T>) {
    fun addItem(item: T) {
        items.add(item)
    }

    fun getItems() = items
}