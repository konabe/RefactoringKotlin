import chapter11inheritance.num6extractsubclass.after.Employee
import chapter11inheritance.num6extractsubclass.after.LaborItem
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ExtractSubclassTest {
    @Test
    fun testNormal() {
        val employee = Employee(5)
        val jobItem =LaborItem(100, employee)
        assertNotNull(jobItem)
        assertEquals(5, jobItem.getUnitPrice())
    }
}