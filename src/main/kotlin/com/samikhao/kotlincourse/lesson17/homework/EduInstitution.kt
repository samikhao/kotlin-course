package com.samikhao.kotlincourse.lesson17.homework

open class EduInstitution(val name: String)

class KinderGarden(
    name: String
): EduInstitution(name)

open class School(
    name: String,
    var pupilCount: Int
): EduInstitution(name) {
    fun printInfo() {
        println("$name has $pupilCount pupils")
    }
}

class University(
    name: String,
    var studentCount: Int
): EduInstitution(name) {
    fun printInfo() {
        println("$name has $studentCount students")
    }
}

class LiberalArtsSchool(
    name: String,
    pupilCount: Int
): School(name, pupilCount)

class MathSchool(
    name: String,
    pupilCount: Int
): School(name, pupilCount)