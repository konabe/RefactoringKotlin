package chapter9conditional.num2consolidateconditionalexpression.after

class ConsolidateConditionalExpression(
    private val seniority: Int = 3,
    private val monthsDisabled: Int = 1,
    private val isPartTime: Boolean = true,
    private val onVacation: Boolean = true,
    private val lengthOfService: Int = 10
) {
    fun disabilityAmount(): Double {
        if (isNotEligibleForDisability()) return 0.0
        return 1000.0
    }

    fun restRate() = if (onVacation() && lengthOfService() > 10) 1.0 else 0.5
    private fun onVacation() = onVacation
    private fun lengthOfService() = lengthOfService

    // メソッドの抽出
    private fun isNotEligibleForDisability() = seniority < 2 || monthsDisabled > 12 || isPartTime
}