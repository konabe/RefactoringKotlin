import chapter8organizingdata.num7changeunidirectionalassociationtobidirectional.after.Customer
import chapter8organizingdata.num7changeunidirectionalassociationtobidirectional.after.Order
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class ChangeUndirectionalAssociationToBidirectionalTest {
    @Test
    fun testNormal() {
        val order1 = Order(null)
        assertNull(order1.customer)
        val customer = Customer()
        assertEquals(0, customer.orders.size)
        val order2 = Order(customer)
        assertNotNull(order2.customer)
        assertNull(order1.customer)
        assertEquals(1, customer.orders.size)
        assertContains(customer.orders, order2)
        customer.addOrder(order1)
        assertNotNull(order1)
        assertNotNull(order2)
        assertEquals(2, customer.orders.size)
        assertContains(customer.orders, order1)
        assertContains(customer.orders, order2)
    }
}