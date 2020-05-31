package lambda

enum class Gender {
    MALE, FEMALE
}

class Student (val name: String,
               val age: Int, val gender: Gender) {
    override fun toString(): String {
        return "$gender $name of $age"
    }
}

fun main() {
    val students = listOf<Student>(
            Student("Nilesh", 29, Gender.MALE),
            Student("Snehal", 21, Gender.FEMALE),
            Student("Rao", 45, Gender.MALE),
            Student("Tai", 29, Gender.FEMALE),
            Student("Mai", 34, Gender.FEMALE)
    )
    val oldestStudent = students.maxBy { it.age }
    println(oldestStudent)

    val age40Student = students.firstOrNull { it.age == 40 }
    //first throws NoSuchElement Exception
    println(age40Student)

    val diversity = students.filterIndexed { _, st -> st.gender == Gender.FEMALE }
            .mapIndexed() { i, st -> "${st.name} at $i" }
    println(diversity)

    val characters = students.map { it.name }
            .map { it.split("") }
            .flatMap { it }
            .map { it.toUpperCase() }
            .filter { it.isNotEmpty() }
            .distinct()
    println(characters)

}