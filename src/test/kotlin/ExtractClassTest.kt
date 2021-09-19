import chapter7interobject.num3extractclass.after.Person
import chapter7interobject.num3extractclass.after.TelephoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExtractClassTest {
    @Test
    fun testNormal() {
        // val person = Person("John", "123", "4567890")
        // val person = Person("John", "4567890", TelephoneNumber("123"))
        val person = Person("John", TelephoneNumber("123", "4567890"))
        assertEquals("(123)4567890", person.telephoneNumber)
        assertEquals("John", person.name)
        // person.officeNumber = "4445555"
        // assertEquals("(123)4445555", person.telephoneNumber)
        // person.areaCode = "000"
        // assertEquals("(000)4445555", person.telephoneNumber)
    }
}