import chapter9conditional.num1decomposeconditional.after.DecomposeConditional
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecomposeConditionalTest {
    @Test
    fun testNormal() {
        val obj = DecomposeConditional()
        assertEquals(5.0,
            obj.calculateCharge(
                10,
                DecomposeConditional.format.parse("2021-10-09")
            )
        )
        val obj2 = DecomposeConditional()
        assertEquals(8.1,
            obj2.calculateCharge(
                10,
                DecomposeConditional.format.parse("2022-01-09")
            )
        )
    }
}