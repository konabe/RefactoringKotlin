import chapter9conditional.num3consolidateduplicateconditionalfragments.after.ConsolidateDuplicateConditionalFragments
import chapter9conditional.num3consolidateduplicateconditionalfragments.after.Sendable
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConsolidateDuplicateConditionalFragmentsTest {
    @Test
    fun testNormal() {
        val mockSender = MockSender()
        val obj = ConsolidateDuplicateConditionalFragments(
            mockSender, true
        )
        obj.doSomething(100.0)
        assertEquals(95.0, obj.total)
        assertEquals(1, mockSender.sendCallCount)
    }

    @Test
    fun testNormalFalse() {
        val mockSender = MockSender()
        val obj = ConsolidateDuplicateConditionalFragments(
            mockSender, false
        )
        obj.doSomething(100.0)
        assertEquals(98.0, obj.total)
        assertEquals(1, mockSender.sendCallCount)
    }
}

class MockSender: Sendable {
    var sendCallCount = 0
    override fun send() {
        sendCallCount += 1
    }
}