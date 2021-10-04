import chapter8organizingdata.num15replacetypecodewithstatestrategy.after.Employee
import chapter8organizingdata.num15replacetypecodewithstatestrategy.after.EmployeeType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceTypeCodeWithStateStrategyTest {

    @Test
    fun testNormal() {
        val employee = Employee(EmployeeType.ENGINEER, 2000, 0, 0)
        assertEquals(2000, employee.payAmount())
    }
}