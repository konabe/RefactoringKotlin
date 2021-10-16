import chapter10methodcalls.num4separatequeryfrommodifier.after.AlertSendable
import chapter10methodcalls.num4separatequeryfrommodifier.after.SepareteQueryFromModifier
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SepareteQueryFromModifierTest {
    lateinit var sender: MockAlertSender2
    lateinit var obj: SepareteQueryFromModifier
    @BeforeEach
    fun beforeEach() {
        sender = MockAlertSender2()
        obj = SepareteQueryFromModifier(sender)
    }

    @Test
    fun testNormal() {
        obj.checkSecurity(listOf("A", "B", "C", "D"))
        assertEquals(0, sender.sendAlertCallCount)
    }

    @Test
    fun testNormalDon() {
        obj.checkSecurity(listOf("A", "Don", "C", "D"))
        assertEquals(1, sender.sendAlertCallCount)
    }

    @Test
    fun testNormalDonJohn() {
        obj.checkSecurity(listOf("A", "Don", "C", "John"))
        assertEquals(1, sender.sendAlertCallCount)
    }

    @Test
    fun testEmpty() {
        obj.checkSecurity(listOf())
        assertEquals(0, sender.sendAlertCallCount)
    }
//    @Test
//    fun test2Normal() {
//        obj.checkSecurity2(listOf("A", "B", "C", "D"))
//        assertEquals(0, sender.sendAlertCallCount)
//        assertEquals("", sender.someLaterCodeFound)
//    }
//
//    @Test
//    fun test2NormalDon() {
//        obj.checkSecurity2(listOf("A", "Don", "C", "D"))
//        assertEquals(1, sender.sendAlertCallCount)
//        assertEquals("Don", sender.someLaterCodeFound)
//    }
//
//    @Test
//    fun test2NormalDonJohn() {
//        obj.checkSecurity2(listOf("A", "Don", "C", "John"))
//        assertEquals(1, sender.sendAlertCallCount)
//        assertEquals("Don", sender.someLaterCodeFound)
//    }
//
//    @Test
//    fun test2Empty() {
//        obj.checkSecurity2(listOf())
//        assertEquals(0, sender.sendAlertCallCount)
//        assertEquals("", sender.someLaterCodeFound)
//    }
}

class MockAlertSender2: AlertSendable {
    var sendAlertCallCount = 0
    override fun sendAlert() {
        sendAlertCallCount += 1
    }
    var someLaterCodeCallCount = 0
    var someLaterCodeFound = ""
    override fun someLaterCode(found: String) {
        someLaterCodeCallCount += 1
        someLaterCodeFound = found
    }
}