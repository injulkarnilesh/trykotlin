package `null`

fun main() {
    var name: String = "Nilesh"
    var surname: String? = null

    println("$name $surname") //Nilesh null
    println("${name.length} ${surname?.length}")  //6 null
    println("${name.length} ${surname?.length ?: 0}") //6 0

    var nameLength: Int = name.length
    var surnameLength: Int? = surname?.length
    var surnameLengthDefault: Int = surname?.length ?: 0

    println("$nameLength, $surnameLength, $surnameLengthDefault") //6, null, 0

    val listOfNullableInt: List<Int?> = listOf(2, null, 5)
    val nullableList: List<Int>? = null //listOf(2, 5)
    println("L: ${listOfNullableInt.size} LN: ${nullableList?.size ?: 0}")

    surname!! //if null npe, if not further acts as non-nullable
    println(surname.length)
}