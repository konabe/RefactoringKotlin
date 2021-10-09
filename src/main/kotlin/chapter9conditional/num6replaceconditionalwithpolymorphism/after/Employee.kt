package chapter9conditional.num6replaceconditionalwithpolymorphism.after

class Employee(
    val monthSalary: Int,
    val comission: Int,
    val bonus: Int,
    val type: EmployeeType
) {
    fun payAmount() = type.payAmount(this)
}

abstract class EmployeeType {
    abstract val typeCode: Int

    companion object {
        fun newType(code: Int): EmployeeType {
            return when(code) {
                ENGINEER -> Engineer()
                SALESMAN -> Salesman()
                MANAGER -> Manager()
                else -> throw IllegalArgumentException()
            }
        }
        const val ENGINEER = 0
        const val SALESMAN = 1
        const val MANAGER = 2
    }

    abstract fun payAmount(emp: Employee): Int
}

class Engineer: EmployeeType() {
    override val typeCode = EmployeeType.ENGINEER
    override fun payAmount(emp: Employee) = emp.monthSalary
}
class Manager: EmployeeType() {
    override val typeCode = EmployeeType.MANAGER
    override fun payAmount(emp: Employee) = emp.monthSalary + emp.bonus
}
class Salesman: EmployeeType() {
    override val typeCode = EmployeeType.SALESMAN
    override fun payAmount(emp: Employee) = emp.monthSalary + emp.comission
}