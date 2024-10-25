package com.samikhao.kotlincourse.lesson15.extraTask

class Shelf(val capacity: Int, val items: MutableList<String>) {
    private var usedCapacity = items.sumOf { it.length }

    fun addItem(name: String): Boolean {
        if (canAccommodate(name)) {
            items.add(name)
            return true
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        if (isHere(name)) {
            items.remove(name)
            return true
        }
        return false
    }

    fun canAccommodate(name: String) = usedCapacity + name.length <= capacity

    fun isHere(name: String) = name in items

    fun getItems() = items.toList()
}