import chapter6method.num6splittemproraryvariable.problem.SplitTemporaryVariable
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SplitTemproraryVariableTest {
    @Test
    fun testNormal() {
        val obj1 = SplitTemporaryVariable(1.0, 1.0, 1.0, 1.0)
        assertEquals(0.5, obj1.getDistanceTravelled(1.0))
        val obj2 = SplitTemporaryVariable(2.0, 2.0, 1.0, 0.0)
        assertEquals(8.0, obj2.getDistanceTravelled(2.0))
    }
}