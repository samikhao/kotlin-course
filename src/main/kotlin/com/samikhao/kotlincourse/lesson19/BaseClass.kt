package com.samikhao.kotlincourse.lesson19

abstract class BaseClass(
    // это поле доступно в main() для чтения из класса ChildrenClass, потому что в ChildrenClass оно переназначается как public
    private val privateVal: String,
    // это поле недоступно в main(), потому что из-за protected его область видимости - BaseClass и его наследники
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // эта функция не может быть публичной, иначе она сделает публичным ProtectedClass, объявленный как protected
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // эта функция не может быть публичной или protected, иначе она сделает публичным PrivateClass, объявленный как private
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}