package chapter8organizingdata.num15replacetypecodewithstatestrategy.before

class Employee(
    val type: Int,
    val monthlySalary: Int,
    val comission: Int,
    val bonus: Int
) {
    companion object {
        val ENGINEER = 0
        val SALESMAN = 1
        val MANAGER = 2
    }

    fun payAmount(): Int {
        return when(type) {
            ENGINEER -> monthlySalary
            SALESMAN -> monthlySalary + comission
            MANAGER -> monthlySalary + bonus
            else -> 0
        }
    }
}
