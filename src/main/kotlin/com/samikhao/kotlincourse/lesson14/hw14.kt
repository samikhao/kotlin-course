package com.samikhao.kotlincourse.lesson14

fun main() {
    println("---------task 1---------")
    // Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    // Определите среднее время выполнения теста.
    val testTime = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    println(testTime.values.average())

    println("\n---------task 2---------")
    // Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов
    // а значения - строка с метаданными. Выведите список всех тестовых методов.
    val metadata = mutableMapOf<String, String>("test1" to "ABC", "test2" to "BCD")
    println(metadata.keys)

    println("\n---------task 3---------")
    // В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val results = mutableMapOf("test1" to "passed", "test2" to "failed")
    results += "test3" to "passed"
    println(results)

    println("\n---------task 4---------")
    // Посчитайте количество успешных тестов в словаре с результатами.
    println(results.count { it.value == "passed" })

    println("\n---------task 5---------")
    // Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val bugTracking = mutableMapOf("bug1" to "found", "bug2" to "fixed")
    println(bugTracking.filterNot{ it.value == "fixed"})

    println("\n---------task 6---------")
    // Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки
    val webTest = mapOf("discord.com" to "dead", "vkontakte.ru" to "alive", "x.com" to "dead")
    webTest.forEach { println("${it.key} is ${it.value}") }

    println("\n---------task 7---------")
    // Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val response = mapOf("vk" to 200, "youtube" to 5000, "pinterest" to 20)
    println(response.filterValues { it > 100 })

    println("\n---------task 8---------")
    // В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
    // Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val testApi = mapOf("abc" to "OK", "bcd" to "OK")
    println(testApi.getOrDefault("abc", "untested"))
    println(testApi.getOrDefault("cde", "untested"))

    println("\n---------task 9---------")
    // Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
    // получите значение для "browserType". Ответ не может быть null.
    val testEnvironment = mapOf("browserType" to null)
    println(testEnvironment.getOrElse("browserType") { "error" })
    // println(testEnvironment.getOrDefault("browserType", "error")) // returns null

    println("\n---------task 10---------")
    // Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val apiVersions = mapOf("Minecraft PE" to "1.12.1", "Brawl Stars" to "3.9.1")
    val newApiVersions = apiVersions + ("Chess" to "2.1.1")
    println(newApiVersions)

    println("\n---------task 11---------")
    // Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
    // получите настройки для конкретной модели или верните настройки по умолчанию.
    val testSettings = mapOf("xiaomi" to "abc", "samsung" to "bcd", "iphone" to "cde")
    println(testSettings.getOrDefault("samsung", "aaa"))
    println(testSettings.getOrDefault("thl", "aaa"))

    println("\n---------task 12---------")
    // Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val testErrors = mapOf("DivisionByZero" to "divide by zero is forbidden")
    println(testErrors.containsKey("DivisionByZero"))
    println(testErrors.containsKey("IndexOutOfRange"))

    println("\n---------task 13---------")
    // Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    // а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val testCases = mapOf("Test01_1.1.1" to "Failed", "Test02_1.1.2" to "Skipped", "Test03_1.1.1" to "Passed")
    println(testCases.filterKeys { it.endsWith("1.1.1") })
}
