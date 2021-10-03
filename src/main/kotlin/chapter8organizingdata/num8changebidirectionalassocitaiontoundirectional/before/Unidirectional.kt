package chapter8organizingdata.num8changebidirectionalassocitaiontoundirectional.before

class Order {
    constructor(customer: Customer?, grossPrice: Int) {
        this.customer = customer
        this.grossPrice = grossPrice
    }

    var grossPrice: Int
    var customer: Customer? = null
        set(value) {
            field?.friendOrders()?.remove(this)
            value?.friendOrders()?.add(this)
            field = value
        }

    fun getDiscountedPrice(): Double {
        return grossPrice * (1 - (customer?.discount ?: 0.0))
    }
}

class Customer(val discount: Double) {
    val orders = mutableSetOf<Order>()

    fun friendOrders() = orders

    fun addOrder(order: Order) {
        order.customer = this
    }

    fun getPriceFor(order: Order): Double {
        return order.getDiscountedPrice()
    }
}