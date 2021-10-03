package chapter8organizingdata.num14replacetypewithsubclasses.after

abstract class Employee protected constructor() {
    companion object {
        const val ENGINEER = 0
        const val SALESMAN = 1
        const val MANAGER = 2
        @Throws(Error::class)
        fun create(type: Int): Employee {
            return when(type) {
                ENGINEER -> Engineer()
                SALESMAN -> Salesman()
                MANAGER -> Manager()
                else -> throw Error()
            }
        }
    }

    abstract var type: Int
}

class Engineer: Employee() {
    override var type = Employee.ENGINEER
}
class Salesman: Employee() {
    override var type = Employee.SALESMAN
}
class Manager: Employee() {
    override var type = Employee.MANAGER
}