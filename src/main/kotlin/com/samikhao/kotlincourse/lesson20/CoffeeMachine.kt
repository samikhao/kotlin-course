package com.samikhao.kotlincourse.lesson20

abstract class CoffeeMachine : Powerable, Openable, WaterContainer, WaterConnection, Mechanical, LightEmitting, Programmable, Cleanable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override val capacity: Int
        get() = TODO("Not yet implemented")

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun connectToWaterSupply() {
        TODO("Not yet implemented")
    }

    override fun performMechanicalAction() {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun clean() {
        TODO("Not yet implemented")
    }
}