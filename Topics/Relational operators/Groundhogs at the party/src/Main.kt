fun main() {
    val caps = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    println(
        message = when (isWeekend) {
            true -> "${caps in 15..25}"
            else -> "${caps in 10..20}"
        }
    )
}