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
    var isbn = arrayOf("10001","10002","10003","10004","10005")
    var bookTitle: Array<String> = arrayOf("BookA","BookB","BookC","BookD","BookE")


    var bookAuthor:String = ""
    var bookTypes:String = ""
    var canBorrow:Boolean = false
    var bookLocation:String = ""
    var bookBorrowed:Boolean = false
    var bookAvailable:ArrayList<Boolean> = ArrayList()

    var user: String = "Librarian"

    //bookAvailable = canBorrow == true and bookBorrowed == false



//    if (bookAvailable){
//        logger.info { "$bookTitle available to borrow!" }
//    }else {
//        logger.info { "$bookTitle unavailable to borrow!" }
//    }

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //BORROWED INFO
    var dateBorrowed: ArrayList<String> = ArrayList()
    var whoBorrowed: ArrayList<String> = ArrayList()
    var borrowedName: String = ""
    var borrowedBook: String = ""
    var howManyDays:Long = 5L //5 days need to return
    var borrowedReturn = LocalDateTime.now().plusDays(howManyDays).format(formatter)

    whoBorrowed.add("Jason")
    whoBorrowed.add("Jhon")
    whoBorrowed.add("Almonte")
    whoBorrowed.add("Issa")
    whoBorrowed.add("Ziah")

    var pressNum:String = ""
    var doIt: Boolean = false

    for(isbnY in isbn.indices){
        dateBorrowed.add("-")
        bookAvailable.add(true)
    }

    while(!doIt){
        println("Press 1: Borrow Book")
        println("Press 2: Info of Book")
        println("Press 3: List of Books")
        pressNum = readln()

        if(pressNum == "1"){
            print("ISBN: ")
            borrowedBook = readln()
            print("Name: ")
            borrowedName = readln()

            for(x in isbn.indices){
                if(borrowedBook == isbn[x]){
                    whoBorrowed[x] = borrowedName
                    dateBorrowed[x] = "Borrowed: $dateToday Return: $borrowedReturn"
                    doIt = true
                }
            }
            if(!doIt){
                logger.info { "isbn not found!" }
            }else{
                logger.info { "borrowed successful!" }
            }

        }
        if(pressNum == "2"){
            print("ISBN: ")
            borrowedBook = readln()

            for(x in isbn.indices){
                if(borrowedBook == isbn[x]){
                    logger.info { "isbn: ${isbn[x]}" }
                    logger.info { "title: ${bookTitle[x]}" }
                    logger.info { "who: ${whoBorrowed[x]}" }
                    logger.info { "available: ${bookAvailable[x]}" }
                    logger.info { "date return: ${dateBorrowed[x]}" }
                    doIt = true
                }
            }
            if(!doIt){
                logger.info { "isbn not found!" }
            }
        }
        if(pressNum == "3") {
            logger.info { "List of Books...." }
            for(isbnX in isbn.indices){
                logger.info { "ISBN: ${isbn[isbnX]} Title: ${bookTitle[isbnX]}" }
            }
        }

        if(!doIt){
            logger.info { "mismatch." }
        }

        if (dateToday > borrowedReturn ){
            logger.info { "$bookTitle book need to return!" }
            println(borrowedReturn)
        }

        doIt = false
    }
}