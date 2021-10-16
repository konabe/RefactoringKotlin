package chapter10methodcalls.num7preservewholeobject.before

class Room(
    private val daysTempRange: TempRange
) {
    fun withinPlan(plan: HeatingPlan): Boolean {
        val low = daysTempRange.low
        val high = daysTempRange.high
        return plan.withinRange(low, high)
    }
}

class HeatingPlan(
    private val range: TempRange
) {
    fun withinRange(low: Int, high: Int): Boolean {
        return low >= range.low && high <= range.high
    }
}

class TempRange(
    val low: Int,
    val high: Int
)