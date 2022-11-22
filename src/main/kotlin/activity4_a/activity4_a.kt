package activity4_a

fun main(){
    var names : ArrayList<String> = arrayListOf("Marco", "Eugene", "Sarah", "Isaiah", "Anthony")

    var student: ArrayList<Student> = ArrayList()
    var searchInput: String = ""
    student.add(Student("Jeziah","Almonte", 2022))
    student.add(Student("Jaf","Almonte",2021))
    student.add(Student("Jannisa","Jasons",2023))

    searchInput = "Jas"
    println(searchStudentWildSearch( student, searchInput, WhereToSearch.FIRSTNAME))

    var inputName:String = ""
    var found: Boolean = false

    var students: Student = Student("","",0)
    students.firstName = "Jasons"
    students.middleName = "B"
    students.lastName = "Issa"

    print("Search in Record : ")
    inputName = readln()

    isStudentInRecord(inputName, names)
    found = isStudentInRecord(inputName, names)
    println("[2] Student in Record : $found")
    addStudent(inputName, names)
    removeStudent(inputName, names)
    countStudent(names)
    println("[6] Wild Search : ${searchStudentWildSearch(student,searchInput, whereToSearch = WhereToSearch.FIRSTNAME)}")
    println("[7] Student Name : ${searchStudentName(students,names)}")
    println("[8] Search Student....")
    searchStudent(inputName, student, names)

    println("[9] Show Student")
    showStudents(names)
}

fun isStudentInRecord(inputName: String, names: ArrayList<String>):Boolean {
    for(index in names.indices){
        if(names[index] == inputName){
            return true
        }
    }
    return false
}

fun addStudent(inputName: String, names: ArrayList<String>){
    names.add(inputName)
    println("[3] Student Added.")
}

fun removeStudent(inputName: String, names: ArrayList<String>){
    names.remove(inputName)
    println("[4] Student Removed.")
}

fun countStudent(names: ArrayList<String>): Unit{
    println("[5] Count of Student : ${names.count()}")
}

fun searchStudentWildSearch( student: ArrayList<Student>, searchInput: String, whereToSearch: WhereToSearch):String{
    for(searchA in student.indices){
        if(whereToSearch == WhereToSearch.FIRSTNAME){
            if(searchInput in student[searchA].firstName){
                return "Firstname: ${student[searchA].firstName} found."
            }
        }
        if(whereToSearch == WhereToSearch.MIDDLENAME){
            if(searchInput in student[searchA].middleName){
                return "Middlename: ${student[searchA].middleName} found."
            }
        }

        if(whereToSearch == WhereToSearch.LASTNAME){
            if(searchInput in student[searchA].lastName){
                return "Lastname: ${student[searchA].lastName} found."
            }
        }
    }
    return "Wild search not found."
}

fun searchStudentName(student: Student,names: ArrayList<String>):String{
    for(search in names.indices){
        if(student.firstName == names[search]){
            return "Firstname : ${names[search]} found."
        }
    }
    for(search in names.indices){
        if(student.middleName == names[search]){
            return "Middlename : ${names[search]} found."
        }
    }

    for(search in names.indices){
        if(student.lastName == names[search]){
            return "Lastname : ${names[search]} found."
        }
    }
    return "Student search not found."
}

enum class WhereToSearch{
    FIRSTNAME,
    MIDDLENAME,
    LASTNAME,
}
fun searchStudent(inputName: String, student: ArrayList<Student>, names: ArrayList<String>){
    var count = 0
    for(char in inputName){
        count ++
    }
    if(count <= 3){
        println("    Less than 3 : ${searchStudentWildSearch(student, searchInput = "", whereToSearch = WhereToSearch.FIRSTNAME)}")
    }else if(count > 3){
       // println("    Greater than 3 : ${searchStudentName("student",names)}")
    }
}

fun showStudents(names: ArrayList<String>){
    for(entries in names.indices){
        println("    Student[${entries +1}] - ${names[entries]}")
    }
}

class Student{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var nickName: String = ""
    var id: String = ""
    var yearEnrolled: Long = 0

    constructor(firstname: String, lastname: String, yearEnrolled: Long){
        this.firstName = firstname
        this.lastName = lastname
        this.yearEnrolled = yearEnrolled
    }
}

