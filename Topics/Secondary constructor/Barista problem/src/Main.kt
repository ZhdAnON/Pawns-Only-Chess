class EspressoMachine(coffeeCapsulesCount: Int, totalCost: Float) {
    var costPerServing = totalCost / coffeeCapsulesCount

    constructor (coffeeBeansWeight: Float, totalCost: Float): this(
        coffeeCapsulesCount = coffeeBeansWeight.toInt(),
        totalCost = totalCost
    ) {
        this.costPerServing = totalCost / (coffeeBeansWeight / 10)
    }
}