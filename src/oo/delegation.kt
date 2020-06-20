package oo

import kotlin.random.Random

interface Repository {
   fun findById(id: Int): String
   fun save(str: String): Int
}

class FakeRepository: Repository {
    override fun findById(id: Int): String {
        return "ById"
    }
    override fun save(str: String): Int {
        println("${str} saved")
        return Random(100).nextInt();
    }
}

class Controller(repository: Repository): Repository by repository {

}

fun main() {
    val repo = FakeRepository()
    val controller = Controller(repo)
    val found = controller.findById(12)
    println(found)
    controller.save("Yo")
}