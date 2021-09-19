import chapter7interobject.num4inlineclass.after.Person
import chapter7interobject.num4inlineclass.after.TelephoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InlineClassTest {
    @Test
    fun testNormal() {
        var person = Person("John", TelephoneNumber("123", "4567890"))
        assertEquals("(123)4567890", person.telephoneNumber)
        assertEquals("John", person.name)
        person.areaCode = "000"
        assertEquals("(000)4567890", person.telephoneNumber)
    }
}