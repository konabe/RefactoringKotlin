package chapter9conditional.num5replacenestedconditionalwithguardclauses.before

class ReplaceNestedConditionalWithGuardClauses(
    private val isDead: Boolean = false,
    private val isSeparated: Boolean = false,
    private val isRetired: Boolean = false
) {
    companion object {
        fun deadAmount() = 1.0
        fun separatedAmount() = 2.0
        fun retiredAmount() = 3.0
        fun normalPayAmount() = 4.0
    }

    fun getPayAmount(): Double {
        var result = 0.0
        if (isDead) {
            result = deadAmount()
        } else {
            if (isSeparated) {
                result = separatedAmount()
            } else {
                if (isRetired) {
                    result = retiredAmount()
                } else {
                    result = normalPayAmount()
                }
            }
        }
        return result
    }
}