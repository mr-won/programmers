fun main(args: Array<String>) {
    val s1 = readLine()!!
    val result = s1.map {
        when {
            it.isUpperCase() -> it.lowercase()
            it.isLowerCase() -> it.uppercase()
            else -> it
        }
    }.joinToString("")
    println(result)
}