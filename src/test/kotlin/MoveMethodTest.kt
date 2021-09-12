import chapter7interobject.num1movemethod.after.Account
import chapter7interobject.num1movemethod.after.AccountType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoveMethodTest {

    @Test
    fun testNormal() {
        val accountType = AccountType(true)
        val account = Account(accountType, 8)
        assertEquals(15.35, account.bankCharge())
        val accountType2 = AccountType(true)
        val account2 = Account(accountType2, 3)
        assertEquals(11.1, account2.bankCharge())
        val accountType3 = AccountType(false)
        val account3 = Account(accountType3, 8)
        assertEquals(18.5, account3.bankCharge())
    }
}