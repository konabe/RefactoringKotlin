import chapter6method.num2inlinemethod.after.Rate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class InlineMethodTest {

    @Test
    fun testGetRating() {
        val rating3 = Rate(3)
        assertEquals(1, rating3.getRating())
    }

    @Test
    fun testGetRatingIfDeliveriesLess() {
        val rating10 = Rate(10)
        assertEquals(2, rating10.getRating())
    }
}