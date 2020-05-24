package extension

fun main() {
    val messageUntrimmed = """Hi\ there
        Who are you?"""

    val messageTrimmed = """Hi theere
        |Why are you?""".trimMargin()

    val messageIndentTrimmed = """
        Hi there
        gapp basatos ka""".trimIndent()

    val customTrimmed = """Hi there
        #kay kay ani""".trimMargin("#")

    println(messageUntrimmed)
    println(messageTrimmed)
    println(messageIndentTrimmed)
    println(customTrimmed)
}