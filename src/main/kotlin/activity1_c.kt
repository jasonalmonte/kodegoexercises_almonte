fun main(){

//    You are tasked to automate an inventory system for a grocery..
//    Identify the items that can be bought in a grocery store.
//    After listing the different items, identify the characteristics of the items.
//    You are also tasked to group the items in categories to help manage the grocery.
//    Use the proper data types.


    var items = arrayOf("Cigarette","Shampoo","Biscuit","Noodles")
    var prices = arrayOf("15","50","25")

    var names = arrayOf(items, prices)



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