package com.samikhao.kotlincourse.lesson15.extraTask

class Shelf(val capacity: Int, val items: MutableList<Item>) {
    fun addItem(item: Item): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(item: Item): Boolean {
        if (isHere(item)) {
            items.remove(item)
            return true
        }
        return false
    }

    fun canAccommodate(item: Item) = freeSpace() >= item.size

    fun isHere(item: Item) = item in items

    fun getAllItems() = items.toList()

    fun usedCapacity() = items.sumOf { it.size }

    fun freeSpace() = capacity - usedCapacity()
}