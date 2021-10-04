import chapter8organizingdata.num16replacesubclasswithfields.after.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ReplaceSubclassWithFieldsTest {
    @Test
    fun testNormal() {
        val man = Person.createMale()
        assertTrue(man.isMale())
        assertEquals('M', man.getCode())
        val woman = Person.createFemale()
        assertFalse(woman.isMale())
        assertEquals('F', woman.getCode())
    }
}