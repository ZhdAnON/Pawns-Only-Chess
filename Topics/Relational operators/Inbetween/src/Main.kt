fun main() {
    val numberA = readLine()!!.toInt()
    val numberB = readLine()!!.toInt()
    val numberC = readLine()!!.toInt()
    println(numberA in numberB..numberC || numberA in numberC..numberB)
}