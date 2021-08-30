package chapter6method.num2inlinemethod.after

class Rate(private val numberOfLateDeliveries: Int) {
    fun getRating(): Int {
        // メソッドの本体が名前と同じくらいにわかりやすいことがある
        return if (numberOfLateDeliveries > 5) 2 else 1
    }
}
