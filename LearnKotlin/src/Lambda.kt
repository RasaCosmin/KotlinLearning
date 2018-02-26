fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }
    /*
    fun printMessage(message: String){
        println(message)
    }*/

    printMessage("hello")

    val sumA = { x: Int, y: Int -> x + y }

    printMessage(sumA(5, 4).toString())

    val sumB: (Int, Int) -> Int = { x, y -> x + y }

    printMessage(sumB(3, 32).toString())

    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }

    //call downloadData fun
    downloadData("fakeUrl.com", {
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //send a download request
        //we get back car data
        val car = Car("Fiat", "Albea", "visiniu")
        completion(car)
    }

    downloadCarData("fakeCarUrl.com") { car ->
        println(car.color)
        println(car.make)
    }

    downloadCarData("fakeCarUrl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //send a download request
        //we get back car data
        val webRequestSuccess = false
        if (webRequestSuccess) {
            //received truck data
            val truck = Truck("Ford", "F-150", 100)
            completion(truck, webRequestSuccess)
        } else {
            completion(null, webRequestSuccess)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success) {
            //do somwthing with the truck
            truck?.details()
        } else {
            //handle webrequest fail
            println("Fail")
        }
    }
}