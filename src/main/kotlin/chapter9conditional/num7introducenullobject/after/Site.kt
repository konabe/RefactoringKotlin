package chapter9conditional.num7introducenullobject.after

// Customerはいなくなることがある。
// Customerオブジェクトを使うコードはすべてnullが扱えることを保証する。

// テストのときはインターフェイスを使うことでnullの判定ができる。
interface Null{}

class Site(val customer: Customer?) {
    fun acquireCustomer(): Customer {
        return customer ?: Customer.newNull()
    }
}

open class Customer (
    val name: String,
    val plan: BillingPlan,
    val history: PaymentHistory?
) {
    companion object {
        fun newNull(): Customer = NullCostumer()
    }

    fun acquireHistory(): PaymentHistory {
        return history ?: PaymentHistory.newNull()
    }
    open fun isNull() = false
}

// Nullオブジェクトはセットするときに、何もしないようにする。
class NullCostumer() : Customer(
    "occupant",
    BillingPlan.basic(),
    PaymentHistory.newNull()
), Null {
    override fun isNull() = true
}

class BillingPlan {
    var planName = "normal"
    companion object {
        fun basic(): BillingPlan {
            return with(BillingPlan()) {
                planName = "basic"
                this
            }
        }
    }
}

open class PaymentHistory() {
    companion object {
        fun newNull(): PaymentHistory = NullPaymentHistory()
    }
    open fun getWeeksDelinquentInLastYear() = 4
}

class NullPaymentHistory: PaymentHistory(), Null {
    override fun getWeeksDelinquentInLastYear() = 0
}