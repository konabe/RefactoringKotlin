package chapter10methodcalls.num7preservewholeobject.after

class Room(
    private val daysTempRange: TempRange
) {
    fun withinPlan(plan: HeatingPlan): Boolean {
        return plan.withinRange(daysTempRange)
    }
}

class HeatingPlan(
    private val range: TempRange
) {
    fun withinRange(roomRange: TempRange): Boolean {
        return range.includes(roomRange)
    }
}

class TempRange(
    val low: Int,
    val high: Int
) {
    fun includes(arg: TempRange): Boolean {
        return arg.low >= low && arg.high <= high
    }
}