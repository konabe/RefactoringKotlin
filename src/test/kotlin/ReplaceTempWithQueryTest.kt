import org.junit.jupiter.api.Test
import chapter6method.num4replacetempwithquery.after.ReplaceTempWithQuery
import kotlin.test.assertEquals

class ReplaceTempWithQueryTest {

    @Test
    fun testNormal() {
        val obj = ReplaceTempWithQuery(5, 1_000)
        assertEquals(4750, obj.getPrice())
        val obj2 = ReplaceTempWithQuery(0, 10_000)
        assertEquals(0, obj2.getPrice())
        val obj3 = ReplaceTempWithQuery(1, 500)
        assertEquals(490, obj3.getPrice())
    }
}