package com.samikhao.kotlincourse.lesson19

class GameMachine(
    var color: String,
    val model: String,
    var isOn: Boolean,
    private var osLoaded: Boolean,
    private val availableGames: MutableList<String>,
    var withJoystick: Boolean,
    private var balance: Double,
    private var owner: String,
    var supportNumber: String
) {
    fun switchOn() {
        isOn = true
    }

    fun switchOff() {
        isOn = false
    }

    private fun uploadOs(): Boolean {
        // some actions
        return osLoaded
    }

    private fun shutdownOs() {}

    fun showAvailableGames(): List<String> {
        return availableGames
    }

    fun playGame(game: String) {}

    fun pay(price: Double) {
        balance += price
    }

    private fun openSafeAndGetCash(): Double {
        // open safe
        return balance
    }

    private fun payOut(prizeMoney: Double): Any {
        if (balance >= prizeMoney) {
            return prizeMoney
        }
        return "not enough money to pay out the winnings, call: $supportNumber"
    }
}