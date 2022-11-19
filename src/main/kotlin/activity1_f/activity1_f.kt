import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){

    var positions: ArrayList<String> = ArrayList()

    var inputA: String?
    var inputB: String?

    var allUniqueChar: String? = ""

    var findUnique: Boolean = false

    logger.info { "Input A String:" }
    inputA = readln()
    logger.info { "Input B String:" }
    inputB = readln()


    //Check Unique String A
    for( indexA in 0 until inputA.length){
        var charA = inputA[indexA]

        for( indexB in 0 until inputB.length){
            var charB = inputB[indexB]

            if (charA == charB){
                findUnique = true
            }
        }
        if (!findUnique) {
            positions.add(charA.toString())
        }
        findUnique = false
    }

    for( indexB in 0 until inputB.length){
        var charB = inputB[indexB]

        for( indexA in 0 until inputA.length){
            var charA = inputA[indexA]

            if (charB == charA){
                findUnique = true
            }
        }

        if (!findUnique) {
            positions.add(charB.toString())
        }
        findUnique = false
    }


    for(uniques in positions.indices){
        allUniqueChar += positions[uniques]
    }
    logger.info { "Unique : $allUniqueChar" }
}