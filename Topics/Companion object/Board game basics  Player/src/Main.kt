class Player(val id: Int, val name: String, val hp: Int = 100) {
    companion object {
        var tempId = 0
        fun create(name: String): Player {
            tempId++
            return Player(tempId, name)
        }
    }
}