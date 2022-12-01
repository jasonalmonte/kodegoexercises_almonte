package activity5_d

open class Players{
    var name: String = ""
    var color: PlayerColor = PlayerColor.RED
}

enum class PlayerColor{
    BLACK,
    BLUE,
    RED,
    YELLOW,
}

class Traps : Players(){
    var snake: ArrayList<String> = ArrayList()
    var location: HashMap<Players,Int> = HashMap()
    fun move(){  }
}

class Reward : Players(){
    var ladder: ArrayList<String> = ArrayList()
    var moves: ArrayList<String> = ArrayList()
    fun move(){  }
}

fun diceRoll(): Int{
    return (1..6).random()
}

fun main(){
// prints new sequence every time
    println(diceRoll())

    var trap = Traps()

    trap.location.keys


}