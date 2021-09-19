package chapter7interobject.num2movefield.before

class Account(
    private val type: AccountType,
    private val interestRate: Double
) {
    fun interestForAmountDays(amount: Double, days: Int): Double {
        return interestRate * amount * days / 365
    }
}

class AccountType{
}
