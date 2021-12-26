enum class DangerLevel(private val level: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    @JvmName("getLevel1")
    fun getLevel(): Int {
        return level
    }
}