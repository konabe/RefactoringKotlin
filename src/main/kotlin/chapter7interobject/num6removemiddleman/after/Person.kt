package chapter7interobject.num6removemiddleman.after

// 移譲されすぎるのもまた問題。
class Person(
    val name: String
) {
    var department: Department? = null
}

class Department(
    private val chargeCode: String,
    val manager: Person
)

fun main() {
    val mario = Person("mario")
    val development = Department("C01", mario)
    mario.department = development
    val john = Person("john")
    john.department = development

    john.department?.let {
        println("john's boss is ${it.manager.name}")
    }
}