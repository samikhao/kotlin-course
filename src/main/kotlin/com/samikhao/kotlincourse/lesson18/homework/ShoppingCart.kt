package com.samikhao.kotlincourse.lesson18.homework

class ShoppingCart(val items: MutableMap<String, Int>) {
    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(items: Map<String, Int>) {
        items.forEach { (id, amount) -> addToCart(id, amount) }
    }

    fun addToCart(items: List<String>) {
        items.forEach { addToCart(it, 1) }
    }

    override fun toString(): String {
        val width = items.keys.maxOfOrNull { it.length } ?: 1
        val res = StringBuilder()

        items.forEach { (id, amount) ->
            res.append("ID: %${width}s | Amount: %${width}s\n".format(id, amount))
        }

        res.append("TOTAL: ${items.size}  |  TOTAL AMOUNT: ${items.values.sum()}")
        return res.toString()
    }
}