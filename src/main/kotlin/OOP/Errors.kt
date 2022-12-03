package OOP

import java.lang.Exception

fun main(){

//    try {
//        var result = 10/0
//    }catch(e: Exception){
//        e.printStackTrace()
//        println("Catch was executed")
//    } finally {
//        println("Finally was executed")
//    }

    try{
        //var result = 10/0

        lateinit var emptyClass : EmptyClass
        emptyClass = EmptyClass("Something")
        emptyClass.doSomething()

    var mobileNumber: String? = null
    println("${mobileNumber!!.length}")

    }catch (ae:ArithmeticException){
        //ae.printStackTrace()
        println("You divided by zero")
    }catch (ue:UninitializedPropertyAccessException){
       // ue.printStackTrace()
        println("Please Instantiate the class you used")
    }catch (e:Exception){
        println("Something went wrong")
        e.printStackTrace()
    } finally {
        println("Finally was executed")
    }

//    var mobileNumber: String? = ""
//    println("${mobileNumber!!.length}")
//
    println("Completed execution")
}

class EmptyClass(var className: String){
    fun doSomething(){

    }
}