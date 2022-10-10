import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

//    You are tasked to automate an inventory system for a grocery.
//    Identify the items that can be bought in a grocery store.
//    After listing the different items, identify the characteristics of the items.
//    You are also tasked to group the items in categories to help manage the grocery.
//    Use the proper data types.

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //
    var dateNow = dateToday
    var itemCode:String = ""
    var itemDescription:String = ""
    var itemCategory:String = ""
    var quantity = 0
    var stocks = 0

    if (stocks == 0){
        println("Not enough stocks")
    }else{
        stocks -= quantity
        println("Successful!, New stock $stocks")
    }





}