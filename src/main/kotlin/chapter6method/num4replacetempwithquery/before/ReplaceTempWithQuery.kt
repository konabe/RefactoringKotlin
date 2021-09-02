package chapter6method.num4replacetempwithquery.before

import kotlin.math.roundToInt

class ReplaceTempWithQuery(
    private val quantity: Int,
    private val itemPrice: Int
    ) {

    fun getPrice(): Int {
        val basePrice = quantity * itemPrice
        val discountFactor = if (basePrice > 1000) {
            0.05
        } else {
            0.98
        }
        return (basePrice * discountFactor).roundToInt()
    }
}