package chapter8organizingdata.num4changereferencetovalue.after

// 値オブジェクトにしたければdata classにするのが手っ取り早そう。
data class Currency(val code: String) {
}

fun main() {
    val usd = Currency("USD")
}