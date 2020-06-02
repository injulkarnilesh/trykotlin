package oo

import java.lang.StringBuilder

interface HumanBeing {
    var race: String
}

//name, age are properties with getters and setters
//val - getters var - getters, setters
class Person(val name: String, var age: Int): HumanBeing {
    override var race: String = "Person"
}

class Student : HumanBeing {
    var name: String = "Unknown"
        get() {
            println("Getting Name $field")
            return field
        }
        set(value) {
            println("Setting Name $field = $value")
            field = value
        }
    var age: Int = 0
        private set
    override var race: String = this.name

}

val String.lambi: Int
    get() = this.length - 1

var StringBuilder.shevat: Char
    get() = get(length - 1)
    set(c: Char) {
        this.setCharAt(length - 1, c)
    }


fun main() {
    val someOne = Person("Nilesh", 23)
    someOne.age = 33   //setter would be called
    println("Hey ${someOne.name}(${someOne.age})") //getters would be called

    val st = Student()
    println("Name ${st.name}")
    st.name = "Nilesh"
    println("Name after ${st.name}")

    println("${someOne.race}/${st.name}")

    println("Nilesh".lambi)

    val sb = StringBuilder("Kotlin%")
    sb.shevat = '!'
    println("${sb}/${sb.shevat}")

}