import chapter8organizingdata.num4changereferencetovalue.after.Currency
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChangeReferenceToValueTest {
    @Test
    fun testNormal() {
//        val usd = Currency.get("USD")
        val usd = Currency("USD")
        assertEquals("USD", usd.code)
//        assertEquals("USD", Currency.get("USD").code)
        assertEquals("USD", Currency("USD").code)
//        val jpy = Currency.get("JPY")
        val jpy = Currency("JPY")
        assertEquals("JPY", jpy.code)
//        assertEquals("JPY", Currency.get("JPY").code)
        assertEquals("JPY", Currency("JPY").code)
    }
}