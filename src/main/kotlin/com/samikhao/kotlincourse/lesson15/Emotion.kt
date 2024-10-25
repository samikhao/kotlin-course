package com.samikhao.kotlincourse.lesson15

class Emotion(
    var type: String,
    var intensity: Int
) {
    fun express() {
        if (type == "happy") {
            if (intensity < 3) {
                println("Description: You are not $type, you're just OK")
            }
            if (intensity > 7) {
                println("Description: You are not just $type, you're delighted")
            }
            else {
                println("Description: You're just $type")
            }
        }
    }
}