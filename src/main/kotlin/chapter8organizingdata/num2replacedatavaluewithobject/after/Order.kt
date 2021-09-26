package chapter8organizingdata.num2replacedatavaluewithobject.after

class Order {
    private var customer: Customer
    var customerName: String
        get() = customer.name
        set(value) {
            customer = Customer(value)
        }
    constructor(customerName: String) {
        this.customer = Customer(customerName)
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
class Customer(
    val name: String
)

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