import chapter10methodcalls.num7preservewholeobject.after.HeatingPlan
import chapter10methodcalls.num7preservewholeobject.after.Room
import chapter10methodcalls.num7preservewholeobject.after.TempRange
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PreserveWholeObjectTest {
    @Test
    fun testNormal() {
        val heatingPlan = HeatingPlan(
            TempRange(20, 40)
        )
        val room = Room(TempRange(0, 30))
        assertFalse(room.withinPlan(heatingPlan))
        val room2 = Room(TempRange(30, 40))
        assertTrue(room2.withinPlan(heatingPlan))
    }
}