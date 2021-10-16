package chapter10methodcalls.num6replaceparameterwithexplicitmethods.after

open class Employee(val type: Int) {
    companion object {
        fun createEngineer() = Engineer()
        fun createSalesman() = Salesman()
        fun createManager() = Manager()

        const val ENGINEER = 0
        const val SALESMAN = 1
        const val MANAGER = 2
    }
}

class Engineer: Employee(Employee.ENGINEER)
class Salesman: Employee(Employee.SALESMAN)
class Manager: Employee(Employee.MANAGER)