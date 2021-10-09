package chapter9conditional.num2consolidateconditionalexpression.before

class ConsolidateConditionalExpression(
    private val seniority: Int = 3,
    private val monthsDisabled: Int = 1,
    private val isPartTime: Boolean = true,
    private val onVacation: Boolean = true,
    private val lengthOfService: Int = 10
) {
     fun disabilityAmount(): Double {
         if (seniority < 2) return 0.0
         if (monthsDisabled > 12) return 0.0
         if (isPartTime) return 0.0
         return 1000.0
     }

    fun restRate(): Double {
        if (onVacation()) {
            if (lengthOfService() > 10) {
                return 1.0
            }
        }
        return 0.5
    }
    private fun onVacation() = onVacation
    private fun lengthOfService() = lengthOfService
}