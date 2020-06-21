package oo


//const allowed only in top level variable or inside object
//compile time replacement happens
//Only on primitives and String

const val MOBILE = "MBL"

class Mobile(val make: String, val model: String) {
    object Type {
        //Accessible from java
        const val value: String = MOBILE
        @JvmField //Accessible from java
        val valid: Boolean = true
    }
}

fun main() {
    println(Mobile.Type.valid)
    println(Mobile.Type.value)
}
