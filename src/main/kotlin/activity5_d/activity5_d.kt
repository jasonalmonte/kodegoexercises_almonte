package activity5_d

open class Players{
    var name: String = ""
    var color: PlayerColor = PlayerColor.RED

    constructor(name: String, color: PlayerColor){
        this.name = name
        this.color = color
    }

}

enum class PlayerColor{
    BLACK,
    BLUE,
    RED,
    YELLOW,
}


class Traps (name: String, color :PlayerColor): Players(name, color){
    //var snake: Array<Double> = arrayOf(-5.0,-2.0,-4.0,-10.0)
    var location: HashMap<Players,Int> = HashMap()
    var ladder: HashMap<Double,Int> = HashMap()
    var playerList: ArrayList<Players> = ArrayList()

    private var characters: Map<Int, Double> = mutableMapOf((10 to -5.0), (25 to -5.0), (37 to -20.0),(53 to -10.0),
                                                            (67 to -25.0), (78 to -16.0), (81 to -25.0),(99 to -71.0))
    var snake = characters as HashMap<Int,Double>

    fun addPlayers(){
        playerList.add(Players("Player1", PlayerColor.RED))
    }
    fun haveTrap(){
        for(entries in snake.entries){
            if(81 == entries.key){
                println(entries.value)
            }
        }
    }
    fun move(){
        haveTrap()
    }

}
class OnBoard{

}

fun startAutoPlay(){

}

class Reward : Players("Player2", PlayerColor.BLACK){
   // var board: Array<Int> = Array(100, init = 0)
   // var ladder: ArrayList<String> = ArrayList()
    var moves: ArrayList<String> = ArrayList()
    fun move(){  }
}

fun diceRoll(): Int{
    return (1..6).random()
}

fun main(){
// prints new sequence every time
    println(diceRoll())
var traps = Traps("Player1", PlayerColor.RED)
    traps.move()
    var trap:Players = Players("Player1", PlayerColor.RED)
    //Join Player
    //Start
    //Roll -> Rules -> Move
    //Next Player
    }