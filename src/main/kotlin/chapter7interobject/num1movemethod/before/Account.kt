package chapter7interobject.num1movemethod.before

class Account(
    private val type: AccountType,
    private val daysOverdrawn: Int
    ) {
    fun overdraftCharge(): Double {
        return if (type.isPremium()) {
            var result = 10.0
            if ( daysOverdrawn > 0 ) {
                result += (daysOverdrawn - 7) * 0.85
            }
            result
        } else daysOverdrawn * 1.75
    }

    fun bankCharge(): Double {
        var result = 4.5
        if (daysOverdrawn > 0) result += overdraftCharge()
        return result
    }
}

class AccountType(
    private val isPremium: Boolean
) {
    fun isPremium(): Boolean = isPremium
}

fun main() {

}