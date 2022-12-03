
import java.util.*
import kotlin.collections.ArrayList

open class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthday: Date = Date()
    var grade: Double = 0.0
    //
    constructor(firstname: String, lastname: String, grade: Double){
        this.firstName = firstname
        this.lastName = lastname
        this.grade = grade
    }
}
open class Student(firstName: String,lastName: String, grade: Double): Person(firstName,lastName,grade){
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

sealed class GradeException(message: String):Exception(message){
    class TenOnly(message:String = "10 Entries Only") : GradeException(message)
    class InvalidInput(message:String = "Invalid input") : GradeException(message)
    class IncompleteGrades(message:String = "Incomplete Grades") : GradeException(message)
}

fun main(){
    var certificateStudent1 = CertificateStudent("Jhon","Almonte",0.0)
    certificateStudent1.listOfColleges.add("Computer Technician")
    certificateStudent1.listOfColleges.add("Network Technician")
    certificateStudent1.listOfColleges.add("Electrical Technician")
    certificateStudent1.printView(certificateStudent1.firstName)

    var certificateStudent2 = CertificateStudent("Jason","Almonte",0.0)
    certificateStudent2.listOfColleges.add("Public Speaking")
    certificateStudent2.listOfColleges.add("Debate")
    certificateStudent2.listOfColleges.add("Advertising Article")
    certificateStudent2.printView(certificateStudent2.firstName)

    var underGraduateStudent1 = UnderGraduateStudent("Undergraduate Student1","",0.0)
    underGraduateStudent1.listOfColleges.add("College of Engineering")
    underGraduateStudent1.listOfDegree.add("Bachelor of Interior Design")
    underGraduateStudent1.yearJoined = 2020.0
    underGraduateStudent1.yearEnded = 2022.0
    underGraduateStudent1.printView(underGraduateStudent1.firstName)

    var masterStudent = UnderGraduateStudent("Master Student1","",0.0)
    masterStudent.listOfColleges.add("College of Engineering")
    masterStudent.listOfDegree.add("Master in Design")
    masterStudent.yearJoined = 2022.0
    masterStudent.yearEnded = 2023.0
    masterStudent.printView(masterStudent.firstName)

    var exceptionGrades = ExceptionGrade()
    exceptionGrades.grades.add(Student("jaosn","apdssad", 80.0))
    exceptionGrades.grades.add(Student("Jason","Ordinario", 0.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))

    exceptionGrades.grades.add(Student("jaosn","apdssad", 80.0))
    exceptionGrades.grades.add(Student("Jason","Ordinario", 0.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))
    exceptionGrades.grades.add(Student("jaosn","apdssad", 100.0))

    exceptionGrades.moreThanTen()
    exceptionGrades.incompleteGrades()
    exceptionGrades.invalidInput()
}

class ExceptionGrade{
    var grades: ArrayList<Student> = ArrayList()
    fun moreThanTen(){
        if(grades.size == 10){
            throw GradeException.TenOnly()
        }
    }
    fun invalidInput(){
        if(grades.size > 10){
            throw GradeException.InvalidInput()
        }
    }
    fun incompleteGrades(){
        for(entries in 0 until grades.size){
            if(grades[entries].grade == 0.0){
                throw GradeException.IncompleteGrades()
            }
        }
    }
}

class CertificateStudent(firstName: String, lastName: String, grade: Double): Student(firstName,lastName,grade){
    var listOfColleges: ArrayList<String> = ArrayList()

    fun printView(Student: String){
        println( "${Student}, $listOfColleges")
    }
}
class UnderGraduateStudent(firstName: String, lastName: String, grade: Double): Student(firstName,lastName,grade){
    var listOfColleges: ArrayList<String> = ArrayList()
    var listOfDegree: ArrayList<String> = ArrayList()
    var yearJoined: Double = 0.0
    var yearEnded: Double = 0.0
    var status = StudentStatus.UNKNOWN
    fun printView(Student: String){
        println( "${Student}, $listOfColleges, $listOfDegree, $yearJoined(start), $yearEnded(end)")
    }
}

class MasterStudent(firstName: String, lastName: String, grade: Double): Student(firstName,lastName,grade){
    var listOfColleges: ArrayList<String> = ArrayList()
    var listOfDegree: ArrayList<String> = ArrayList()
    var yearJoined: Double = 0.0
    var yearEnded: Double = 0.0
    var status = StudentStatus.UNKNOWN
    fun printView(Student: String){
        println( "${Student}, $listOfColleges, $listOfDegree, $yearJoined(start), $yearEnded(end)")
    }
}