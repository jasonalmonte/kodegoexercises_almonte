import javax.swing.text.StyledEditorKit.BoldAction
import kotlin.system.exitProcess

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
//It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.

fun main(){
    var monetaryAmount:String = ""
    var result:Double = 0.0
    var number = 48 .. 57
    var int :Boolean = false

    println("Please input 5 monetary amount: ")
    monetaryAmount = readln().toString()

    for(counter in 0 until  monetaryAmount.length){
        var char = monetaryAmount[counter].toFloat()

        if(char.toInt() in 48 .. 57){
            println("Its Int: $monetaryAmount")
            int = true
        }else{
            println("Not Int: ${char.toInt()}")

        }
    }

    if (int){
        print("Divide the value by how many? ")
//        monetaryAmount /= readln().toInt()
//        result = monetaryAmount.toDouble()
//        println("Answer: $result")
    }else{
        println("error")
    }

    do {
        var jason = ""
    }while (true)



    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()

    print("Divide the value by how many? ")
   // monetaryAmount /= readln().toInt()
    result = monetaryAmount.toDouble()
    println("Answer: $result")


    println("Please input 5 monetary amount: ")
    repeat(5){
        print("Input #$it: ")
        monetaryAmount += readln().toInt()
    }

    print("Divide the value by how many? ")
  //  monetaryAmount /= readln().toInt()
    result = monetaryAmount.toDouble()
    println("Answer: $result")

}