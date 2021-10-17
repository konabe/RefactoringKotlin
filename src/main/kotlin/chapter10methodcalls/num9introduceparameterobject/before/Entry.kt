package chapter10methodcalls.num9introduceparameterobject.before

import java.util.*

class Entry(
    val value: Double,
    val chargeDate: Date
)

class Account(
    val entries: List<Entry>
) {
    fun getFlowBetween(start: Date, end: Date): Double {
        var result = 0.0
        entries.forEach {
            if (
                it.chargeDate == start
                || it.chargeDate == end
                || (it.chargeDate.after(start) && it.chargeDate.before(end))) {
                result += it.value
            }
        }
        return result
    }
}