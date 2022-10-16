import mu.KotlinLogging
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
//It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
private val logger = KotlinLogging.logger{}
fun main(){
    var userInput:String = ""
    var monetaryAmount:Double   = 0.0
    var result:Double = 0.0
    var number = 48 .. 57
    var negativeValue:Boolean = false
    var foundInteger :Boolean = false

    //RUN 5 MONETARY INPUT
    for(input in 0 until 5){

        foundInteger = false
        negativeValue = false

        print("[$input] Please input 5 monetary amount: ")
        userInput = readln().toString()

        //CHECK PER CHAR
        for(counter in 0 until  userInput.length){
            var char = userInput[counter].toFloat()

            if (char.toInt() == 45) {
                negativeValue = true
            }else if(char.toInt() in number){
                foundInteger = true
            }else {
                foundInteger = false
                break
            }
        }

        //CONVERT OPERATIONAL SIGN
        if (foundInteger){
            if (negativeValue){
                monetaryAmount += userInput.toInt() + -0
            }else{
                monetaryAmount += userInput.toInt()
            }
            result = monetaryAmount.toDouble()
            logger.info { "Result: ${result}" }
        }else{
            logger.info { "Invalid input in 5 monetary, now exiting the program.." }
            break
        }

    }

    ////////////////////////// DIVIDE TO SUN OF 5 MONETARY //////////////////////////
    negativeValue = false

    print("Divide the value by how many? ")
    userInput = readln().toString()

    //CHECK PER CHAR
    for(counter in 0 until  userInput.length){
        var char = userInput[counter].toFloat()

        if(!foundInteger) {
            foundInteger = false
            break
        }else if(char.toInt() == 45) {
            negativeValue = true
            //logger.info { "Negative value, proceed line.." }
        }else if(char.toInt() in number){
            //logger.info { "Its Int: ${userInput[counter]}" }
            foundInteger = true
        }else {
            //logger.info { "Not Int: ${userInput[counter]}" }
            foundInteger = false
            break
        }
    }

    //CONVERT OPERATIONAL SIGN
    if (foundInteger){
        if(negativeValue){
            monetaryAmount /= userInput.toInt() + -0
        }else{
            monetaryAmount /= userInput.toInt()
        }
        result = monetaryAmount.toDouble()
        logger.info { "User input: ${userInput.toInt() + -0}" }
        logger.info { "Result: ${result}" }
    }else{
        logger.info { "Invalid input in divide by, now exiting the program.." }
    }
}