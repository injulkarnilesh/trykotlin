package function

fun main() {
    val sum = sum(1, 3, 6)
    println(sum)  //10

    val sumDefault = sum()
    println(sumDefault) //0

    val person = personOf(age = 29, name = "Nilesh")
    println(person)

    val personDefault = personOf()
    println(personDefault) //Person(name=, age=0)
}
