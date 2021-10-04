package chapter8organizingdata.num15replacetypecodewithstatestrategy.after

class Employee{
    private lateinit var _type: EmployeeType
    var type: Int
        get() = _type.typeCode
        set(value) {
            _type = EmployeeType.newType(value)
        }

    private var _monthlySalary: Int
    private var _comission: Int
    private var _bonus: Int
    constructor(type: Int, monthlySalary: Int, comission: Int, bonus: Int) {
        this.type = type
        _monthlySalary = monthlySalary
        _comission = comission
        _bonus = bonus
    }

    fun payAmount(): Int {
        return when(type) {
            EmployeeType.ENGINEER -> _monthlySalary
            EmployeeType.SALESMAN -> _monthlySalary + _comission
            EmployeeType.MANAGER -> _monthlySalary + _bonus
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