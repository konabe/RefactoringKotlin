package chapter10methodcalls.num4separatequeryfrommodifier.before


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
        val found = foundMiscreant(people)
        alertSender.someLaterCode(found)
    }

    private fun foundMiscreant(people: List<String>): String {
        people.forEach {
            if (it == "Don") {
                alertSender.sendAlert()
                return "Don"
            }
            if (it == "John") {
                alertSender.sendAlert()
                return "John"
            }
        }
        return ""
    }
}