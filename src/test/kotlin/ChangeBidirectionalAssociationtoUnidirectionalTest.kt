import chapter8organizingdata.num8changebidirectionalassocitaiontoundirectional.after.Customer
import chapter8organizingdata.num8changebidirectionalassocitaiontoundirectional.after.Order
import org.junit.jupiter.api.Test

class ChangeBidirectionalAssociationtoUnidirectionalTest {
    @Test
    fun testNormal() {
        val customer = Customer(0.9)
        val order1 = Order(customer, 1000)
        assert(99.0 < order1.getDiscountedPrice(customer) && order1.getDiscountedPrice(customer) < 101.0)
        val order2 = Order(customer, 10000)
        assert(99.0 < order1.getDiscountedPrice(customer) && order1.getDiscountedPrice(customer) < 101.0)
        assert(999.0 < order2.getDiscountedPrice(customer) && order2.getDiscountedPrice(customer) < 1001.0)
    }
}