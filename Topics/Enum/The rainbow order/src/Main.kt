import java.util.*

fun main() {
    val color = readLine()!!
    println(Rainbow.findColor(color))
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
        fun findColor(color: String): Int {
            var temp = 0
            for (enum in values()) {
                if (color.toLowerCase() == enum.color.lowercase(Locale.getDefault())) temp = enum.ordinal
            }
            return ++temp
        }
    }
}