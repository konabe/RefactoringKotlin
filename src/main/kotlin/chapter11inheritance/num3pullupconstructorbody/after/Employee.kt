package chapter11inheritance.num3pullupconstructorbody.after

// constructorをprotectedにすることで、サブクラスが呼ぶべきことを指示できる
abstract class Employee protected constructor (
    protected val name: String,
    protected val id: String
) {
    fun initialize() {
        if (isPrivileged()) {
            assignCar()
        }
    }

    abstract fun isPrivileged(): Boolean
    private fun assignCar() {
        println("car Assigned")
    }
}

class Manager: Employee {
    private val grade: Int
    constructor(name: String, id: String, grade: Int): super(name, id) {
        this.grade = grade
        initialize()
    }

    override fun isPrivileged(): Boolean {
        return grade > 4
    }
}