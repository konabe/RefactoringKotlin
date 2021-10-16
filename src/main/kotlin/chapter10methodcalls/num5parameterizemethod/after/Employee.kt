package chapter10methodcalls.num5parameterizemethod.after

import kotlin.math.min

class Employee(
    var salary: Double,
    private val lastUsage: Double
) {
    fun raise(factor: Double) {
        salary *= (1 + factor)
    }

    fun baseCharge(): Double {
        var result = min(lastUsage(), 100.0) * 0.03
        result += usageInRange(100.0, 200.0) * 0.05
        result += usageInRange(200.0, Double.MAX_VALUE) * 0.07
        return result
    }
    private fun usageInRange(start: Double, end: Double): Double {
        return if (lastUsage() > start) min(lastUsage(), end) - start
        else 0.0
    }

    private fun lastUsage(): Double = lastUsage
}