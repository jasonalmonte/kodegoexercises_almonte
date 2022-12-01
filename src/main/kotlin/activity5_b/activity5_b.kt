package activity5_b

import activity4_b.Article
import activity4_b.Comics
import activity4_b.Illustrator
import java.util.*
import kotlin.collections.ArrayList


fun main(){

}
class Books: Publication(){
    var authors: String = ""
    //var yearPublished: String = ""
    var edition: String = ""
    var isbn: String = ""
    var publisher: String = ""
    var listOfChapter: ArrayList<String> = ArrayList()
    var pages = 0 ..100

}
class Magazine: Publication(){
    var editor: String = ""
    //var title: String = ""
    //var monthPublished: Int = 0
   // var yearPublished: Int = 0
}
class Newspaper: Publication(){
    var name = ""
    var dayPublished: Int = 0
    //var yearPublished: Int = 0
    var headline: String = ""
}
class Comics: Publication(){
    //var title: String = ""
    //var monthPublished: String = ""
    //var yearPublished: Int = 0
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var publisher: String = ""
}

open class Publication{
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