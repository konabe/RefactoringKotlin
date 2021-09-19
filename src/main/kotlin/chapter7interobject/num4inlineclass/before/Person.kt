package chapter7interobject.num4inlineclass.before

class Person(
    val name: String,
    var officeTelephone: TelephoneNumber
) {
    val telephoneNumber: String
        get() = "(${officeTelephone.areaCode})${officeTelephone.number}"
}

class TelephoneNumber(
    var areaCode: String,
    var number: String
)

fun main() {
    var person = Person("Testaro", TelephoneNumber("81", "120117117"))
    person.officeTelephone.areaCode = "01"
    println(person.officeTelephone)
}