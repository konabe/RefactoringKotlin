package chapter9conditional.num7introducenullobject.before

// Customerはいなくなることがある。
// Customerオブジェクトを使うコードはすべてnullが扱えることを保証する。

class Site(val customer: Customer) {
}

class Customer (
    val name: String,
    val plan: BillingPlan,
    val history: PaymentHistory
) {

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

class PaymentHistory {
    fun getWeeksDelinquentInLastYear(): Int {
        return 4
    }
}