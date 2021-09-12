package chapter7interobject.num1movemethod.after

// AccountTypeが追加されることを想定。
// overdraftChargeをAccountTypeに移す価値があるか？を検討

class Account(
    private val type: AccountType,
    val daysOverdrawn: Int
    ) {
    // 元のoverdraftChargeメソッドは削除
    // （使われているメソッドはすべて置き換える）

    fun bankCharge(): Double {
        var result = 4.5
        if (daysOverdrawn > 0) result += type.overdraftCharge(daysOverdrawn)
        return result
    }
}

class AccountType(
    private val isPremium: Boolean
) {
    private fun isPremium(): Boolean = isPremium

    // メソッドを移したとき、元のクラスに残した特性(フィールド)は引数を経由して渡す。
    // (他の手段)
    // 1. 特性も一緒に移動する, 2. 移動先のクラスから元のクラスへの参照を作る
    // 3. 元のオブジェクトをパラメータとして渡す 4. 特性が変数ならパラメータで渡す
    fun overdraftCharge(daysOverdrawn: Int): Double {
        return if (isPremium()) {
            var result = 10.0
            if ( daysOverdrawn > 0 ) {
                result += (daysOverdrawn - 7) * 0.85
            }
            result
        } else daysOverdrawn * 1.75
    }

    // もし元々のメソッドで、オブジェクトのメソッドをコールしている場合はオブジェクトを渡す必要がある。
    // （テストはしていないが、このイメージ）
    fun overdraftCharge2(account: Account): Double {
        return if (isPremium()) {
            var result = 10.0
            if ( account.daysOverdrawn > 0 ) {
                result += (account.daysOverdrawn - 7) * 0.85
            }
            result
        } else account.daysOverdrawn * 1.75
    }
}

fun main() {

}