import chapter11inheritance.num8extractinterface.before.Employee
import chapter11inheritance.num8extractinterface.before.Timesheet
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExtractInterfaceTest {
    @Test
    fun testNormal() {
        val timesheet = Timesheet()
        assertEquals(210_000.0, timesheet.charge(Employee(10_000, true), 20))
        assertEquals(200_000.0, timesheet.charge(Employee(10_000, false), 20))
    }
}