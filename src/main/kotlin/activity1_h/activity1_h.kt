package activity1_h

fun main(){
    var intA: Int = 5
    var primeNumber: Boolean = true
    var primeList: ArrayList<Int> = ArrayList()
    var equalBa: Boolean = false
    var count: Int = 0

   var allNumber: ArrayList<Int> = ArrayList()
    var naturalNumber = 0..100

    intA = readln().toInt()
    var xTwo = 0 .. 100 step(2)
    var xThree = 0 .. 100 step(3)

    for(x in naturalNumber){
        allNumber.add(x)
    }

    for(y in allNumber.indices){
        //println(allNumber[y])
    }


    if(intA in xTwo){
        allNumber.removeAt(5)
    }else if(intA in xThree){
        primeNumber = true
    }

    for(getPrime in naturalNumber){
        //println(getPrime)
        for(a in naturalNumber){
            for(b in naturalNumber){
                //println("$a x $b = ${a * b} $count")
                if(intA == a * b){
                    //count ++
                    //println("$a x $b = ${a * b} $count")
                    equalBa = true
                }
                if(getPrime == a * b){
                    count ++
                    //println("$a x $b = ${a * b} $count")
                    equalBa = true
                }
            }
        }

        if (count >= 2){
            primeNumber = false
        }


        if((count <= 2) && (getPrime <= intA)){
            primeList.add(getPrime)
           // println("Prime Number $getPrime")
        }else{
           // println("Not Prime Number")
        }

        count = 0


    }

    for(printPrimeList in primeList.indices){
        println("Prime Number ${primeList[printPrimeList]}")
    }






    primeNumber = false

}