package com.samikhao.kotlincourse.lesson15.extraTask

class Rack(val shelves: MutableList<Shelf>, val capacity: Int) {
    private var usedCapacity: Int = 34

    fun addShelf(): Boolean {
        if (usedCapacity + 1 <= capacity) {
            usedCapacity++
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        if (index in shelves.indices) {
            shelves.removeAt(index)
            return true
        }
        return false
    }

    fun addItem(item: String): Boolean {
        if (shelves.isEmpty()) {
            return false
        }

        var usedShelf = shelves[0]
        var minUsed = usedShelf.capacity - usedShelf.usedCapacity

        for (shelf in shelves) {
            if (shelf.capacity - shelf.usedCapacity > minUsed) {
                usedShelf = shelf
                minUsed = usedShelf.capacity - usedShelf.usedCapacity
            }
        }

        if (usedShelf.canAccommodate(item)) {
            return usedShelf.addItem(item)
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.isHere(item)) {
                return shelf.removeItem(item)
            }
        }
        return false
    }

    fun isInRack(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.isHere(item)) {
                return true
            }
        }
        return false
    }

    fun getShelves() = shelves.toList()
}