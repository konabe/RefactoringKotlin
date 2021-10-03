package chapter8organizingdata.num13replacetypecodewithclass.after

class Person {
    var bloodGroup: BloodGroup
    constructor(bloodGroup: BloodGroup) {
        this.bloodGroup = bloodGroup
    }
}

class BloodGroup (var code: Int) {
    companion object {
        val O = BloodGroup(0)
        val A = BloodGroup(1)
        val B = BloodGroup(2)
        val AB = BloodGroup(3)
        private val values = listOf(O, A, B, AB)
        private fun code(code: Int) = values[code]
    }
}