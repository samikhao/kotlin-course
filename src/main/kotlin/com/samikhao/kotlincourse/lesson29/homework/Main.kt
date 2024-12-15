package com.samikhao.kotlincourse.lesson29.homework

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun customTimeFormatter(temp: Temporal): String {
    return when (temp) {
        is LocalDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"))
        is OffsetDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX"))
        is LocalDate -> temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalTime -> temp.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is Instant -> ZonedDateTime.ofInstant(temp, ZoneId.systemDefault())
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"))
        else -> "unsupported type: $temp"
    }
}

fun formatISO(temp: Temporal): String {
    return when (temp) {
        is LocalDateTime -> temp.format(DateTimeFormatter.ISO_DATE_TIME)
        is ZonedDateTime -> temp.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temp.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        is LocalDate -> temp.format(DateTimeFormatter.ISO_DATE)
        is LocalTime -> temp.format(DateTimeFormatter.ISO_TIME)
        is Instant -> temp.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        else -> "unsupported type: $temp"
    }
}

fun main() {
    // Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    println("---------- task 1 ----------")
    val currentTime = Instant.now()
    println(currentTime)

    // Создай дату своего дня рождения
    println("\n---------- task 2 ----------")
    val myBirthday = LocalDate.of(2005, 11, 2)
    println(myBirthday)

    // Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода
    println("\n---------- task 3 ----------")
    val age = Period.between(myBirthday, LocalDate.now())
    println(age.years)

    // Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
    // содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
    // В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены
    // в переданном объекте. Обработай в методе все типы дат, которые знаешь.
    // Реализуй два варианта функции - с собственным форматированием и с форматами из ISO коллекции.
    println("\n---------- task 4 ----------")
    println(customTimeFormatter(LocalDateTime.now()))
    println(customTimeFormatter(ZonedDateTime.now()))
    println(customTimeFormatter(OffsetDateTime.now()))
    println(customTimeFormatter(LocalDate.now()))
    println(customTimeFormatter(LocalTime.now()))
    println(customTimeFormatter(Instant.now()))

    println(formatISO(LocalDateTime.now()))
    println(formatISO(ZonedDateTime.now()))
    println(formatISO(OffsetDateTime.now()))
    println(formatISO(LocalDate.now()))
    println(formatISO(LocalTime.now()))
    println(formatISO(Instant.now()))
}