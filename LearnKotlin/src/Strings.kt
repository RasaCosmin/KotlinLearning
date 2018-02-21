fun main(args: Array<String>) {
    val str = "Salut ba"
    println(str)

    val str1 = "salut \"Ionica\""
    println(str1)

    val rawCrawl = """|A long time
        |are o lita
        |dasdad
        |daasda """.trimMargin()
    println(rawCrawl)

    /*for (char in str){
        println(char)
    }*/

    val contentEquals = str.contentEquals(str1)
    println(contentEquals)

    val contains = str.contains("salut", true)
    println(contains)

    val upercase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(upercase)
    println(lower)

    val num  = 3
    val strN = num.toString()
    println(strN)
    println(num)

    val substr = str.subSequence(3, 5)
    println(substr)

    val luke = "Luke "
    val sabie  = "verder"
    val mas = "landspeeder"
    val ani = 233

    println(luke + " are o sabie "+ sabie+ " si conduce "+mas)
    println("$luke are o sabie $sabie si conduce $mas si are $ani ani")

    println("str \"$str\" are ${str.length} caractere")
}