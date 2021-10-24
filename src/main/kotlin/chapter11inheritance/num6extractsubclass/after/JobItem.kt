package chapter11inheritance.num6extractsubclass.after

open class JobItem protected constructor(
    private val unitPrice: Int,
    val quantity: Int,
) {
    protected open val employee: Employee? = null
    open fun getUnitPrice(): Int {
        return unitPrice
    }
}

// サブクラスを作ったら、まずはコンストラクタからとりかかる。
class LaborItem(
    quantity: Int,
    override val employee: Employee?
): JobItem(0, quantity) {
    override fun getUnitPrice(): Int {
        return employee?.rate ?: 0
    }
}

class Employee(val rate: Int)