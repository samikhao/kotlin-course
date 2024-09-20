package com.samikhao.kotlincourse.lesson5


fun main() {
    println("task 1:")
    println(getAttenuation(100.0, 0.4))
    println(getAttenuation(100.0, null))

    println("\ntask 2:")
    println(getDeliveryPrice(100.0))
    println(getDeliveryPrice(null))

    println("\ntask 3:")
    checkAtmosphericPressure("report") // correct
    checkAtmosphericPressure(null) // throw exception
}

fun getAttenuation(soundIntensity: Double, attenuationCoef: Double?): Double {
    val defaultAttenuationCoef = 0.5
    return (attenuationCoef ?: defaultAttenuationCoef) * soundIntensity
}

fun getDeliveryPrice(price: Double?): Double {
    val defaultPrice = 50.0
    val deliveryPrice = 0.005
    return (price ?: defaultPrice) * deliveryPrice
}

fun checkAtmosphericPressure(indicators: String?) {
    indicators ?: throw Exception("missing required indicator")
}
