package chapter7interobject.num3extractclass.before

class Person(
    val name: String,
    var officeAreaCode: String,
    var officeNumber: String
) {
    val telephoneNumber: String
        get() = "($officeAreaCode)$officeNumber"
}