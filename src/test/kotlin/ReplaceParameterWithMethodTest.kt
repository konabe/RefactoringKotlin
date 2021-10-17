import chapter10methodcalls.num8replaceparameterwithmethod.after.ReplaceParameterWithMethod
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceParameterWithMethodTest {

    @Test
    fun testNormal() {
        val obj = ReplaceParameterWithMethod(200, 1000)
        assertEquals(20_000.0, obj.getPrice())

        val obj2 = ReplaceParameterWithMethod(100, 1000)
        assertEquals(5_000.0, obj2.getPrice())
    }
}