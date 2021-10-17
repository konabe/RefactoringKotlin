package chapter10methodcalls.num14replaceerrorcodewithexception.before

class Account(
    var balance: Int
) {
    fun withdraw(amount: Int): Int {
        if (amount > balance) {
            return -1
        } else {
            balance -= amount
            return 0
        }
    }
}