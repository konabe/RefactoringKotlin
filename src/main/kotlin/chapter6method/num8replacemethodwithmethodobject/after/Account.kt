package chapter6method.num8replacemethodwithmethodobject.after

class Account {
    // メソッドの抽出が適用できないときに使う
    // 基本的に、小さいメソッドは把握しやすさがある。
    // ローカル変数のせいで分解がしづらくなる。 -> メソッドオブジェクトを利用
    fun gamma(inputVal: Int, quantity: Int, yearToDate: Int): Int {
        return Gamma(this, inputVal, quantity, yearToDate).compute()
    }

    fun delta() = 42
}

// メソッドオブジェクト
private class Gamma(
    private val account: Account, // 参照元
    private val inputVal: Int,
    private val quantity: Int,
    private val yearToDate: Int
) {
    // Nullableにするとややこしいので0で。
    private var importantValue1 = 0
    private var importantValue2 = 0
    private var importantValue3 = 0

    fun compute(): Int {
        // Accountクラスにあるもの(deltaメソッド)は、差し替える。
        importantValue1 = (inputVal * quantity) + account.delta()
        importantValue2 = (inputVal * yearToDate) + 100
        importantThing()
        importantValue3 = importantValue2 * 7
        // 略
        return importantValue3 - 2 * importantValue1
    }

    // メソッドオブジェクトを利用すれば、単純にコピペで切り取れる。
    private fun importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20
        }
    }
}