package oo

class Employee(val name: String, val id: String) {

    class Age(val value: Int) {
        fun print() {
            println("Age ${this.value}")
        }
    }

    inner class Address(val street: String, val city: String) {
        fun print() {
            println("Name: ${this@Employee.name} Address: ${this.street}, ${this.city}")
        }
    }

}

fun main() {
    val emp1 = Employee("Nilesh", "in01")
    val age = Employee.Age(23)
    age.print()

    val emp1Address = emp1.Address("Here", "There")
    emp1Address.print()
}