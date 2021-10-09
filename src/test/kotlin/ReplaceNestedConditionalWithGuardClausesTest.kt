import chapter9conditional.num5replacenestedconditionalwithguardclauses.after.ReplaceNestedConditionalWithGuardClauses
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceNestedConditionalWithGuardClausesTest {
    @Test
    fun testNormal() {
        assertEquals(ReplaceNestedConditionalWithGuardClauses.deadAmount(),
            ReplaceNestedConditionalWithGuardClauses(
                isDead = true
            ).getPayAmount()
        )

        assertEquals(ReplaceNestedConditionalWithGuardClauses.separatedAmount(),
            ReplaceNestedConditionalWithGuardClauses(
                isSeparated = true
            ).getPayAmount()
        )

        assertEquals(ReplaceNestedConditionalWithGuardClauses.retiredAmount(),
            ReplaceNestedConditionalWithGuardClauses(
                isRetired = true
            ).getPayAmount()
        )

        assertEquals(ReplaceNestedConditionalWithGuardClauses.normalPayAmount(),
            ReplaceNestedConditionalWithGuardClauses().getPayAmount()
        )
    }
}