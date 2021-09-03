package chapter6method.num5introduceexplainingvariable.before

import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

class IntroduceExplainingVariable(
    private val quantity: Int,
    private val itemPrice: Int
) {
    fun price(): Int {
        return (quantity * itemPrice - max(0, quantity - 500) * itemPrice * 0.05 + min(quantity * itemPrice * 0.1, 100.0)).roundToInt()
    }
}