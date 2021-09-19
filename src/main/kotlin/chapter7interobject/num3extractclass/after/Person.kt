package chapter7interobject.num3extractclass.after

// クラスを抽出すると、その単位でロックを掛けられるので並行プログラムの実行性が上がる。
class Person(
    val name: String,
    // *1 リンクを貼る
    private var officeTelephone: TelephoneNumber
) {
    val telephoneNumber: String
        get() = "(${officeTelephone.areaCode})${officeTelephone.number}"
}

// *1 電話番号の振る舞いをクラスで分離する
// *2 切り出したクラスの扱い方（主にアクセス制御）
// - TelephoneNumberは公開して、Personクラスにアクセスポイントになってもらう。
// - Personクラスを介さないとTelephoneNumberが変更できないようにする。
// - TelephoneNumberを外部に渡すときに、複製する。変更できると思いこむので危険。
class TelephoneNumber(
    var areaCode: String,
    var number: String
)