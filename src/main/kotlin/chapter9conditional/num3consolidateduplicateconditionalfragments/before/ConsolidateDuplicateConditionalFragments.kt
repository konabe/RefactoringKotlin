package chapter9conditional.num3consolidateduplicateconditionalfragments.before

interface Sendable {
    fun send()
}

class Sender: Sendable {
    override fun send() {
        println("send!")
    }
}

class ConsolidateDuplicateConditionalFragments(
    private val sendable: Sendable,
    private val isSpecialDeal: Boolean = false
) {
    var total = 0.0

    fun doSomething(price: Double) {
        if (isSpecialDeal()) {
            total = price * 0.95
            sendable.send()
        } else {
            total = price * 0.98
            sendable.send()
        }
    }

    private fun isSpecialDeal() = isSpecialDeal
}