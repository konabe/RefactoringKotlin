package chapter8organizingdata.num3changevaluetoreference.after

// TODO: 同じ顧客に対する注文があった場合は、１つのCustomerオブジェクトを共有できるようにする。

class Order {
    private var customer: Customer
    var customerName: String
        get() = customer.name
        set(value) {
            customer = Customer.getNamed(value)
        }
    constructor(customerName: String) {
        this.customer = Customer.getNamed(customerName)
    }
}

fun numberOfOrdersFor(orders: List<Order>, customer: String): Int {
    var result = 0
    for (order in orders) {
        if (order.customerName == customer) result ++
    }
    return result
}

// 値オブジェクト
// コンストラクタをprivateにする。
class Customer private constructor (
    val name: String
) {
    companion object {
        // Factory Method
        fun getNamed(customerName: String): Customer {
            return instances[customerName]?.also {
                return it
            } ?: run {
                val customer = Customer(customerName)
                customer.store()
                return customer
            }
        }

        // access point
        var instances = mutableMapOf<String, Customer>()
    }

    private fun store() {
        instances[name] = this
    }

}

fun main() {
    val orders = listOf<Order>(
        Order("A"),
        Order("B"),
        Order("C"),
        Order("A"),
        Order("A")
    )
    println(numberOfOrdersFor(orders, "A"))
}