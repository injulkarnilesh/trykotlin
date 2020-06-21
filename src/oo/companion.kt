package oo

interface Factory<T> {
    fun create(): T
}

class Animal(val name: String, val age: Int) {
    companion object {
        val field: Int = 100
        fun doWork() {
            println("Animal Works")
        }
        @JvmStatic fun staticOne() {
            println("Static Called")
        }
    }
}

class Pet() {
    companion object: Factory<Pet> { //can implement methods
        override fun create() = Pet()
    }
}

fun main() {
    Animal.doWork()
    println(Animal.field)
    Animal.staticOne()

    val pet = Pet.create()
    fun Pet.Companion.extenstionFromJson(str: String): Pet {
        println("JSON ${str}")
        return Pet()
    }

    val fromJson = Pet.extenstionFromJson("")
}


