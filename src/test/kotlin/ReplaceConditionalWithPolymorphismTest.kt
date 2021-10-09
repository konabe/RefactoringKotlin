import chapter9conditional.num6replaceconditionalwithpolymorphism.after.Employee
import chapter9conditional.num6replaceconditionalwithpolymorphism.after.Engineer
import chapter9conditional.num6replaceconditionalwithpolymorphism.after.Manager
import chapter9conditional.num6replaceconditionalwithpolymorphism.after.Salesman
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceConditionalWithPolymorphismTest {
    @Test
    fun testNormal() {
        val engineer = Employee(100, 20, 3, Engineer())
        assertEquals(100, engineer.payAmount())
        val salesman = Employee(100, 20, 3, Salesman())
        assertEquals(120, salesman.payAmount())
        val manager = Employee(100, 20, 3, Manager())
        assertEquals(103, manager.payAmount())
    }
}