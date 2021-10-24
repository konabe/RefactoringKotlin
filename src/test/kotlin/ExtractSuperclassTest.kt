import chapter11inheritance.num7extractsuperclass.after.Department
import chapter11inheritance.num7extractsuperclass.after.Employee
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExtractSuperclassTest {
    @Test
    fun testNormal() {
        val emp1 = Employee("Abe", "001", 20_000)
        val emp2 = Employee("Tarou", "002", 30_000)
        val emp3 = Employee("Kisuke", "003", 40_000)
        val emp4 = Employee("Umu", "004", 0)
        val emps = listOf(emp1, emp2, emp3, emp4)
        val dep = Department(emps, "Tech")
//        assertEquals(90_000, dep.getTotalAnnualCost())
        assertEquals(90_000, dep.getAnnualCost())
    }
}