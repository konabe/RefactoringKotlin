import chapter8organizingdata.num13replacetypecodewithclass.after.BloodGroup
import chapter8organizingdata.num13replacetypecodewithclass.after.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReplaceTypeCodeWithClassTest {
    @Test
    fun testNormal() {
//        val person = Person(Person.A)
//        assertEquals(1, person.bloodGroupCode)
        val person = Person(BloodGroup.A)
        assertEquals(BloodGroup.A, person.bloodGroup)
        person.bloodGroup = BloodGroup.B
        assertEquals(BloodGroup.B, person.bloodGroup)
    }
}