package chapter9conditional.num3consolidateduplicateconditionalfragments.after

interface Sendable {
    fun send()
}

class Sender: Sendable {
    override fun send() {
        println("send!")
    }
}

// 例外処理で同じことをやるとき、finallyでできる。

class ConsolidateDuplicateConditionalFragments(
    private val sendable: Sendable = Sender(),
    private val isSpecialDeal: Boolean = false
) {
    var total = 0.0

    fun doSomething(price: Double) {
        if (isSpecialDeal()) {
            total = price * 0.95
        } else {
            total = price * 0.98
        }
        sendable.send()
    }

    private fun isSpecialDeal() = isSpecialDeal
}