package activity1_h

fun main(){
    var firstValue: Int = 1
    var secondValue: Int = 5
    var primeList: ArrayList<Int> = ArrayList()
    var howManyNaturalNumber: Int = 0

    firstValue = readln().toInt()
    secondValue = readln().toInt()
    var allNumbers = 0..secondValue




    for(getPrimeNumber in allNumbers){
        for(a in allNumbers){
            for(b in allNumbers){

                if(getPrimeNumber == a * b){
                    howManyNaturalNumber ++
                    //println("$a x $b = ${a * b} $count")
                }
            }
        }

        if((howManyNaturalNumber <= 2) && ( getPrimeNumber >= firstValue) && (getPrimeNumber <= secondValue)){
            primeList.add(getPrimeNumber)
           // println("Prime Number $getPrimeNumber")
        }else{
           // println("Not Prime Number")
        }

        howManyNaturalNumber = 0
    }

    print("1,$secondValue -> ")
    for(printPrimeList in primeList.indices){
        print("${primeList[printPrimeList]} ")
    }
}