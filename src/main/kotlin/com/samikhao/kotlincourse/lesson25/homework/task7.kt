package com.samikhao.kotlincourse.lesson25.homework

// Задание 7. Создай функцию расширения словаря из списка и множества, которая принимает все известные тебе типы
// (вспомни все что знаешь и под каждый тип создай аргумент) и возвращает строку.
// Функция должна распечатать все данные, которые тебе в ней доступны и вернуть
// конкатенацию всех данных которые ей доступны (порядок неважен). Конкатенация - это присоединение.
// Код должен быть отформатирован таким образом, чтобы легко читался.
// По аналогии с предыдущим заданием выполни трансформации.

fun Map<List<*>, Set<*>>.stringFromAll(
    byte: Byte,
    short: Short,
    int: Int,
    long: Long,
    float: Float,
    double: Double,
    char: Char,
    string: String,
    boolean: Boolean,
    list: List<String>,
    mutableList: MutableList<Int>,
    set: Set<Double>,
    mutableSet: MutableSet<Char>,
    map: Map<String, Int>,
    mutableMap: MutableMap<Int, String>
): String {
    println("byte: $byte")
    println("short: $short")
    println("int: $int")
    println("long: $long")
    println("float: $float")
    println("double: $double")
    println("char: $char")
    println("string: $string")
    println("boolean: $boolean")
    println("list: $list")
    println("mutableList: $mutableList")
    println("set: $set")
    println("mutableSet: $mutableSet")
    println("map: $map")
    println("mutableMap: $mutableMap")

    var res = byte.toString() +
            short.toString() +
            int.toString() +
            long.toString() +
            float.toString() +
            double.toString() +
            char.toString() +
            string +
            boolean.toString() +
            list.joinToString(",") +
            mutableList.joinToString(",") +
            set.joinToString(",") +
            mutableSet.joinToString(",") +
            map.entries.joinToString { "${it.key}:${it.value}" } +
            mutableMap.entries.joinToString { "${it.key}:${it.value}" }

    for ((keyList, valueSet) in this) {
        println("Key (List): $keyList")
        println("Value (Set): $valueSet")

        res += "Key: [${keyList.joinToString(", ")}], "

        res += "Value: {${valueSet.joinToString(", ")}} "
    }

    return res
}

fun main() {
    val stringFromAll1 = fun Map<List<*>, Set<*>>.(
        byte: Byte,
        short: Short,
        int: Int,
        long: Long,
        float: Float,
        double: Double,
        char: Char,
        string: String,
        boolean: Boolean,
        list: List<String>,
        mutableList: MutableList<Int>,
        set: Set<Double>,
        mutableSet: MutableSet<Char>,
        map: Map<String, Int>,
        mutableMap: MutableMap<Int, String>
    ): String {
        println("byte: $byte")
        println("short: $short")
        println("int: $int")
        println("long: $long")
        println("float: $float")
        println("double: $double")
        println("char: $char")
        println("string: $string")
        println("boolean: $boolean")
        println("list: $list")
        println("mutableList: $mutableList")
        println("set: $set")
        println("mutableSet: $mutableSet")
        println("map: $map")
        println("mutableMap: $mutableMap")

        var res = byte.toString() +
                short.toString() +
                int.toString() +
                long.toString() +
                float.toString() +
                double.toString() +
                char.toString() +
                string +
                boolean.toString() +
                list.joinToString(",") +
                mutableList.joinToString(",") +
                set.joinToString(",") +
                mutableSet.joinToString(",") +
                map.entries.joinToString { "${it.key}:${it.value}" } +
                mutableMap.entries.joinToString { "${it.key}:${it.value}" }

        for ((keyList, valueSet) in this) {
            println("Key (List): $keyList")
            println("Value (Set): $valueSet")

            res += "Key: [${keyList.joinToString(", ")}], "

            res += "Value: {${valueSet.joinToString(", ")}} "
        }

        return res
    }

    val stringFromAll2: Map<List<*>, Set<*>>.(
        byte: Byte,
        short: Short,
        int: Int,
        long: Long,
        float: Float,
        double: Double,
        char: Char,
        string: String,
        boolean: Boolean,
        list: List<String>,
        mutableList: MutableList<Int>,
        set: Set<Double>,
        mutableSet: MutableSet<Char>,
        map: Map<String, Int>,
        mutableMap: MutableMap<Int, String>
    ) -> String = { byte, short, int, long, float, double, char, string, boolean, list, mutableList, set, mutableSet, map, mutableMap ->
        println("byte: $byte")
        println("short: $short")
        println("int: $int")
        println("long: $long")
        println("float: $float")
        println("double: $double")
        println("char: $char")
        println("string: $string")
        println("boolean: $boolean")
        println("list: $list")
        println("mutableList: $mutableList")
        println("set: $set")
        println("mutableSet: $mutableSet")
        println("map: $map")
        println("mutableMap: $mutableMap")

        var res = byte.toString() +
                short.toString() +
                int.toString() +
                long.toString() +
                float.toString() +
                double.toString() +
                char.toString() +
                string +
                boolean.toString() +
                list.joinToString(",") +
                mutableList.joinToString(",") +
                set.joinToString(",") +
                mutableSet.joinToString(",") +
                map.entries.joinToString { "${it.key}:${it.value}" } +
                mutableMap.entries.joinToString { "${it.key}:${it.value}" }

        for ((keyList, valueSet) in this) {
            println("Key (List): $keyList")
            println("Value (Set): $valueSet")

            res += "Key: [${keyList.joinToString(", ")}], "

            res += "Value: {${valueSet.joinToString(", ")}} "
        }

        res
    }

    val ex1: Map<List<*>, Set<*>> = mapOf(listOf(1, 2, 3) to setOf("a", "b", "c"))

    val res0 = ex1.stringFromAll(
        10,
        20,
        30,
        100L,
        10.5f,
        20.5,
        'A',
        "Hello, Kotlin!",
        true,
        listOf("one", "two", "three"),
        mutableListOf(1, 2, 3),
        setOf(1.1, 2.2, 3.3),
        mutableSetOf('a', 'b', 'c'),
        mapOf("key1" to 1, "key2" to 2),
        mutableMapOf(1 to "value1", 2 to "value2")
    )
    println(res0)

    val res1 = ex1.stringFromAll1(
        10,
        20,
        30,
        100L,
        10.5f,
        20.5,
        'A',
        "Hello, Kotlin!",
        true,
        listOf("one", "two", "three"),
        mutableListOf(1, 2, 3),
        setOf(1.1, 2.2, 3.3),
        mutableSetOf('a', 'b', 'c'),
        mapOf("key1" to 1, "key2" to 2),
        mutableMapOf(1 to "value1", 2 to "value2")
    )
    println(res1)

    val res2 = ex1.stringFromAll2(
        10,
        20,
        30,
        100L,
        10.5f,
        20.5,
        'A',
        "Hello, Kotlin!",
        true,
        listOf("one", "two", "three"),
        mutableListOf(1, 2, 3),
        setOf(1.1, 2.2, 3.3),
        mutableSetOf('a', 'b', 'c'),
        mapOf("key1" to 1, "key2" to 2),
        mutableMapOf(1 to "value1", 2 to "value2")
    )
    println(res2)
}
