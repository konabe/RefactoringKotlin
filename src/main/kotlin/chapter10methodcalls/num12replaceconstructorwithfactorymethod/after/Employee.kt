package chapter10methodcalls.num12replaceconstructorwithfactorymethod.after

open class Employee protected constructor(protected val type: Int) {
    companion object {
        const val ENGINEER = 0
        const val SALESMAN = 1
        const val MANAGER = 2

        // ファクトリメソッド
        fun create(type: Int): Employee {
            return when(type) {
                ENGINEER -> Engineer()
                SALESMAN -> Salesman()
                MANAGER -> Manager()
                else -> throw IllegalArgumentException()
            }
        }

        // 明示的なメソッド
        fun createEngineer(): Employee {
            return Engineer()
        }
    }
}

class Engineer(): Employee(Employee.ENGINEER)
class Salesman(): Employee(Employee.SALESMAN)
class Manager(): Employee(Employee.MANAGER)