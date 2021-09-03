package chapter6method.num6splittemproraryvariable.after

import kotlin.math.min

class SplitTemporaryVariable(
    private val primaryForce: Double,
    private val secondaryForce: Double,
    private val mass: Double,
    private val delay: Double,
) {
    // 一時変数が複数回設定されるということは、そのメソッドの中で複数の責務を担っていることを意味する。
    fun getDistanceTravelled(time: Double): Double {
        // 一つの目的になるようにvalにして名前を変える
        val primaryAcc = primaryForce / mass
        val primaryTime = min(time, delay)
        var result = 0.5 * primaryAcc * primaryTime * primaryTime
        val secondaryTime = time - delay
        if (secondaryTime > 0) {
            val primaryVel = primaryAcc * delay
            val secondaryAcc = (primaryForce + secondaryForce) / mass
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime
        }
        return result
    }
}