package chapter9conditional.num1decomposeconditional.after

import java.text.SimpleDateFormat
import java.util.*

class DecomposeConditional(
    private val winterRate: Double = 0.9,
    private val winterServiceCharge: Double = 0.9,
    private val summerRate: Double = 0.5
) {
    companion object {
        val format = SimpleDateFormat("yyyy-mm-dd")
    }

    final val SUMMER_START = format.parse("2021-05-01")
    final val SUMMER_END = format.parse("2021-10-31")

    fun calculateCharge(quantity: Int, date: Date): Double {
        return if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            quantity * winterRate * winterServiceCharge
        } else {
            quantity * summerRate
        }
    }
}