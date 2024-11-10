package com.samikhao.kotlincourse.lesson20

import java.io.InputStream

abstract class MechanicalClock : Timable, Mechanical, SoundEmitting {
    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }

    override fun performMechanicalAction() {
        TODO("Not yet implemented")
    }

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }
}