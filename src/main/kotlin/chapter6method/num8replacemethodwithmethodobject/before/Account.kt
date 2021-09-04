package chapter6method.num8replacemethodwithmethodobject.before

class Account {
    // メソッドの抽出が適用できないときに使う
    // 基本的に、小さいメソッドは把握しやすさがある。
    // ローカル変数のせいで分解がしづらくなる。 -> メソッドオブジェクトを利用
    fun gamma(inputVal: Int, quantity: Int, yearToDate: Int): Int {
        val importantValue1 = (inputVal * quantity) + delta()
        var importantValue2 = (inputVal * yearToDate) + 100
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20
        }
        val importantValue3 = importantValue2 * 7
        // 略
        return importantValue3 - 2 * importantValue1
    }

    private fun delta() = 42
}