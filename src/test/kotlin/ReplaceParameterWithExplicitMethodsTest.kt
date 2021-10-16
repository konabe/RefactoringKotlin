import chapter10methodcalls.num6replaceparameterwithexplicitmethods.after.Employee
import chapter10methodcalls.num6replaceparameterwithexplicitmethods.after.Engineer
import chapter10methodcalls.num6replaceparameterwithexplicitmethods.after.Salesman
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ReplaceParameterWithExplicitMethodsTest {
    @Test
    fun testNormal() {
//        val engineer = Employee.create(Employee.ENGINEER)
        val engineer = Employee.createEngineer()
        assertTrue(engineer is Engineer)
//        val salesman = Employee.create(Employee.SALESMAN)
        val salesman = Employee.createSalesman()
        assertTrue(salesman is Salesman)
    }
}