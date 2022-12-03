package activity5_a

import java.lang.Exception
import java.util.*

open class Person{
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
open class Student(firstName: String,lastName: String,): Person(firstName,lastName){
    var id: Int = 0
    var yearEntered: Double = 0.0
}

enum class StudentStatus{
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    UNKNOWN,
    SHIFTED,
}

fun main(){
    var certificateStudent1 = CertificateStudent("Jhon","Almonte")
    certificateStudent1.listOfColleges.add("Computer Technician")
    certificateStudent1.listOfColleges.add("Network Technician")
    certificateStudent1.listOfColleges.add("Electrical Technician")
    certificateStudent1.printView(certificateStudent1.firstName)

    var certificateStudent2 = CertificateStudent("Jason","Almonte")
    certificateStudent2.listOfColleges.add("Public Speaking")
    certificateStudent2.listOfColleges.add("Debate")
    certificateStudent2.listOfColleges.add("Advertising Article")
    certificateStudent2.printView(certificateStudent2.firstName)

    var underGraduateStudent1 = UnderGraduateStudent("Undergraduate Student1","")
    underGraduateStudent1.listOfColleges.add("College of Engineering")
    underGraduateStudent1.listOfDegree.add("Bachelor of Interior Design")
    underGraduateStudent1.yearJoined = 2020.0
    underGraduateStudent1.yearEnded = 2022.0
    underGraduateStudent1.printView(underGraduateStudent1.firstName)

    var masterStudent = UnderGraduateStudent("Master Student1","")
    masterStudent.listOfColleges.add("College of Engineering")
    masterStudent.listOfDegree.add("Master in Design")
    masterStudent.yearJoined = 2022.0
    masterStudent.yearEnded = 2023.0
    masterStudent.printView(masterStudent.firstName)
}


class CertificateStudent(firstName: String, lastName: String): Student(firstName,lastName){
    var listOfColleges: ArrayList<String> = ArrayList()

    fun printView(Student: String){
        println( "${Student}, $listOfColleges")
    }
}
class UnderGraduateStudent(firstName: String, lastName: String): Student(firstName,lastName){
    var listOfColleges: ArrayList<String> = ArrayList()
    var listOfDegree: ArrayList<String> = ArrayList()
    var yearJoined: Double = 0.0
    var yearEnded: Double = 0.0
    var status = StudentStatus.UNKNOWN
    fun printView(Student: String){
        println( "${Student}, $listOfColleges, $listOfDegree, $yearJoined(start), $yearEnded(end)")
    }
}

class MasterStudent(firstName: String, lastName: String): Student(firstName,lastName){
    var listOfColleges: ArrayList<String> = ArrayList()
    var listOfDegree: ArrayList<String> = ArrayList()
    var yearJoined: Double = 0.0
    var yearEnded: Double = 0.0
    var status = StudentStatus.UNKNOWN
    fun printView(Student: String){
        println( "${Student}, $listOfColleges, $listOfDegree, $yearJoined(start), $yearEnded(end)")
    }
}