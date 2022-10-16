import mu.KotlinLogging
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
private val logger = KotlinLogging.logger{}
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
    var itemPrice:Float = 0.0F
    var change:Float = 0.0F
    var cash:Float = 0.0F


    if (cash < itemPrice){
        logger.info { "Insufficient Funds" }
    }else if (stocks <= quantity){
        logger.info { "Not enough stocks" }
    }else {
        logger.info { "Proceed" }
    }
}