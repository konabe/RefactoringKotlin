package chapter6method.num2inlinemethod.before

class Rate(private val numberOfLateDeliveries: Int) {
    fun getRating(): Int {
        return if (moreThanFiveLateDeliveries()) 2 else 1
    }

    private fun moreThanFiveLateDeliveries(): Boolean {
        return numberOfLateDeliveries > 5
    }
}
