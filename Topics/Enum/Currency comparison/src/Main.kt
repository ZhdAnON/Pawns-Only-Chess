fun main() {
    val (name1, name2) = readLine()!!.split(" ")
    println(Country.checkCurrency(name1, name2))
}

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");

    companion object {
        fun checkCurrency(name1: String, name2: String): Boolean {
            val temp1 = checkCountry(name1)
            val temp2 = checkCountry(name2)
            return if (temp1 != NULL && temp2 != NULL) temp1.currency == temp2.currency
            else false
        }

        private fun checkCountry(country: String): Country {
            for (value in values()) {
                if (value.country == country) return value
            }
            return NULL
        }
    }
}