import chapter6method.num8replacemethodwithmethodobject.after.Account
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceMethodWithMethodObjectTest {
    @Test
    fun testNormal() {
        val obj1 = Account()
        assertEquals(656 ,obj1.gamma(10, 5, 2))
        val obj2 = Account()
        assertEquals(70376 ,obj2.gamma(10, 5, 1000))
    }
}