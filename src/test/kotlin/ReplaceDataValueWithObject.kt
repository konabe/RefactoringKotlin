import chapter8organizingdata.num2replacedatavaluewithobject.after.Order
import chapter8organizingdata.num2replacedatavaluewithobject.after.numberOfOrdersFor
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceDataValueWithObject {
    @Test
    fun testNormal() {
        val orders = listOf<Order>(
            Order("A"),
            Order("B"),
            Order("C"),
            Order("A"),
            Order("A")
        )
        assertEquals(3, numberOfOrdersFor(orders, "A"))
        assertEquals(1, numberOfOrdersFor(orders, "C"))
        assertEquals(0, numberOfOrdersFor(orders, "D"))
    }

    @Test
    fun testEmpty() {
        assertEquals(0, numberOfOrdersFor(listOf(), "A"))
    }
}