fun main() {
    val numberA = readLine()!!.toInt()
    val numberB = readLine()!!.toInt()
    val numberC = readLine()!!.toInt()

    println(numberA + numberB == 20 || numberB + numberC == 20 || numberA + numberC == 20)
}