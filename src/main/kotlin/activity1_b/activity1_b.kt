import mu.KotlinLogging
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private val logger = KotlinLogging.logger{}
fun main(){

//    Activity 01  - B
//    You are tasked to automate a school’s library.
//    Identify the items that can be borrowed in a Library.
//    After listing the different items, identify the characteristics of the items.
//    Use the proper data types.

    //BOOK INFORMATION
    var isbn:Int
    var bookTitle:String = ""
    var bookAuthor:String = ""
    var bookTypes:String = ""
    var canBorrow:Boolean = false
    var bookLocation:String = ""
    var bookBorrowed:Boolean = false
    var bookAvailable:Boolean = false

    bookAvailable = canBorrow == true and bookBorrowed == false

    if (bookAvailable){
        logger.info { "$bookTitle available to borrow!" }
    }else {
        logger.info { "$bookTitle unavailable to borrow!" }
    }

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //BORROWED INFO
    var borrowedDate = dateToday
    var borrowedName = ""
    var borrowedBook = bookTitle
    var howManyDays:Long = 5L //5 days need to return
    var borrowedReturn = LocalDateTime.now().plusDays(howManyDays).format(formatter)

    if (dateToday > borrowedReturn ){
        logger.info { "$bookTitle book need to return!" }
    }


}