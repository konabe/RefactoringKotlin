package chapter10methodcalls.num12replaceconstructorwithfactorymethod.before

class Employee(val type: Int) {
    companion object {
        const val ENGINEER = 0
        const val SALESMAN = 1
        const val MANAGER = 2
    }
}