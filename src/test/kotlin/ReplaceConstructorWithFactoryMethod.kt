import chapter10methodcalls.num12replaceconstructorwithfactorymethod.after.Employee
import chapter10methodcalls.num12replaceconstructorwithfactorymethod.after.Engineer
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ReplaceConstructorWithFactoryMethod {
    @Test
    fun testNormal() {
        val engineer = Employee.create(Employee.ENGINEER)
        assertTrue(engineer is Engineer)
        val engineer2 = Employee.createEngineer()
        assertTrue(engineer2 is Engineer)
    }
}