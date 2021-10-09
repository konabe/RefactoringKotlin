import chapter9conditional.num2consolidateconditionalexpression.after.ConsolidateConditionalExpression
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConsolidateConditionalExpressionTest {
    @Test
    fun testNormal() {
        assertEquals(1000.0, ConsolidateConditionalExpression(
            3, 1, false
        ).disabilityAmount())
        assertEquals(0.0, ConsolidateConditionalExpression(
            0, 1, false
        ).disabilityAmount())
        assertEquals(0.0, ConsolidateConditionalExpression(
            3, 13, false
        ).disabilityAmount())
        assertEquals(0.0, ConsolidateConditionalExpression(
            3, 1, true
        ).disabilityAmount())
    }

    @Test
    fun testNormalAnd() {
        assertEquals(1.0, ConsolidateConditionalExpression(
            onVacation = true, lengthOfService = 20
        ).restRate())
        assertEquals(0.5, ConsolidateConditionalExpression(
            onVacation = false, lengthOfService = 20
        ).restRate())
        assertEquals(0.5, ConsolidateConditionalExpression(
            onVacation = true, lengthOfService = 0
        ).restRate())
    }
}