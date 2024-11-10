package com.samikhao.kotlincourse.lesson19

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // этот аргумент доступен в main() несмотря на то, что это не поле, потому что publicVal - это public поле, которое наследуется из BaseClass
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // в main() доступна функция getAll() хотя её здесь нет, потому что getAll - public функция, наследуемая из BaseClass

    // проверь, что выводится на печать при вызове функции printText()
    // не происходит переопределение метода privatePrint(), потому что в BaseClass он объявлен как private
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}