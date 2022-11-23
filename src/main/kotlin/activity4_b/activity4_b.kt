package activity4_b

import java.util.Date

class Books{
    var title: String = ""
    var authors: String = ""
    var yearPublished: String = ""
    var edition: String = ""
    var isbn: String = ""
    var publisher: String = ""
    var listOfChapter: ArrayList<String> = ArrayList()
    var pages = 0 ..100

}
open class Article{
    var title: String = "article"
    var content: String = ""
    var author: String = ""

}
class Magazine: Article(){
    var editor: String = ""
  //var title: String = ""
    var monthPublished: Int = 0
    var yearPublished: Int = 0
}


class Newspaper: Article(){
    var name = ""
    var dayPublished: Int = 0
    var yearPublished: Int = 0
    var headline: String = ""
}

class Authors{
    var firstName: String = ""
    var lastName: String = ""
    var middleName: String = ""
    var dateBirth: Date = Date()

}

fun main(){
//var comics: Comics = Illustrator()

}
open class Comics{
    var title: String = ""
    var monthPublished: String = ""
    var yearPublished: Int = 0
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var publisher: String = ""
}
class Illustrator: Comics() {
    var firstName: String = ""
    var lastName: String = ""
    var middleName: String = ""
    var dateBirth: Date = Date()
}

fun search(){
    var search: ArrayList<String> = ArrayList()
}

fun listNames(){
    var listNames: ArrayList<String> = ArrayList()
}

class AudioVideo{
    var length: Int = 0
    var dateRecorded: Date = Date()
    var title: String = ""
    var publisher: String = ""

}

class Publisher(){
    var publisherName: String = ""
    var address: String = ""
    var dateEstablished: Date = Date()
}


