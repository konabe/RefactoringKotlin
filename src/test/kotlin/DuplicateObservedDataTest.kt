import chapter8organizingdata.num6duplicateobserveddata.after.FocusEvent
import chapter8organizingdata.num6duplicateobserveddata.after.IntervalWindow
import chapter8organizingdata.num6duplicateobserveddata.after.TextField
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DuplicateObservedDataTest {
    private lateinit var startField: TextField
    private lateinit var endField: TextField
    private lateinit var lengthField: TextField
    private lateinit var intervalWindow: IntervalWindow

    @BeforeEach
    fun beforeEach() {
        startField = TextField(0)
        endField = TextField(0)
        lengthField = TextField(0)
        intervalWindow = IntervalWindow()
        intervalWindow.startField = startField
        intervalWindow.endField = endField
        intervalWindow.lengthField = lengthField
    }

    @Test
    fun testNormal() {
        startField.text = 3
        intervalWindow.focusLost(FocusEvent(startField))
        endField.text = 5
        intervalWindow.focusLost(FocusEvent(endField))
        assertEquals(2, lengthField.text)
    }

    fun testCalculateEnd() {
        startField.text = 3
        intervalWindow.focusLost(FocusEvent(startField))
        lengthField.text = 5
        intervalWindow.focusLost(FocusEvent(lengthField))
        assertEquals(8, endField.text)
    }

    @Test
    fun testAbnormal() {
        startField.text = -3
        intervalWindow.focusLost(FocusEvent(startField))
        endField.text = -5
        intervalWindow.focusLost(FocusEvent(endField))
        assertEquals(0, lengthField.text)
        lengthField.text = -6
        assertEquals(0, endField.text)
    }

}