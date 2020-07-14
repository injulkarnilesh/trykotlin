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
    //Hey Nilesh(33)

    val st = Student() //for race init Getting Name Unknown
    println("Name ${st.name}")
    //Getting Name Unknown
    //Name Unknown

    st.name = "Nilesh"
    //Setting Name Unknown = Nilesh

    println("Name after ${st.name}")
    //Getting Name Nilesh
    //Name after Nilesh

    println("${someOne.race}/${st.name}")
    //Getting Name Nilesh
    //Person/Nilesh

    println("Nilesh".lambi)
    //5

    val sb = StringBuilder("Kotlin%")
    sb.shevat = '!'
    println("${sb}/${sb.shevat}")
    //Kotlin!/!

}