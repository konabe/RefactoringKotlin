package chapter10methodcalls.num8replaceparameterwithmethod.after

class ReplaceParameterWithMethod(
    private val quantity: Int,
    private val itemPrice: Int
) {
    fun getPrice(): Double {
        return if (getDiscountLevel() == 2) getBasePrice() * 0.1 else getBasePrice() * 0.05
    }

    private fun getDiscountLevel() = if (quantity > 100) 2 else 1
    private fun getBasePrice() = quantity * itemPrice
}