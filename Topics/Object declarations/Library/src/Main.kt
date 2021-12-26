object Math {
    fun abs(number: Int): Int {
        return when {
            number < 0 -> -number
            number == 0 -> 0
            else -> number
        }
    }

    fun abs(number: Double): Double {
        return when {
            number < 0 -> -number
            number == 0.0 -> 0.0
            else -> number
        }
    }
}