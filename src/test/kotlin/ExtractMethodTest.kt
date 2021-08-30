import chapter6method.num1extractmethod.after.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExtractMethodTest {
    private lateinit var printer: MockPrinter
    private val normalOrders = listOf(
        Order(10_000.0),
        Order(5_000.0),
        Order(20_000.0),
        Order(1_000.0)
    )
    private val normalName = "John"

    @BeforeEach
    fun init() {
        printer = MockPrinter()
    }

    @Test
    fun testPrintOwing() {
        val accounting = Accounting(
            normalName, normalOrders, printer
        )
        accounting.printOwing()
        assertEquals("***************", printer.printlnVarArgs[0])
        assertEquals("* Custom Owes *", printer.printlnVarArgs[1])
        assertEquals("***************", printer.printlnVarArgs[2])
        assertEquals("name: John", printer.printlnVarArgs[3])
        assertEquals("amount: 36000.0", printer.printlnVarArgs[4])
    }
}

private class MockPrinter: Printable {
    var printlnCallCount = 0
    var printlnVarArgs: MutableList<String> = mutableListOf()
    override fun println(text: String) {
        printlnCallCount += 1
        printlnVarArgs.add(text)
    }

}