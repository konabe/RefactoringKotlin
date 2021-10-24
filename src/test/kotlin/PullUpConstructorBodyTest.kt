import chapter11inheritance.num3pullupconstructorbody.after.Manager
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class PullUpConstructorBodyTest {
    @Test
    fun testNormal() {
        val manager = Manager("Abe", "0000-0000-0001-0002", 10)
        assertNotNull(manager)
        assertTrue(manager.isPrivileged())
    }
}

