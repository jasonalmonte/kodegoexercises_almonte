package activity3_a

fun main(){
    var names : ArrayList<String> = arrayListOf("Marco", "Eugene", "Sarah", "Isaiah", "Anthony",
                                                "Jason", "Issa", "Mark", "Alice", "Jerome",
                                                "Jackson", "Lebron", "Edgar", "Joshua", "Grain",
                                                "Randy", "Brane", "Lux", "Lucy", "Henry")
    var inputName:String = ""
    var found: Boolean = false

    print("Search in Record : ")
    inputName = readln()

    isStudentInRecord(inputName, names)
    found = isStudentInRecord(inputName, names)
    println("[2] Student in Record : $found")
    addStudent(inputName, names)
    removeStudent(inputName, names)
    countStudent(names)
    println("[6] Wild Search : ${searchStudentWildSearch(inputName,names)}")
    println("[7] Student Name : ${searchStudentName(inputName,names)}")
    println("[8] Search Student....")
    searchStudent(inputName,names)

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

fun searchStudentWildSearch(inputName: String, names: ArrayList<String>):String{
    for(search in names.indices){
        if(inputName == names[search]){
            return names[search]
        }
    }
    return "Wild search not found."
}

fun searchStudentName(inputName: String, names: ArrayList<String>):String{
    for(search in names.indices){
        if(inputName == names[search]){
            return names[search]
        }
    }
    return "Student search not found."
}
fun searchStudent(inputName: String, names: ArrayList<String>){
    var count = 0
    for(char in inputName){
       count ++
    }
    if(count <= 3){
        println("    Less than 3 : ${searchStudentWildSearch(inputName,names)}")
    }else if(count > 3){
        println("    Greater than 3 : ${searchStudentName(inputName,names)}")
    }
}

fun showStudents(names: ArrayList<String>){
    for(entries in names.indices){
        println("    Student[${entries +1}] - ${names[entries]}")
    }
}