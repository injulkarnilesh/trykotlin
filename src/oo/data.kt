package oo

enum class Currency {
    DOLLAR, RUPEE
}
class Money(value: Float, currency: Currency)
data class Paise(val value: Float, val currency: Currency)

fun main() {
    val fiveD1 = Money(5f, Currency.DOLLAR)
    val fiveD2 = Money(5f, Currency.DOLLAR)

    println(fiveD1.equals(fiveD2))  //false
    println(fiveD1 == fiveD2)  //false
    println(fiveD1 === fiveD2) //false
    println(fiveD2 === fiveD2) //true

    val tenRs1 = Paise(10f, Currency.RUPEE)
    val tenRs2 = Paise(10f, Currency.RUPEE)

    println(tenRs1.equals(tenRs2)) //true
    println(tenRs1 == tenRs2) //true
    println(tenRs1 === tenRs2) //false
    println(tenRs1 === tenRs1) //true

    val tenRs3 = tenRs1.copy();
    val tenDollar3 = tenRs1.copy(currency = Currency.DOLLAR);
    println(tenRs3)
    println(tenDollar3)
}
