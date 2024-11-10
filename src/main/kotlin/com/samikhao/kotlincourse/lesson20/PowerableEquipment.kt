package com.samikhao.kotlincourse.lesson20

abstract class PowerableEquipment(
    var isOn: Boolean
) : Powerable {
    override fun powerOn() {
        isOn = true
        println("Device is switched on")
    }

    override fun powerOff() {
        isOn = false
        println("Device is switched off")
    }
}