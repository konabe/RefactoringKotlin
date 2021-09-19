import chapter7interobject.num2movefield.after.Account
import chapter7interobject.num2movefield.after.AccountType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoveFieldTest {
    @Test
    fun testNormal() {
        //val account = Account(AccountType(), 0.1)
        val account = Account(AccountType(0.1))
        assertEquals(10.0, account.interestForAmountDays(100.0, 365))
    }
}