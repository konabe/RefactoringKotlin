package chapter9conditional.num4removecontrolflag.before

// ループの入り口は一つでもいいが、出口は一つにするとわかりづらくなる。
// break/continueよりもreturnのほうがわかりやすくなる。

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

class RemoveControlFlag(
    private val alertSendable: AlertSendable = AlertSender()
) {
    fun checkSecurity(people: List<String>) {
        var found = false
        for (person in people) {
            if (!found) {
                if (person == "Don") {
                    alertSendable.sendAlert()
                    found = true
                }
                if (person == "John") {
                    alertSendable.sendAlert()
                    found = true
                }
            }
        }
    }

    fun checkSecurity2(people: List<String>) {
        var found = ""
        for (person in people) {
            if (found == "") {
                if (person == "Don") {
                    alertSendable.sendAlert()
                    found = "Don"
                }
                if (person == "John") {
                    alertSendable.sendAlert()
                    found = "John"
                }
            }
        }
        alertSendable.someLaterCode(found)
    }
}