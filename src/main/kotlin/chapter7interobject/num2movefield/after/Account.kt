package chapter7interobject.num2movefield.after

class Account(
    private val type: AccountType
) {
    fun interestForAmountDays(amount: Double, days: Int): Double {
        return interestRate * amount * days / 365
    }

    // 自己カプセル化を挟んで、ステップを小さくすることもできる。
    // あまりにも参照が多い場合はおすすめ。
    var interestRate: Double = 0.0
        get() = type.interestRate
}

// TODO: interestRateをこちらに移動する。
class AccountType(
    val interestRate: Double
)