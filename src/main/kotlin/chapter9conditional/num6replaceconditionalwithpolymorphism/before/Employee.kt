package chapter9conditional.num6replaceconditionalwithpolymorphism.before

class Employee(
    private val monthSalary: Int,
    private val comission: Int,
    private val bonus: Int,
    private val type: EmployeeType
) {

    fun payAmount(): Int {
        return when(type.typeCode) {
            EmployeeType.ENGINEER -> monthSalary
            EmployeeType.MANAGER -> monthSalary + bonus
            EmployeeType.SALESMAN -> monthSalary + comission
            else -> 0
        }
    }
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
}

class Engineer: EmployeeType() {
    override val typeCode = EmployeeType.ENGINEER
}
class Manager: EmployeeType() {
    override val typeCode = EmployeeType.MANAGER
}
class Salesman: EmployeeType() {
    override val typeCode = EmployeeType.SALESMAN
}