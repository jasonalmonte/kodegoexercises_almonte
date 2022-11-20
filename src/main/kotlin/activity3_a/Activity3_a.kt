package activity3_a

fun main(){
    var names : ArrayList<String> = arrayListOf("Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry")
    var inputName:String = ""
    var found: Boolean = false

    print("Search in Record: ")
    inputName = readln()

    isStudentInRecord(inputName, names)
    found = isStudentInRecord(inputName, names)
    println(found)
}
fun isStudentInRecord(inputName: String, jason: ArrayList<String>):Boolean {
    for(index in jason.indices){
        if(jason[index] == inputName){
            return true
        }
    }
    return false
}

fun addStudent(){

}

fun removeStudent(){

}

fun countStudent(size: Int){
    println("Size of array: $size")
}


fun searchStudentWildSearch(){

}
fun searchStudentName(){

}
fun searchStudent(){

}
fun showStudents(){

}