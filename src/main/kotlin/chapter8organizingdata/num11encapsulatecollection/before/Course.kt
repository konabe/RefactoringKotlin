package chapter8organizingdata.num11encapsulatecollection.before

class Course(
    var name: String,
    var isAdvanced: Boolean
) {
}

class Person {
    lateinit var courses: MutableSet<Course>
}

fun main() {
    val kent = Person()
    val s = mutableSetOf(
        Course("Smalltalkプログラミング", false),
        Course("シングルモルトの味わい", true)
    )
    kent.courses = s
    val refactoring = Course("リファクタリング", true)
    kent.courses.add(refactoring)
    kent.courses.add(Course("冷酷な皮肉", false))
    kent.courses.remove(refactoring)

    println(kent.courses.count { it.isAdvanced })
}