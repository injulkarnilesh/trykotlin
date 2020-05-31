package `null`

import flow.Animal
import flow.Cat
import flow.Cow
import flow.Dog

fun talk(animal: Animal): String? {
    if (animal is Cat) {
        val cat = animal as Cat
        return cat.mew()
    }
    if (animal is Dog) {
        //No casting required
        return animal.bark();
    }
    return (animal as? Cow)?.moo();
}

fun main() {
    println(talk(Dog()))
    println(talk(Cat()))
    println(talk(Cow()))
}