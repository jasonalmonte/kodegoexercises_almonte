
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
//It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.

fun main(){
    var monetaryAmount = 0
    var result:Double = 0.0

    println("Please input 5 monetary amount: ")
    monetaryAmount = readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()

    print("Divide the value by how many? ")
    monetaryAmount /= readln().toInt()
    result = monetaryAmount.toDouble()
    println("Answer: $result")
}