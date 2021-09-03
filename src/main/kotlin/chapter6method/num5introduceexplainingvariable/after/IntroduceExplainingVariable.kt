package chapter6method.num5introduceexplainingvariable.after

import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

class IntroduceExplainingVariable(
    private val quantity: Int,
    private val itemPrice: Int
) {
    fun price(): Int {
        val basePrice = quantity * itemPrice
        val quantityDiscount = max(0, quantity - 500) * itemPrice * 0.05
        val shipping = min(basePrice * 0.1, 100.0)
        // Martin Fowler氏はメソッドの抽出のほうがよいらしい。
        // メソッドの抽出のほうが手間がかかる場合に採用。
        // メソッドにすればアクセス制御もしやすく、利用されやすい。
        return (basePrice - quantityDiscount + shipping).roundToInt()
    }
}