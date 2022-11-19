package activity1_g

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){
    var string1: String = ""
    var palindrome: Boolean = true

    logger.info{ "Input string:"}
    string1 = readln().uppercase()

    for(char in 0 until string1.length){

        if(string1[char] != string1[(string1.length - char) -1]) {
            palindrome = false
        }

    }

    if(palindrome){
        logger.info{ " $string1 - Palindrome"}
    }else{
        logger.info{ " $string1 - Not Palindrome"}
    }

    palindrome = true
}