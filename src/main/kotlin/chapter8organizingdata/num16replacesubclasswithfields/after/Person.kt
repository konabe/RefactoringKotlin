package chapter8organizingdata.num16replacesubclasswithfields.after

class Person {
    fun isMale(): Boolean = _isMale
    fun getCode(): Char = _code
    private var _isMale: Boolean
    private var _code: Char

    protected constructor(isMale: Boolean, code: Char) {
        _isMale = isMale
        _code = code
    }

    companion object {
        // Factory Methodによるコンストラクタの置き換え
        fun createMale(): Person {
            return Person(true, 'M')
        }
        fun createFemale(): Person {
            return Person(false, 'F')
        }
    }
}
