import chapter10methodcalls.num5parameterizemethod.after.Employee
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ParameterizedMethodTest {
    @Test
    fun testNormal() {
        val employee = Employee(100.0, 100.0)
//        employee.tenPercentRaise()
        employee.raise(0.1)
        assert(110.0 <= employee.salary && employee.salary < 111.0)
        val employee2 = Employee(100.0, 100.0)
//        employee2.fivePercentRaise()
        employee2.raise(0.05)
        assert(105.0 <= employee2.salary && employee2.salary < 106.0)

        val employee3 = Employee(100.0, 100.0)
        assertEquals(3.0, employee3.baseCharge())
        val employee4 = Employee(100.0, 200.0)
        assertEquals(8.0, employee4.baseCharge())
        val employee5 = Employee(100.0, 300.0)
        assertEquals(15.0, employee5.baseCharge())
    }
}