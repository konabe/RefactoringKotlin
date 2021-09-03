package chapter6method.num6splittemproraryvariable.problem

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
        val primaryTime = min(time, delay)
        var result = getDistanceBy(primaryAcc(), .0, primaryTime)
        val secondaryTime = time - delay
        if (secondaryTime > 0) {
            result += getDistanceBy(secondaryAcc(), primaryVel(), secondaryTime)
        }
        return result
    }

    private fun getDistanceBy(acc: Double, vel: Double, time: Double) = vel * time + 0.5 * acc * time * time

    private fun primaryAcc() = primaryForce / mass
    private fun secondaryAcc() = (primaryForce + secondaryForce) / mass
    private  fun primaryVel() = primaryAcc() * delay
}