import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(){

  //  var studentnames:ArrayList<Any> = arrayOf("asd","asdsa141")
    //studentnames.add("14214")
    var position: Array<String> = arrayOf("asd","asdsa141")
position[1] = "asd"
    logger.info { position.size}


    var inputA: String?
    var inputB: String?

    var uniqueA: String? = ""
    var uniqueB: String? = ""

    var findUnique: Boolean = true

    logger.info { "Input A String:" }
    inputA = readln()
    logger.info { "Input A String:" }
    inputB = readln()

    for( indexA in 0 until inputA.length){
        var charA = inputA[indexA]

        for( indexB in 0 until inputB.length){
            var charB = inputB[indexB]

            if (charA == charB){
                findUnique = false
            }
        }


        if (findUnique) {
            uniqueA = uniqueA.plus(",").plus(charA).plus(",")
        }

        findUnique = true
    }

    logger.info { "S: $uniqueA" }


}