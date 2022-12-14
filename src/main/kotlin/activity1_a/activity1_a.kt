import mu.KotlinLogging
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
//   Activity 01  - B
//   You are tasked to create a directory of the students taking this course.
//   The data will be used to send updates regarding the classes.
//   There is also a need to know the progress of the students during the progress of this course.
//   List down all data that can be used to implement this. Use the proper data types.

private val logger = KotlinLogging.logger{}
fun main(){

    //INFORMATION DIRECTORY
    var firstname:String? = null
    var middlename:String? = null
    var lastname:String? = null
    var fullName:String = "$firstname $middlename $lastname"
    var facebook:String? = null
    var emailAddress:String? = null
    var course:String? = null  //MD2P
    var batch:Int  //2022
    var activeStudent:Boolean = false

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //EXAM
    var examID:Int
    var examDate = dateToday
    var examGrade:Double = 0.0
    var examComment:String? = null

    //EXERCISES
    var exerciseID:Int
    var exerciseDate = dateToday
    var exerciseGrade:Double = 0.0
    var exerciseComment:String? = null

    //ATTENDANCE
    var attendance:Boolean
    var timeIn = dateToday

    //STUDENT PROGRESS
    var asOfToday = dateToday
    var grades:Double = 0.0
    var exam:Double = 0.0
    var exercises:Double = 0.0
    var attendanceGrades:Double = 0.0

    //PASSING GRADES
    var progressPassing:Double = 80.0
    var activeStudentIndicator:Double = 20.0

    var progressStatus:Boolean = false
    progressStatus = ((grades + exam + exercises + attendanceGrades)/4 > progressPassing)
    activeStudent = ((grades + exam + exercises + attendanceGrades)/4 > activeStudentIndicator)

    if (progressStatus){
        logger.info { "$fullName Passed!" }
    }else{
        logger.info { "$fullName Failed!" }
    }

    if (activeStudent){
        logger.info { "$fullName Active Student!" }
    }else{
        logger.info { "$fullName Not Active Student!" }
    }


}