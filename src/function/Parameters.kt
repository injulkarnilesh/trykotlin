package function

import hello.Person

fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

fun personOf(name: String = "", age: Int = 0) = Person(name, age)