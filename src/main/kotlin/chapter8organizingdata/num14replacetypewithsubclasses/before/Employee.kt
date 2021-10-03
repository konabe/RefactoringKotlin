package chapter8organizingdata.num14replacetypewithsubclasses.before

class Employee(
    val type: Int
) {
    companion object {
        val ENGINEER = 0
        val SALESMAN = 1
        val MANAGER = 2
    }
}
