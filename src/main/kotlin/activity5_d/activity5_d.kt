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


class Rules (name: String, color :PlayerColor): Players(name, color){

    var playerList: ArrayList<Players> = ArrayList()
    var location: HashMap<Players,Int> = HashMap()

    private var ladderMap: Map<Int, Double> = mutableMapOf((10 to -5.0), (25 to -5.0), (37 to -20.0),(53 to -10.0),
        (67 to -25.0), (78 to -16.0), (81 to -25.0),(99 to -71.0))
    private var snakeMap: Map<Int, Double> = mutableMapOf((10 to -5.0), (25 to -5.0), (37 to -20.0),(53 to -10.0),
        (67 to -25.0), (78 to -16.0), (81 to -25.0),(99 to -71.0))

    var ladder = ladderMap as HashMap<Int,Double>
    var snake = snakeMap as HashMap<Int,Double>


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
    fun move(player: Players, position: Int, dice: Int){
        for(index in location.entries){
            if(player.name == index.key.name){

                println(index.key.name)
            }
        }
        location[player] = position
        snakeAndLadder()
    }
    fun snakeAndLadder(){
        for(entries in snake.entries){
            if(81 == entries.key){
                println(entries.value)
                //move + loc next turn
            }
        }
        for(entries in ladder.entries){
            if(81 == entries.key){
                println(entries.value)
                //move + loc next turn
            }
        }
    }




}
class OnBoard{
    fun diceRoll(): Int{
        return (1..6).random()
    }


}

fun startAutoPlay(){


    var rules = Rules("Player1", PlayerColor.RED)
    //rules.rolldice

    var dices = OnBoard()
    rules.move(Players("",PlayerColor.RED),0,dices.diceRoll())

}

class Reward : Players("Player2", PlayerColor.BLACK){
   // var board: Array<Int> = Array(100, init = 0)
   // var ladder: ArrayList<String> = ArrayList()
    var moves: ArrayList<String> = ArrayList()
    fun move(){  }
}



fun main(){
// prints new sequence every time

    var onboard = OnBoard()
    var diceRo: Int = onboard.diceRoll()
    println(diceRo)
    var rules = Rules("Player1", PlayerColor.RED)

    rules.addPlayers()
    rules.move(Players("Player1",PlayerColor.RED),2,diceRo)





    var trap:Players = Players("Player1", PlayerColor.RED)
    //Join Player
    //Start
    //Roll -> Rules -> Move
    //Next Player
    }