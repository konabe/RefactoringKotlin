package chapter8organizingdata.num2replacedatavaluewithobject.before

class Order(
    // TODO: 顧客の名前から、顧客オブジェクトに変える
    var customer: String
)

fun numberOfOrdersFor(orders: List<Order>, customer: String): Int {
    var result = 0
    for (order in orders) {
        if (order.customer == customer) result ++
    }
    return result
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