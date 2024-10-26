package com.samikhao.kotlincourse.lesson15.extraTask

class Rack(val shelves: MutableList<Shelf>, val capacity: Int) {
    var usedCapacity: Int = shelves.size

    fun addShelf(): Boolean {
        if (usedCapacity + 1 <= capacity) {
            shelves.add(Shelf(capacity = 50, items = mutableListOf()))
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        if (index < usedCapacity) {
            shelves.removeAt(index)
            return true
        }
        return false
    }

    fun addItem(item: Item): Boolean {
        if (shelves.isEmpty()) {
            return false
        }
        return shelves
            .maxBy { it.freeSpace() }
            .addItem(item)
    }

    fun removeItem(item: Item): Boolean {
        for (shelf in shelves) {
            if (shelf.isHere(item)) {
                return shelf.removeItem(item)
            }
        }
        return false
    }

    fun isInRack(item: Item): Boolean {
        for (shelf in shelves) {
            if (shelf.isHere(item)) {
                return true
            }
        }
        return false
    }

    fun getAllShelves() = shelves.toList()

    fun printContent() {
        for (i in shelves.indices) {
            println("Info: Shelf #$i\n" +
                    "Capacity: ${shelves[i].capacity}\n" +
                    "Free space: ${shelves[i].freeSpace()}\n" +
                    "List of items: ${shelves[i].getAllItems()}\n\n")
        }
    }

    fun advancedRemoveShelf(index: Int): MutableList<Item> {
        val res = mutableListOf<Item>()
        var flag = false
        for (item in shelves[index].getAllItems()) {
            for (shelf in shelves.sortedBy { it.capacity }) {
                if (shelf.canAccommodate(item)) {
                    shelf.addItem(item)
                    flag = true
                    break
                }
            }
            if (!flag) {
                res.add(item)
            }
        }
        removeShelf(index)
        return res
    }
}