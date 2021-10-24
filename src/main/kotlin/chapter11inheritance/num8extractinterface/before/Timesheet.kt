package chapter11inheritance.num8extractinterface.before

class Timesheet {
    fun charge(emp: Employee, days: Int): Double {
        var base = emp.rate * days
        return if (emp.hasSpecialSkill()) {
            base * 1.05
        } else {
            base * 1.0
        }
    }
}

class Employee (
    val rate: Int,
    private val _hasSpecialSkill: Boolean
) {
    fun hasSpecialSkill(): Boolean = _hasSpecialSkill
}