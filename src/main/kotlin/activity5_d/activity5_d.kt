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
    UNKNOWN
}

class BoardRules (name: String, color :PlayerColor): Players(name, color), Movement{

    private var playerList: ArrayList<Players> = ArrayList()
    private var location: HashMap<Players,Int> = HashMap()
    var haveWinner: Boolean = false

    private var ladderMap: Map<Int, Double> = mutableMapOf((1 to 5.0), (24 to 5.0), (30 to 20.0),(55 to 10.0),
        (66 to 10.0), (75 to 2.0))
    private var snakeMap: Map<Int, Double> = mutableMapOf((10 to -5.0), (25 to -5.0), (37 to -20.0),(53 to -10.0),
        (67 to -25.0), (78 to -16.0), (81 to -27.0),(99 to -71.0))

    private var ladder = ladderMap as HashMap<Int,Double>
    private var snake = snakeMap as HashMap<Int,Double>

    override fun rolledDice(): Int {
        return (1..6).random()
    }
    fun addPlayers(player: Players){
        playerList.add(player)
    }
    fun moveTo(player: Players, dice: Int){
        var position: Int = 0
        var actual: Int = 0

        if(!haveWinner){
            println("[${player.name}, ${player.color}] Turns")

            for(index in location.entries){
                if(index.key.name == player.name){
                    position = index.value
                    location.keys.removeIf{ key -> key.name ==  player.name}
                    break
                }
            }
            actual = position + +dice
            println(" - Rolled dice $dice, Move from $position to [$actual]")
            actual = snakeAndLadder(actual)
            location[player] = actual

            if(position +dice >= 100){
                println("------------------------------------------------------")
                println("Congratulation! ${player.name} has won this game.")
                haveWinner = true
            }
        }
    }
    private fun snakeAndLadder(newPosition: Int): Int{
        for(entries in ladder.entries){
            if(newPosition == entries.key){
                println(" - Ladder!! : Move forward from $newPosition [+${entries.value}] to ${newPosition + entries.value.toInt()}")
                return newPosition + entries.value.toInt()
            }
        }
        for(entries in snake.entries){
            if(newPosition == entries.key){
                println(" - Snake!! : Move back from $newPosition [${entries.value}] to ${newPosition + entries.value.toInt()}")
                return newPosition + entries.value.toInt()
            }
        }
            return newPosition
    }
}
interface Movement{
    fun rolledDice():Int{return 0}
    fun moveTo(){}
    fun trapSnake(){}
    fun getLadder(){}

}

fun main(){

    //var rolled = Rolled()
    var boardRules = BoardRules("", PlayerColor.UNKNOWN)

    boardRules.addPlayers(Players("Player1",PlayerColor.RED))
    boardRules.addPlayers(Players("Player2",PlayerColor.BLUE))
    boardRules.addPlayers(Players("Player3",PlayerColor.BLACK))
    boardRules.addPlayers(Players("Player4",PlayerColor.YELLOW))

    do{
        boardRules.moveTo(Players("Player1",PlayerColor.RED),boardRules.rolledDice())
        boardRules.moveTo(Players("Player2",PlayerColor.BLUE),boardRules.rolledDice())
        boardRules.moveTo(Players("Player3",PlayerColor.BLACK),boardRules.rolledDice())
        boardRules.moveTo(Players("Player4",PlayerColor.YELLOW),boardRules.rolledDice())
    }while(!boardRules.haveWinner)

}