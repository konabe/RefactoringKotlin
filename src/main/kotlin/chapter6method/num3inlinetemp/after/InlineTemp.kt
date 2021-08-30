package chapter6method.num3inlinetemp.after

import chapter6method.Order

class InlineTemp(private val anOrder: Order) {
    fun isBasePriceHigher(): Boolean {
        return anOrder.basePrice > 1000
    }
}