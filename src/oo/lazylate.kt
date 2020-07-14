package oo

val lazyMe: String by lazy {
    println("Intitalisng LazyMe")
    "LazyIsOk"
}

class Personal() {
    lateinit var favorite: String
    fun loadData() {
        println("Loading favorite")
        println("IsInit: ${this::favorite.isInitialized}")
        favorite = "Favorite"
        println("IsInit: ${this::favorite.isInitialized}")
    }

}

fun main() {
    println(lazyMe)
    //Intitalisng LazyMe
    //LazyIsOk
    println(lazyMe)
    //LazyIsOk

    val personal = Personal()
    //Throws UninitializedPropertyAccessException
    //println(personal.favorite)

    personal.loadData()
    println(personal.favorite)

}