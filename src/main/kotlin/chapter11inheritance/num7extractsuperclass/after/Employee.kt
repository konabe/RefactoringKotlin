package chapter11inheritance.num7extractsuperclass.after

// これによってCompositeパターンにするきっかけができた。
abstract class Party(
    protected val name: String
) {
    abstract fun getAnnualCost(): Int
}

class Employee(
    name: String,
    val id: String,
    val _annualCost: Int
): Party(name) {
    override fun getAnnualCost(): Int = _annualCost
}

class Department(
    val staff: List<Employee>,
    name: String,
): Party(name) {
    override fun getAnnualCost(): Int = staff.sumOf {it.getAnnualCost()}
}