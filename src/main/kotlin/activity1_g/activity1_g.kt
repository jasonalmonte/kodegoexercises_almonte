package activity1_g

fun main(){
    var String1: String = ""

    println("Input string:")
    String1 = readln()

    for(char in 0 .. String1.length){
        println(String1[char])
    }

}