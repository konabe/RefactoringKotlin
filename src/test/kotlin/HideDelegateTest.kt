import chapter7interobject.num5hidedelegate.after.Department
import chapter7interobject.num5hidedelegate.after.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class HideDelegateTest {
    @Test
    fun testNormal() {
        val boss = Person("mario")
        val development = Department("C01", boss)
        boss.department = development
        val john = Person("john")
        john.department = development

//        assertNotNull(john.department)
//        assertEquals("mario", john.department?.manager?.name)
        assertEquals("mario", john.manager?.name)
    }
}