fun main(){
    var monetaryAmount = 0

    println("Please input 5 monetary amount: ")
    monetaryAmount = readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()
    monetaryAmount += readln().toInt()

    print("Divide the value by how many? ")
    monetaryAmount /= readln().toInt()
    println("Answer: $monetaryAmount")
}