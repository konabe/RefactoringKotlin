package chapter11inheritance.num7extractsuperclass.before

class Employee(
    val name: String,
    val id: String,
    val annualCost: Int
) {
}

class Department(
    val staff: List<Employee>,
    private val name: String
) {
    fun getTotalAnnualCost(): Int = staff.sumOf {it.annualCost}
}