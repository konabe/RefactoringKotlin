import chapter6method.Order
import chapter6method.num3inlinetemp.after.InlineTemp
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class InlineTempTest {
    @Test
    fun testInlineTemp() {
        val inlineTemp = InlineTemp(Order(1_000.0, 2_000.0))
        assertTrue(inlineTemp.isBasePriceHigher())
        val inlineTemp2 = InlineTemp(Order(1_000.0, 1_000.0))
        assertFalse(inlineTemp2.isBasePriceHigher())
        val inlineTemp3 = InlineTemp(Order(1_000.0, 500.0))
        assertFalse(inlineTemp3.isBasePriceHigher())
    }
}