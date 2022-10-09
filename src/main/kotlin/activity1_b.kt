import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

//    Activity 01  - B
//    You are tasked to automate a school’s library.
//    Identify the items that can be borrowed in a Library.
//    After listing the different items, identify the characteristics of the items.
//    Use the proper data types.

    //BOOK INFORMATION
    var bookTitle:String = ""
    var bookAuthor:String = ""
    var bookTypes:String = ""
    var canBorrow:Boolean = false
    var bookLocation:String = ""
    var bookBorrowed:Boolean = false
    var bookAvailable:Boolean = false

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //BORROWED INFO
    var borrowedDate =dateToday
    var borrowedName = ""

    bookAvailable = canBorrow == true and bookBorrowed == false
    println(bookAvailable)


    var book1:String = "The Grudge"
    var book2:String = "The Guns of august"
    var book3:String = "Harry Potter"
    var book4:String = "A Game of Thrones"

    var bookType1:String = "Horror"
    var bookType2:String = "History"
    var bookType3:String = "Fantasy"
    var bookType4:String = "Action"

    var books = arrayOf("The Grudge", "The Guns of august","Harry Potter", "A Game of Thrones")
    var bookType = arrayOf("Horror", "History","Fantasy", "Action")






}