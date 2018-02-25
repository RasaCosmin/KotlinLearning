fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah", "Luke", "Han solo", "Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeded", "Boba Fett" to " ceva")

    for (rebel in rebels) {
        println(rebel)
    }

    for ((key, value) in rebelVehicles) {
        println("$key has $value")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}