package chapter10methodcalls.num4separatequeryfrommodifier.after


interface AlertSendable {
    fun sendAlert()
    fun someLaterCode(found: String)
}

class AlertSender: AlertSendable {
    override fun sendAlert() {
        print("alert!")
    }
    override fun someLaterCode(found: String) {
        print(found)
    }
}

// セキュリティシステムのために不審者の名前を通知して警報を発する
class SepareteQueryFromModifier(
    private val alertSender: AlertSendable
) {
    fun checkSecurity(people: List<String>) {
        sendAlert(people)
        val found = foundPerson(people)
        alertSender.someLaterCode(found)
    }

    // 問い合わせメソッド
    private fun foundPerson(people: List<String>): String {
        people.forEach {
            if (it == "Don") {
                return "Don"
            }
            if (it == "John") {
                return "John"
            }
        }
        return ""
    }

    private fun sendAlert(people: List<String>) {
        if (foundPerson(people) != "") {
            alertSender.sendAlert()
        }
    }
}