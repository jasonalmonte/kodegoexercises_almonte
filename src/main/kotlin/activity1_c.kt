fun main(){

//    var items = arrayOf("Noodles","Shampoo","Biscuit")
//    var prices = arrayOf("15","50","25")
//
//    var names = arrayOf(items, prices)

    var userName:String? = null
    var needAnyhelp:String? = null

    print("Enter your name: ")
    userName = readln().toString()
    println("Do you need any help? ")
    needAnyhelp = readln().toString()

    var plusplus = 0
    plusplus += 5
    println(++plusplus)

    if (needAnyhelp.lowercase() == "y"){
        println("How may i help you?")
    }else if (needAnyhelp.lowercase() == "n") {
        println("Type n")
    }
    else {
        println("oh okay ...")
    }
    println("Thank ypu very much")

}