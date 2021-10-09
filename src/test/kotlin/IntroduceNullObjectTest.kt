import chapter9conditional.num7introducenullobject.after.BillingPlan
import chapter9conditional.num7introducenullobject.after.Customer
import chapter9conditional.num7introducenullobject.after.PaymentHistory
import chapter9conditional.num7introducenullobject.after.Site
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IntroduceNullObjectTest {
    @Test
    fun testNormal() {
        val site = Site(Customer("Abe", BillingPlan(), PaymentHistory()))
        val customer = site.acquireCustomer()
        val plan = customer.plan
        val customerName = customer.name
        val weeksDelinquent = customer.acquireHistory().getWeeksDelinquentInLastYear()
        assertEquals("normal", plan.planName)
        assertEquals("Abe", customerName)
        assertEquals(4, weeksDelinquent)
    }

    @Test
    fun testNull() {
        val site = Site(null)
        val customer = site.acquireCustomer()
        val plan = customer.plan
        val customerName = customer.name
        val weeksDelinquent = customer.acquireHistory().getWeeksDelinquentInLastYear()
        assertEquals("basic", plan.planName)
        assertEquals("occupant", customerName)
        assertEquals(0, weeksDelinquent)
    }
}