package chapter7interobject.num4inlineclass.after

// TODO: このあと、メソッドの移動とフィールドの移動を繰り返してTelephoneNumberに何も残らないようにできれば完成。

class Person(
    val name: String,
    private val officeTelephone: TelephoneNumber
) {
    val telephoneNumber: String
        get() = "(${officeTelephone.areaCode})${officeTelephone.number}"

    var areaCode: String
        get() = officeTelephone.areaCode
        set(value) {
            officeTelephone.areaCode = value
        }

    var number: String
        get() = officeTelephone.number
        set(value) {
            officeTelephone.areaCode = value
        }
}

class TelephoneNumber(
    var areaCode: String,
    var number: String
)

fun main() {
    var person = Person("Testaro", TelephoneNumber("81", "120117117"))
    person.areaCode = "01"
    println(person.telephoneNumber)
}