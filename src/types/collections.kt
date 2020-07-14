package types

fun main() {
    val mlist = mutableListOf<Int>(1, 2, 3)
    val list: List<Int> = mlist
    //list.add(4)
    //Does not compile as List is read only API

    mlist.add(4)
    println(list)
    //list is updated
    //as it is read only API object is actually not mutable

    println(mlist.javaClass.name)
    println(list.javaClass.name)
    //both are java ArrayList
}