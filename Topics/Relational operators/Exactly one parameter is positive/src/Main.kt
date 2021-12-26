fun main() {
    val numbers = List(3) { readLine()!!.toIntOrNull() }
    println(numbers.count { it!! > 0 } == 1)
}