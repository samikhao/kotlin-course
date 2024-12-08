package com.samikhao.kotlincourse.lesson27.homework

// Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
// Функция timeTracker должна возвращать затраченное время в миллисекундах.
// Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

fun timeTracker(f: () -> List<Int>): Long {
    val a = System.currentTimeMillis()
    f()
    val b = System.currentTimeMillis()

    return b - a
}

// Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в отформатированном виде.
fun info(person: Person) {
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Email: ${person.email}")
}

fun main() {
    // task 1
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    // println(timeTracker { myFunction() })

    // Создайте объект Employee и используйте apply для инициализации его полей email и department.
    val employee = Employee("Alex", 18, "ML engineer")
    employee.apply {
        email="aaa@itmo.ru"
        department="FLTC"
    }

    // Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.
    val person = Person("Alex", 18).also {
        it.email="aaa@itmo.ru"
        info(it)
    }
}