import mu.KotlinLogging
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
//It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
private val logger = KotlinLogging.logger{}
fun main(){
    var userInput:String = ""
    var monetaryAmount = 0
    var result:Double = 0.0
    var number = 48 .. 57
    var negativeValue:Boolean = false
    var foundInteger :Boolean = false


    for(input in 0 until 5){

        foundInteger = false
        negativeValue = false

        logger.info { "[$input] Please input 5 monetary amount: " }
        userInput = readln().toString()

        //Check per char
        for(counter in 0 until  userInput.length){
            var char = userInput[counter].toFloat()

            if (char.toInt() == 45) {
                negativeValue = true
                logger.info { "Negative value, proceed line.." }
            }else if(char.toInt() in number){
                    logger.info { "Its Int: ${userInput[counter]}" }
                    foundInteger = true
            }else {
                    logger.info { "Not Int: ${userInput[counter]}" }
                    foundInteger = false
                    break
            }
        }

        if (foundInteger){
            if (negativeValue){
                monetaryAmount = -userInput.toInt()
            }else{
                monetaryAmount = userInput.toInt()
            }
            logger.info { "Userinput: $monetaryAmount" }
            logger.info { "Divide the value by how many? " }
//        monetaryAmount /= readln().toInt()
//        result = monetaryAmount.toDouble()
//        println("Answer: $result")
        }else{
            logger.info { "Invalid input" }
            break
        }

    }




    }

    //CHECK ALL CHAR






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

