package chapter10methodcalls.num6replaceparameterwithexplicitmethods.before

open class Employee(val type: Int) {
    companion object {
        fun create(type: Int): Employee {
            return when (type) {
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

class Engineer: Employee(Employee.ENGINEER)
class Salesman: Employee(Employee.SALESMAN)
class Manager: Employee(Employee.MANAGER)