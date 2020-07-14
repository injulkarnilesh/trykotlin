package extension

fun main() {
    val messageUntrimmed = """Hi\ there
        Who are you?"""

    val messageTrimmed = """Hi theere
        |Why are you?""".trimMargin() //default prefix |

    val messageIndentTrimmed = """
        Hi there
        gapp basatos ka""".trimIndent()

    val customTrimmed = """Hi there
        #kay kay ani""".trimMargin("#")

    println(messageUntrimmed)
    //Hi\ there
    //        Who are you?
    println(messageTrimmed)
    //Hi theere
    //Why are you?
    println(messageIndentTrimmed)
    //Hi there
    //gapp basatos ka
    println(customTrimmed)
    //Hi there
    //kay kay ani
}