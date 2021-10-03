import chapter8organizingdata.num14replacetypewithsubclasses.after.Employee
import chapter8organizingdata.num14replacetypewithsubclasses.after.Engineer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceTypeWithSubclasses {
    @Test
    fun testNormal() {
        val engineer = Employee.create(Employee.ENGINEER)
        assert(engineer is Engineer)
    }
}