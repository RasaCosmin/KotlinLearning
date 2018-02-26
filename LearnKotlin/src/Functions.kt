fun main(args: Array<String>) {
    forceChoke()
    makeAnEntrance("Ce tare esti")

    val rebels = calculateNumber(2, 3)
    println("Nr of good guys = $rebels")
    println("Nr of good guys = ${calculateNumber(3, 4)}")
    vaderIsFeeling()
    vaderIsFeeling("meh")

}

fun forceChoke(){
    println("Ai gresit fraiere")
}

fun makeAnEntrance(line: String){
    println(line)
}

fun calculateNumber(rebels: Int, ewoks: Int): Int{
    return rebels + ewoks
}

fun vaderIsFeeling(mood: String = "angry"){
    println(mood)
}