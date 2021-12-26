class Player(val id: Int, name: String) {
    companion object {
        private var defaultSpeed = 8
        const val maxSpeed = 13

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell % 3
        }
    }
}

fun calculatePlayerSpeed(cell: Int): Int {
    return Player.calcMovePenalty(cell)
}