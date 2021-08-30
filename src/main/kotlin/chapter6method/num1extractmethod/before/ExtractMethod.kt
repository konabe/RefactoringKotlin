package chapter6method.num1extractmethod.before

data class Order(
    val amount: Double
)

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

        printer.println("***************") // *x15
        printer.println("* Custom Owes *")
        printer.println("***************")

        val outstanding: Double = orders
            .map { it.amount }
            .reduce { t, v ->
            t + v
        }

        printer.println("name: $name")
        printer.println("amount: $outstanding")
    }

}

fun main() {
    val orders = listOf(
        Order(10_000.0),
        Order(5_000.0),
        Order(20_000.0),
        Order(1_000.0)
    )
    val accounting = Accounting("John", orders, Printer())
    accounting.printOwing()
}