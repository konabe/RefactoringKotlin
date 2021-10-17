package chapter10methodcalls.num8replaceparameterwithmethod.before

class ReplaceParameterWithMethod(
    private val quantity: Int,
    private val itemPrice: Int
) {
    fun getPrice(): Double {
        val basePrice = quantity * itemPrice
        var discountLevel = 0
        discountLevel = if (quantity > 100) 2 else 1
        return discountedPrice(basePrice, discountLevel)
    }

    private fun discountedPrice(basePrice: Int, discountLevel: Int): Double {
        return if (discountLevel == 2) basePrice * 0.1 else basePrice * 0.05
    }
}