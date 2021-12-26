import java.util.*

fun main() {
    println(Rainbow.findByRgb(readLine()!!))
}

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF");

    companion object {
        fun findByRgb(color: String): Boolean {
            for (enum in values()) {
                if (color.toLowerCase() == enum.color.lowercase(Locale.getDefault())) return true
            }
            return false
        }
    }

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}