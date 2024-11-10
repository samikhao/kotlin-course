package com.samikhao.kotlincourse.lesson20

abstract class ProgrammableEquipment() : PowerableEquipment(true), Programmable {
    override fun programAction(action: String) {
        println("$action scheduled")
    }

    override fun execute() {
        println("action is executing")
    }

    override fun powerOn() {
        super.powerOn()
    }

    override fun powerOff() {
        super.powerOff()
    }
}