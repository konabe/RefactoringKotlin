package chapter8organizingdata.num11encapsulatecollection.after

import java.util.*

class Course(
    var name: String,
    var isAdvanced: Boolean
) {
}

class Person {
    private var _courses = mutableSetOf<Course>()
    val courses: MutableSet<Course>
        get() = Collections.unmodifiableSet(_courses)

    fun addCourse(course: Course) = _courses.add(course)
    fun removeCourse(course: Course) = _courses.remove(course)
    fun initializeCourses(set: MutableSet<Course>) {
        set.forEach {
            addCourse(Course(it.name, it.isAdvanced))
        }
        // こうするのもあり。
        // courses.addAll(set)
    }
    fun numberOfCourses() = _courses.size
    fun numberOfAdvancedCourses() = _courses.count { it.isAdvanced }
}

fun main() {
    val kent = Person()
    val s = mutableSetOf(
        Course("Smalltalkプログラミング", false),
        Course("シングルモルトの味わい", true)
    )
    kent.initializeCourses(s)
    val refactoring = Course("リファクタリング", true)
    kent.addCourse(refactoring)
    kent.addCourse(Course("冷酷な皮肉", false))
    kent.removeCourse(refactoring)

    println(kent.numberOfAdvancedCourses())
}