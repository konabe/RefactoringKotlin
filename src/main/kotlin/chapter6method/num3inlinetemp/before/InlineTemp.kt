package chapter6method.num3inlinetemp.before

import chapter6method.Order

class InlineTemp(private val anOrder: Order) {
    fun isBasePriceHigher(): Boolean {
        val basePrice = anOrder.basePrice
        return basePrice > 1000
    }
}