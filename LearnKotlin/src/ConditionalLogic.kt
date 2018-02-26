fun main(args: Array<String>) {
    val a = 2
    val b = 3

    if (a == b) {
        println("a ii egal cu b")
    }

    if (a != b) {
        println("a nu ii egal cu b")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("Poti sa cumperi")
    } else {
        println("Nu ai bani destui")
    }

    val degree = 40
    if (degree >= 70) {
        println("ii ok")
    } else if (degree >= 50 && degree < 70) {
        println("imbracate")
    } else {
        println("stai in casa")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored){
        println("manca pizza")
    }

    val x = 2

    when(x){
        1 -> println("un om")
        2 -> println("2 omi")
        else -> println("or fi mai multi oameni")
    }

    fun vaderIsFeeling(mood: String = "angry"){
        if(mood == "angry"){
            println("vader is $mood")
        }else{
            println("nu il face angry")
        }
    }

    vaderIsFeeling()
    vaderIsFeeling("bored")
}

