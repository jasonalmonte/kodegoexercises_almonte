package activity6_b_Exceptions
//import activity4_b.Illustrator
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(){
    var borrow = Borrower()
    borrow.addBorrower(Person("JASON","ALMONTE"),Books("Almanac","2022",BookStatus.AVAILABLE))
    borrow.addBorrower(Person("JANNISA","Ordinario"),Books("History","2022",BookStatus.AVAILABLE))

    borrow.tooManyItem(Person("JANNIsSA","Ordinario"))
    borrow.unpaidDues(Person("JASON","Ordinario"))
    borrow.bookBorrowStatus("Gravity")
}
sealed class BorrowExceptions(message: String):Exception(message){
    class TooManyItem(message:String = "Cannot borrow due to too many items still borrowed") : BorrowExceptions(message)
    class UnpaidDues(message:String = "Cannot borrow Exception due to unpaid dues") : BorrowExceptions(message)
    class BookReserved(message:String = "Cannot borrow due to reserved") : BorrowExceptions(message)
    class NotAvailable(message:String = "Cannot borrow due to item only used in library") : BorrowExceptions(message)
    class ForRepair(message:String = "Cannot borrow due to item needs to be fixed") : BorrowExceptions(message)
}

class Borrower{
    var listOfBooks: HashMap<Books,BookStatus> = HashMap()
    var borrowedBooks: HashMap<Person, Books> = HashMap()

    fun addBorrower(person: Person, books: Books){
        borrowedBooks[person] = books
    }
    fun addBooks(books: Books){
        listOfBooks[books] = books.available
    }
    fun tooManyItem(person: Person){
        var countItem: Int = 0
        addBorrower(Person("JANNIsSA","Ordinario"),Books("History","2022", BookStatus.AVAILABLE))
        addBorrower(Person("JANNIsSA","Ordinario"),Books("History","2022",BookStatus.AVAILABLE))
        addBorrower(Person("JANNIsSA","Ordinario"),Books("History","2022",BookStatus.AVAILABLE))

        for(entries in borrowedBooks.entries){
            if(person.firstName == entries.key.firstName){
                countItem ++
            }
        }
        if(countItem > 3){
            throw BorrowExceptions.TooManyItem()
        }
    }

    fun unpaidDues(person: Person){
        for(entries in borrowedBooks.entries){
            if(person.firstName == entries.key.firstName){
                throw BorrowExceptions.UnpaidDues()
            }
        }
    }

    fun bookBorrowStatus(books: String){
        addBooks(Books("Almanac","2022",BookStatus.AVAILABLE))
        addBooks(Books("History","2021",BookStatus.RESERVED))
        addBooks(Books("Gravity","2024",BookStatus.RESERVED))
        addBooks(Books("The Myt","2020",BookStatus.NOT_AVAILABLE))

        for(entries in listOfBooks.entries){
            if(books== entries.key.authors){
                if(entries.key.available == BookStatus.RESERVED){
                    throw BorrowExceptions.BookReserved()
                }
                if(entries.key.available == BookStatus.NOT_AVAILABLE){
                    throw BorrowExceptions.NotAvailable()
                }
                if(entries.key.available == BookStatus.FOR_REPAIR){
                    throw BorrowExceptions.ForRepair()
                }
            }
        }

    }

}
class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthday: Date = Date()
    //
    constructor(firstname: String, lastname: String){
        this.firstName = firstname
        this.lastName = lastname
    }
}
class Books{
    var authors: String = ""
    //var yearPublished: String = ""
    var edition: String = ""
    var isbn: String = ""
    var publisher: String = ""
    var listOfChapter: ArrayList<String> = ArrayList()
    var pages = 0 ..100
    var available: BookStatus = BookStatus.UNKNOWN

    constructor(authors: String, publisher: String,available: BookStatus){
        this.authors = authors
        this.publisher = publisher
        this.available = available
    }

}


enum class BookStatus(){
    RESERVED,
    FOR_REPAIR,
    NOT_AVAILABLE,
    AVAILABLE,
    UNKNOWN
}

class Magazine(title: String): Publication(title){
    var editor: String = ""
    //var title: String = ""
    //var monthPublished: Int = 0
    // var yearPublished: Int = 0
}
class Newspaper(title: String): Publication(title){
    var name = ""
    var dayPublished: Int = 0
    //var yearPublished: Int = 0
    var headline: String = ""
}
class Comics(title: String): Publication(title){
    //var title: String = ""
    //var monthPublished: String = ""
    //var yearPublished: Int = 0
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var publisher: String = ""
}

open class Publication(title: String){
    var title: String = ""
    var monthPublished: String = ""
    var yearPublished: Int = 0

    fun searchPublishedDate(){}
    fun addPublication(){}
    fun editInformation(){}
}

open class AuthorsIllustrator{
    var firstName: String = ""
    var lastName: String = ""
    var middleName: String = ""
    var dateBirth: Date = Date()
}
class Authors : AuthorsIllustrator() {}
class Illustrator: AuthorsIllustrator(){}


class AudioVideo{
    var type = AudioVideoType.UNKNOWN
    var length: Int = 0
    var dateRecorded: Date = Date()
    var title: String = ""
    var publisher: String = ""
}

enum class AudioVideoType{
    CASSETTES,
    MICRO_FILMS,
    TAPE_RECORDING,
    FILMSTRIPS,
    PROJECTOR,
    FLASHCARDS,
    UNKNOWN
}