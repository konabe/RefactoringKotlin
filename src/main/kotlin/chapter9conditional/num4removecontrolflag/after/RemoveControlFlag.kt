package chapter9conditional.num4removecontrolflag.after

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
        for (person in people) {
            if (person == "Don") {
                alertSendable.sendAlert()
                // breakで置き換えて制御フラグを削除する。
                break
            }
            if (person == "John") {
                alertSendable.sendAlert()
                break
            }
        }
    }

    fun checkSecurity2(people: List<String>) {
        // 制御フラグは、結果の保持と制御フラグの２つの役割を担っている。
        val found = foundMiscreant(people)
        alertSendable.someLaterCode(found)
    }

    private fun foundMiscreant(people: List<String>): String {
        for (person in people) {
            if (person == "Don") {
                alertSendable.sendAlert()
                return "Don"
            }
            if (person == "John") {
                alertSendable.sendAlert()
                return "John"
            }
        }
        return ""
    }
}