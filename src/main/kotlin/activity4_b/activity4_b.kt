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

class Magazine{
    var editor: String = ""
    var title: String = ""
    var monthPublished: Int = 0
    var yearPublished: Int = 0
}


class Newspaper{
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

   var comics: Comics = Illustrator()
    //comics as Illustrator


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



