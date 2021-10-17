package chapter10methodcalls.num14replaceerrorcodewithexception.after

class Account(
    var balance: Int
) {
    // チェックなし例外（呼び出し元に委ねる）
    fun withdraw(amount: Int) {
        if (amount > balance) {
            throw IllegalArgumentException("出金額が多すぎる")
            // TODO: ここは表明(assert)にしてもよい
        }
        balance -= amount
    }

    // チェックつき例外
    @Throws (BalanceException::class)
    fun withdraw2(amount: Int) {
        if (amount > balance) {
            throw BalanceException()
        }
        balance -= amount
    }
}

class BalanceException: Exception()

fun main() {
    val account = Account(10_000)
    account.withdraw(20_000)
}