package chapter11inheritance.num3pullupconstructorbody.before

open class Employee(
    protected val name: String,
    protected val id: String
)

class Manager(
    name: String,
    id: String,
    private val grade: Int
): Employee(name, id)