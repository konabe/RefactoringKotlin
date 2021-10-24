package chapter11inheritance.num6extractsubclass.before

class JobItem(
    private val unitPrice: Int,
    val quantity: Int,
    private val isLabor: Boolean,
    val employee: Employee
) {
    fun getUnitPrice(): Int {
        return if (isLabor) employee.rate else unitPrice
    }
}

class Employee(val rate: Int)