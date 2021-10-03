import chapter8organizingdata.num11encapsulatecollection.after.Course
import chapter8organizingdata.num11encapsulatecollection.after.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EncapsulateCollectionTest {
    @Test
    fun testNormal() {
        val kent = Person()
        val s = mutableSetOf(
            Course("Smalltalkプログラミング", false),
            Course("シングルモルトの味わい", true)
        )
//        kent.courses = s
        kent.initializeCourses(s)
        assertEquals(2, kent.numberOfCourses())
        val refactoring = Course("リファクタリング", true)
//        kent.courses.add(refactoring)
//        kent.courses.add(Course("冷酷な皮肉", false))
//        kent.courses.remove(refactoring)
        kent.addCourse(refactoring)
        kent.addCourse(Course("冷酷な皮肉", false))
        assertEquals(4, kent.numberOfCourses())
        kent.removeCourse(refactoring)
        assertEquals(3, kent.numberOfCourses())
        assertEquals(1, kent.numberOfAdvancedCourses())
    }
}