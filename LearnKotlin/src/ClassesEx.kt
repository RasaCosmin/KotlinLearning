open class Player(val name: String, val age: String, val gender: String){
    open fun attack(){
        println("ataca")
    }

    fun defend(){
        println("apara")
    }

    fun walk(){
        println("merge")
    }
}

class Thief(name:String, age:String, gender: String, val weapon:String): Player(name, age, gender){
    override fun attack() {
        println("ataca cu $weapon")
    }

    fun jump(){
        println("sare")
    }
}

class Warrior(name:String, age:String, gender: String, val power:String): Player(name, age, gender){
    fun activatePower() {
        println("putere activa $power de la $age ani")
    }
}

fun main(args: Array<String>) {
    val thief = Thief("Ion", "3", "M", "cutit")
    thief.attack()
    thief.walk()
    thief.jump()
    val warrior = Warrior("C", "2", "M", "laser")
    warrior.attack()
    warrior.walk()
    warrior.activatePower()
}