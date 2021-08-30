package chapter6method.num1extractmethod.after

import chapter6method.Order

interface Printable {
    fun println(text: String)
}

class Printer: Printable {
    override fun println(text: String) {
        kotlin.io.println(text)
    }
}

class Accounting(
    private val name: String,
    private val orders: List<Order>,
    private val printer: Printable
) {
    fun printOwing() {
        printBanner()
        // (3) もしoutstandingが初期値を持っている場合は、初期値として引数で渡す。
        val outstanding = getOutstanding()
        printDetails(outstanding)
    }

    private fun printBanner() {
        printer.println("***************") // *x15
        printer.println("* Custom Owes *")
        printer.println("***************")
    }

    // (1) 読み取り専用のローカル変数を切り出すときは、メソッドの引数で渡せば良い。
    private fun printDetails(outstanding: Double) {
        printer.println("name: $name")
        printer.println("amount: $outstanding")
    }

    // (2) 書き込みありのローカル変数を切り出すときは、結果を帰り値で渡す。
    // NOTE: 複数の値を返すような関数は切り出しがうまく行ってない可能性がある。
    private fun getOutstanding() :Double {
        return orders
            .map { it.amount }
            .reduce { t, v ->
                t + v
            }
    }

}

fun main() {
    val orders = listOf(
        Order(10_000.0, 100_0.0),
        Order(5_000.0, 100_0.0),
        Order(20_000.0, 100_0.0),
        Order(1_000.0, 100_0.0)
    )
    val accounting = Accounting("John", orders, Printer())
    accounting.printOwing()
}