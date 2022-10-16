import mu.KotlinLogging
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
//It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
private val logger = KotlinLogging.logger{}
fun main(){
    var monetaryAmount:String = ""
    var result:Double = 0.0
    var number = 48 .. 57
    var negativeValue:Boolean = false
    var foundInteger :Boolean = false

    logger.info { "Please input 5 monetary amount: " }
    monetaryAmount = readln().toString()

    for(input in 0 until 5){
        println("$input")
    }

    //CHECK ALL CHAR
    for(counter in 0 until  monetaryAmount.length){
        var char = monetaryAmount[counter].toFloat()

        if(char.toInt() in number){
            //println("Its Int: $monetaryAmount")
            logger.info { "Its Int: $monetaryAmount" }
            foundInteger = true
        }else if(char.toInt() == 45){
            logger.info { "Negative value, proceed line.." }
            negativeValue = true
        }else{
            logger.info { "Not Int: ${char.toInt()}" }
            foundInteger = false
            break
        }
    }

    if (foundInteger){
        monetaryAmount.toInt()
        logger.info { "Divide the value by how many? " }
//        monetaryAmount /= readln().toInt()
//        result = monetaryAmount.toDouble()
//        println("Answer: $result")
    }else{
        logger.info { "Invalid input" }
    }

//
//    monetaryAmount += readln().toInt()
//    monetaryAmount += readln().toInt()
//    monetaryAmount += readln().toInt()
//    monetaryAmount += readln().toInt()
//
//    print("Divide the value by how many? ")
//   // monetaryAmount /= readln().toInt()
//    result = monetaryAmount.toDouble()
//    println("Answer: $result")
//
//
//    println("Please input 5 monetary amount: ")
//    repeat(5){
//        print("Input #$it: ")
//        monetaryAmount += readln().toInt()
//    }
//
//    print("Divide the value by how many? ")
//  //  monetaryAmount /= readln().toInt()
//    result = monetaryAmount.toDouble()
//    println("Answer: $result")


}