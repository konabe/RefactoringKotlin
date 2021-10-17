import chapter10methodcalls.num9introduceparameterobject.after.Account
import chapter10methodcalls.num9introduceparameterobject.after.DateRange
import chapter10methodcalls.num9introduceparameterobject.after.Entry
import org.junit.jupiter.api.Test
import java.text.SimpleDateFormat
import kotlin.test.assertEquals

class IntroduceParameterObjectTest {
    @Test
    fun testNormal() {
        val format = SimpleDateFormat("yyyy/MM/dd")
        val entries = listOf<Entry>(
            Entry(100.0, format.parse("2021/10/17")),
            Entry(20.0, format.parse("2021/10/18")),
            Entry(3.0, format.parse("2021/10/19")),
        )
        val account = Account(entries)
        val dateRange = DateRange(
            format.parse("2021/10/15"),
            format.parse("2021/10/18")
        )
        assertEquals(120.0, account.getFlowBetween(dateRange))
    }
}