package chapter11inheritance.num8extractinterface.after

class Timesheet {
    fun charge(emp: Billable, days: Int): Double {
        var base = emp.getRate() * days
        return if (emp.hasSpecialSkill()) {
            base * 1.05
        } else {
            base * 1.0
        }
    }
}

interface Billable {
    fun getRate(): Int
    fun hasSpecialSkill(): Boolean
}

class Employee (
    val _rate: Int,
    private val _hasSpecialSkill: Boolean
): Billable {
    override fun hasSpecialSkill(): Boolean = _hasSpecialSkill
    override fun getRate(): Int = _rate
}

// インターフェイスがあれば、こういうふうにしてchargeメソッドが使えるようになる。
class Computer: Billable {
    override fun getRate(): Int {
        return 100
    }

    override fun hasSpecialSkill(): Boolean {
        return false
    }

}