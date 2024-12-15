package com.samikhao.kotlincourse.lesson28.homework

import java.io.File

fun main() {
    // Создайте текстовый файл workspace/task1/example.txt
    // запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл
    println("---------- task 1 ----------")
    var path = "workspace/task1/example.txt"
    File(path).apply {
        parentFile.mkdirs()
        writeText("Hello, Kotlin!")
        if (exists()) {
            println("file exists")
        } else {
            println("file doesn't exist")
        }
    }

    // Создайте директорию workspace/task2/testDir
    // проверьте, является ли она директорией, и выведите её абсолютный путь.
    println("\n---------- task 2 ----------")
    path = "workspace/task2/testDir"
    File(path).apply {
        mkdirs()
        if (isDirectory) {
            println("it's a directory")
            println(absolutePath)
        } else {
            println("it's not a directory")
        }
    }

    // Создайте директорию workspace/task3/structure.
    // Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
    // Проверьте, что myDir действительно содержит эти поддиректории.
    println("\n---------- task 3 ----------")
    path = "workspace/task3/structure"

    val myDir = File("$path/myDir")
    val subDir1 = File(myDir, "subDir1").apply { mkdirs() }
    val subDir2 = File(myDir, "subDir2").apply { mkdirs() }

    if (subDir1.exists() && subDir2.exists()) {
        println("myDir contains subDir1 and subDir2")
    } else {
        println("myDir doesn't contain expected subdirectories")
    }

    // Создайте директорию workspace/task4/temp.
    // Внутри директории temp создайте несколько вложенных файлов и директорий.
    // Удалите директорию workspace/task4 со всем содержимым
    println("\n---------- task 4 ----------")
    path = "workspace/task4/temp"
    val temp = File(path)

    val file1 = File(temp, "file1.txt")
    val file2 = File(temp, "file2.txt")
    val dir1 = File(temp, "subDir1")
    val dir2 = File(dir1, "subDir2")

    dir2.mkdirs()
    file1.writeText("this is file 1")
    file2.writeText("this is file 2")

    val workspaceTask4 = File("workspace/task4")
    if (workspaceTask4.deleteRecursively()) {
        println("directory workspace/task4 is successfully deleted")
    } else {
        println("error")
    }

    // Создайте файл workspace/task5/config/config.txt
    // запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения
    println("\n---------- task 5 ----------")
    path = "workspace/task5/config/config.txt"
    var file = File(path).apply { mkdirs() }

    val params = listOf(
        "aaa=111",
        "bbb=222",
        "ccc=333",
        "ddd=444"
    )

    file.writeText(params.joinToString("\n"))

    if (file.exists()) {
        println("values:")
        file.readLines().forEach { line ->
            val parts = line.split("=")
            if (parts.size == 2) {
                val value = parts[1]
                println(value)
            }
        }
    } else {
        println("file $file is not found")
    }

}