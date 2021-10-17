package chapter10methodcalls.num9introduceparameterobject.after

import java.text.SimpleDateFormat
import java.util.*

class Entry(
    val value: Double,
    val chargeDate: Date
)

class Account(
    private val entries: List<Entry>
) {
    fun getFlowBetween(range: DateRange): Double {
        var result = 0.0
        entries.forEach {
            if (range.includes(it.chargeDate)) {
                result += it.value
            }
        }
        return result
    }
}

// Rangeパターン
// 変更不可にすることで、バグの侵入を避ける
class DateRange(
    val start: Date,
    val end: Date
) {
    fun includes(arg: Date): Boolean {
        return arg == start || arg == end || (arg.after(start) && arg.before(end))
    }
}

fun main() {
    val format = SimpleDateFormat("yyyy/MM/dd")
    val entries = listOf<Entry>(
        Entry(100.0, format.parse("2021/10/17")),
        Entry(20.0, format.parse("2021/10/18")),
        Entry(3.0, format.parse("2021/10/19")),
    )
    val account = Account(entries)
    val dateRange = DateRange(
        format.parse("2021/10/15"),
        format.parse("2021/10/18")
    )
    println(account.getFlowBetween(dateRange))
}