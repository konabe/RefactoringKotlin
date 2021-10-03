package chapter8organizingdata.num4changereferencetovalue.before

class Currency(code: String) {
    var code: String = code

    companion object {
        private val currencyArray = arrayListOf<Currency>()
        fun get(code: String): Currency {
            val currency = Currency(code)
            if (!currencyArray.contains(currency)) {
                currencyArray.add(currency)
            }
            return currencyArray.find { it.code == currency.code }!!
        }
    }
}

fun main() {
    val usd = Currency.get("USD")
}