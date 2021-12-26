class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (value in -92..57) {
                value
            } else when (name) {
                "Dubai" -> 30
                "Moscow" -> 5
                "Hanoi" -> 20
                else -> 0
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here

    val cities = listOf(firstCity, secondCity, thirdCity)
    var min = Int.MAX_VALUE
    var name = ""
    for (city in cities) {
        if (city.degrees < min) {
            min = city.degrees
            name = city.name
        }
    }
    print(
        if (cities.map { it.degrees }.count { it == min } > 1) "neither" else name
    )
}