import chapter10methodcalls.num14replaceerrorcodewithexception.after.Account
import chapter10methodcalls.num14replaceerrorcodewithexception.after.BalanceException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class ReplaceErrorCodeWithExceptionTest {
    @Test
    fun testNormal() {
        val account = Account(10_000)
//        assertEquals(0, account.withdraw(2_000))
        assertDoesNotThrow {
            account.withdraw(2_000)
        }
        assertEquals(8_000, account.balance)
//        assertEquals(-1, account.withdraw(10_000))
        assertThrows<IllegalArgumentException> {
            account.withdraw(10_000)
        }
        assertEquals(8_000, account.balance)

        val account2 = Account(10_000)
        assertThrows<BalanceException> {
            account2.withdraw2(20_000)
        }
        account2.withdraw2(1_000)
        assertEquals(9_000, account2.balance)
    }
}