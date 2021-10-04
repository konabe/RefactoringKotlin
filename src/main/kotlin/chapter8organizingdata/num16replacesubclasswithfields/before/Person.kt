package chapter8organizingdata.num16replacesubclasswithfields.before

abstract class Person {
    abstract fun isMale(): Boolean
    abstract fun getCode(): Char
}

class Male: Person() {
    // これは意味ない
    override fun isMale(): Boolean {
        return true
    }
    override fun getCode(): Char {
        return 'M'
    }
}

class Female: Person() {
    override fun isMale(): Boolean {
        return false
    }
    override fun getCode(): Char {
        return 'F'
    }
}