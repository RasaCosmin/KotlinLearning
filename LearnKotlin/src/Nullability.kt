fun main(args: Array<String>) {
   var name: String = "Ionica"
    //name = null

    var nullableName : String? = "Do I really exist?"
    //nullableName = null

    //null check
    var length = 0
    if(nullableName!=null){
        length = nullableName.length
    }else{
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // Safe call operator ?
    println(nullableName?.length)

    //Elvis operator
    val len =  nullableName?.length ?: -1
    println(len)

    val noname = nullableName ?: "No one knows me..."
    println(noname)

    // !!
    println(nullableName!!.length)
}