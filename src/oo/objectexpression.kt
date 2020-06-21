package oo

fun main() {
    Controller(object: Repository {  //anonymous class, object expression
        override fun findById(id: Int) = "Id"
        override fun save(str: String) = 12
    })
}