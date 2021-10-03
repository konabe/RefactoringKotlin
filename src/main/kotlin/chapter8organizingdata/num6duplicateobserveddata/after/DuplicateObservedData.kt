package chapter8organizingdata.num6duplicateobserveddata.after

// 便宜上、型をIntに限定。本書はStringからIntへのパース
class TextField(var text: Int)

class FocusEvent(val source: TextField)

// ドメインクラスにデータをコピーしてGUIと同期させれば良い。
interface MyObservable<T> {
    var observer: MyObserver<T>?
    fun addObserver(observer: MyObserver<T>)
    fun setChanged()
    fun notifyObservers()
}

interface MyObserver<T> {
    fun update(obj: T)
}

class Interval: MyObservable<Interval> {
    override var observer: MyObserver<Interval>? = null
    var start: Int = 0
        set(value) {
            field = value
            setChanged()
            notifyObservers()
        }
    var end: Int = 0
        set(value) {
            field = value
            setChanged()
            notifyObservers()
        }
    var length: Int = 0
        set(value) {
            field = value
            setChanged()
            notifyObservers()
        }

    fun calculateLength() {
        length = end - start
    }

    fun calculateEnd() {
        end = start + length
    }

    override fun addObserver(observer: MyObserver<Interval>) {
        this.observer = observer
    }

    override fun setChanged() {
    }

    override fun notifyObservers() {
        observer?.update(this)
    }
}

class IntervalWindow: MyObserver<Interval> {
    private var subject: Interval

    var startField = TextField(0)
    var endField = TextField(0)
    var lengthField = TextField(0)

    private var start: Int
        get() = subject.start
        set(value) {
            subject.start = value
        }
    private var end: Int
        get() = subject.end
        set(value) {
            subject.end = value
        }
    private var length: Int
        get() = subject.length
        set(value) {
            subject.length = value
        }

    constructor() {
        subject = Interval()
        subject.addObserver(this)
        update(Interval())
    }

    // ここはあくまでも、データの変更があったときUIと整合性を取るためだけに使う。
    override fun update(obj: Interval) {
        startField.text = subject.start
        endField.text = subject.end
        lengthField.text = subject.length
    }

    fun focusLost(event: FocusEvent) {
        when (event.source) {
            this.startField -> {
                startFieldFocusLost(event)
            }
            this.endField -> {
                endFieldFocusLost(event)
            }
            this.lengthField -> {
                lengthFieldFocusLost(event)
            }
        }
    }

    private fun startFieldFocusLost(event: FocusEvent) {
        start = startField.text
        if (start < 0) {
            start = 0
        }
        subject.calculateLength()
    }

    private fun endFieldFocusLost(event: FocusEvent) {
        // ユーザーはendFieldの値を直接変更することができる。
        // 明示的にこう書くことでユーザーの入力が正しくプロパティを経由することを保証する。
        end = endField.text
        if (end < 0) {
            end = 0
        }
        // ビジネスロジックをGUIから分離できた。
        subject.calculateLength()
    }

    private fun lengthFieldFocusLost(event: FocusEvent) {
        length = lengthField.text
        if (length < 0) {
            length = 0
        }
        subject.calculateEnd()
    }
}