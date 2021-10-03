package chapter8organizingdata.num7changeunidirectionalassociationtobidirectional.after

class Order() {
    constructor(customer: Customer?) : this() {
        this.customer = customer
    }

    var customer: Customer? = null
        set(value) {
            field?.friendOrders()?.remove(this)
            value?.friendOrders()?.add(this)
            field = value
        }
}

// 関連を担当するクラスの決め方
// 1. 両方が参照オブジェクトで１対多なら１の参照を持つオブジェクトが担当する。
// 2. １方のオブジェクトが他方の構成要素なら、集約側が関連を担当する。
// 3. 多対多ならどちらでも構わない

class Customer {
    // 逆方向の参照
    val orders = mutableSetOf<Order>()

    // Orderオブジェクトだけがこれを使うこと。
    fun friendOrders() = orders

    fun addOrder(order: Order) {
        order.customer = this
    }
}