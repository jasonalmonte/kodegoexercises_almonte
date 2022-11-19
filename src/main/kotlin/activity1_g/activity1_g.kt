package activity1_g

fun main(){
    var string1: String = ""
    var storeString1: String = ""
    var palindrome: Boolean = false

    println("Input string:")
    string1 = readln()
    for(char in 0 until string1.length){
        storeString1 += string1[char]

        if(string1[char] != string1[(string1.length - char) -1]) {
            palindrome = true
        }
        println("A: ${string1[char]} B: ${string1[(string1.length - char) -1]}")
    }

}