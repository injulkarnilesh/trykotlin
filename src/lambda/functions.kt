package lambda

val isEvenLambda: (Int) -> Boolean = { it % 2 == 0}
fun isEvenFunction(value: Int): Boolean = value % 2 == 0
val isEvenlambdaAssignedFun = ::isEvenFunction
val rekami = String::isBlank

class Person(val name: String, val age: Int) {
    fun isOlderThan(ageLimit: Int) = age > ageLimit
    fun getAgePredicate() = this::isOlderThan  //this can be ommited
}

fun main() {
    listOf(1, 3, 2, 4, 6, 5)
            .filter(isEvenLambda)
            .filter(::isEvenFunction)
            .filter(isEvenlambdaAssignedFun)
            .map(Int::toString)
            .filter(rekami)

    val him = Person("Nilesh", 23)
    val her = Person("WonderWooman", 124)

    //UnBound
    val unBoundFunction = Person::isOlderThan
    val unBoundFunction2: (Person, Int) -> Boolean = Person::isOlderThan
    val isHimOlder = unBoundFunction.invoke(him, 60)
    val isHimOlder2 = unBoundFunction2(him, 60)

    val boundFunction = her::isOlderThan
    val boundFunction2: (Int) -> Boolean = her::isOlderThan
    val isHerOlder = boundFunction(60);
    val isHerOlder2 = boundFunction2(60);

    val agePredicate = her.getAgePredicate()
    val olderWithPredicate = agePredicate(60)

    println("$isHimOlder / $isHimOlder2 / $isHerOlder / $isHerOlder2 / $olderWithPredicate")

}
