package chapter6method.num4replacetempwithquery.after

import kotlin.math.roundToInt

class ReplaceTempWithQuery(
    private val quantity: Int,
    private val itemPrice: Int
) {

    fun getPrice(): Int {
        return (basePrice() * discountFactor()).roundToInt()
    }

    // 一時変数があるとスコープが制限されてしまうので、そのスコープの中に書きたくなってくる。
    // 結果、長いメソッドが出来上がりやすい。
    // - 問い合わせのメソッドを作ることで解決する。
    // - 一度だけ代入されている一時変数なら問題なく置き換えられる。
    private fun basePrice(): Int = quantity * itemPrice
    private fun discountFactor(): Double {
        return if (basePrice() > 1000) {
            0.95
        } else {
            0.98
        }
    }
}