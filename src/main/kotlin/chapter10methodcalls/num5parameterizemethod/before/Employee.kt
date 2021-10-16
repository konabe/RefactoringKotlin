package chapter10methodcalls.num5parameterizemethod.before

import kotlin.math.min

class Employee(
    var salary: Double,
    private val lastUsage: Double
) {
    fun tenPercentRaise() {
        salary *= 1.1
    }
    fun fivePercentRaise() {
        salary *= 1.05
    }

    fun baseCharge(): Double {
        var result = min(lastUsage(), 100.0) * 0.03
        if (lastUsage() > 100) {
            result += (min(lastUsage(), 200.0) - 100) * 0.05
        }
        if (lastUsage() > 200) {
            result += (lastUsage() - 200) * 0.07
        }
        return result
    }

    private fun lastUsage(): Double = lastUsage
}