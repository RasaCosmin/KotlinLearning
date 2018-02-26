/*class Car (val make: String, val model: String, var color: String){
    fun accelerate(){
        println("baga viteza")
    }

    fun details(){
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int){
    fun tow(){
        println("taking the horses to the rodeo")
    }

    fun details(){
        println("The $make $model has $towingCapacity")
    }
}*/

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("baga viteza")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }

    open fun details() {
        println("Vehicle is an $make $model")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("we are going ludicrous mode!")
    }

    override fun details() {
        println("This is a $color $make $model")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    override fun details(){
        println("The $make $model has $towingCapacity")
    }

    fun tow(){
        println("headed out to the mountains")
    }
}


fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 100)
    truck.accelerate()

    /*val car = Car("Fiat", "Albea", "Visiniu")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-150", 100)
    truck.tow()
    truck.details()*/
}