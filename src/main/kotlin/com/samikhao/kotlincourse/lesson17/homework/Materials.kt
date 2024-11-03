package com.samikhao.kotlincourse.lesson17.homework

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class AddOnTheBottom(): Materials() {
    fun add(material: String) {
        val extracted = extractMaterial()
        addMaterial(material)

        extracted.forEach { addMaterial(it) }
    }
}

class AddSpecial(): Materials() {
    fun add(materials: List<String>) {
        val extracted = extractMaterial()

        for (i in 0..extracted.size + materials.size) {
            if (i < materials.size) {
                addMaterial(materials[i])
            }
            if (i < extracted.size) {
                addMaterial(extracted[i])
            }
        }
    }
}

class AddAlphabetical(): Materials() {
    fun add(materials: List<String>) {
        val extracted = extractMaterial()
        val newList = extracted + materials

        newList
            .sorted()
            .forEach { addMaterial(it) }
    }
}

class AddMap(): Materials() {
    fun add(materials: Map<String, String>) {
        val extracted = extractMaterial()

        materials
            .keys
            .reversed()
            .forEach { addMaterial(it) }

        extracted.forEach { addMaterial(it) }

        materials
            .values
            .forEach { addMaterial(it) }
    }
}

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
}