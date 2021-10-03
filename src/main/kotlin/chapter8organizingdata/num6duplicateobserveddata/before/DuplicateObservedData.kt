package chapter8organizingdata.num6duplicateobserveddata.before

// 便宜上、型をIntに限定。本書はStringからIntへのパース
class TextField(var text: Int)

class FocusEvent(val source: TextField)

class IntervalWindow {
    var startField = TextField(0)
    var endField = TextField(0)
    var lengthField = TextField(0)

    fun focusLost(event: FocusEvent) {
        when (event.source) {
            this.startField -> {
                startFieldFocusLost(event)
            }
            this.endField -> {
                endFieldFocusLost(event)
            }
            this.lengthField -> {
                lengthFieldFocusLost(event)
            }
        }
    }

    private fun startFieldFocusLost(event: FocusEvent) {
        if (startField.text < 0) {
            startField.text = 0
        }
        calculateLength()
    }

    private fun endFieldFocusLost(event: FocusEvent) {
        if (endField.text < 0) {
            endField.text = 0
        }
        calculateLength()
    }

    private fun lengthFieldFocusLost(event: FocusEvent) {
        if (lengthField.text < 0) {
            lengthField.text = 0
        }
        calculateEnd()
    }

    // TODO: ビジネスロジックを分離
    private fun calculateLength() {
        val length = endField.text - startField.text
        lengthField.text = length
    }

    private fun calculateEnd() {
        val end = startField.text + lengthField.text
        endField.text = end
    }
}