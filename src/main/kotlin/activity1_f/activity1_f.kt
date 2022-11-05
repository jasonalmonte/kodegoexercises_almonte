import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(){
    var inputA: String?
    var inputB: String?

    var uniqueA: String?
    var uniqueB: String?

    logger.info { "Input A String:" }
    inputA = readln()
    logger.info { "Input A String:" }
    inputB = readln()

    for( indexA in 0 until inputA.length){

        var charA = inputA[indexA]

        for( indexB in 0 until inputB.length){

            var charB = inputB[indexB]

            if (charA == charB){

            }
        }
        logger.info { "S: $charA" }
    }
}