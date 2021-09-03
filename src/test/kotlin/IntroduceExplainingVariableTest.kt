import chapter6method.num5introduceexplainingvariable.after.IntroduceExplainingVariable
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IntroduceExplainingVariableTest {

    @Test
    fun testNormal() {
        val obj1 = IntroduceExplainingVariable(0, 100)
        assertEquals(0, obj1.price())
        val obj2 = IntroduceExplainingVariable(100, 0)
        assertEquals(0, obj2.price())
        val obj3 = IntroduceExplainingVariable(100, 100)
        assertEquals(10100, obj3.price())
    }
}