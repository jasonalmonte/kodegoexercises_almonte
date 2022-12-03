package activity6_a_Exceptions

fun main(){
    var studentGrade : ArrayList<Double> = ArrayList()

    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)
    studentGrade.add(80.0)

    try {
        println(studentGrade[11])
    }catch(e:Exception){
        e.printStackTrace()
    }
    println("OPS")
}