package activity3_b

import activity3_a.searchStudentName
import activity3_a.searchStudentWildSearch
import activity3_a.showStudents


fun main(){
    var names : ArrayList<String> = arrayListOf("Almanac", "Dictionary", "Peter Pan", "Tom and Jerry", "The Stocks",
        "Titanic", "Jaw", "English Book", "Magazine", "The Bible",
        "Entitled", "The Rules", "Ten Commandments", "The Nation", "Alibata",
        "The History", "Poker", "Card Counting", "Aces", "Cars")
    var inputBook: String = ""

    print("Input Book Title : ")
    inputBook = readln()

    println("[2] Book Record : ${isBookInRecord(inputBook, names)}")
    addBook(inputBook, names)
    removeBook(inputBook,names)
    countBooks(names)
    println("[6] Wild Search : ${searchStudentWildSearch(inputBook,names)}")
    println("[7] Book Name : ${searchStudentName(inputBook,names)}")
    println("[8] Show All Books")
    showBooks(names)
}

fun isBookInRecord(inputBook: String, name: ArrayList<String>): Boolean{
    for(bookName in name.indices){
        if(inputBook == name[bookName]){
            return true
        }
    }
    return false
}

fun addBook(inputBook: String, names: ArrayList<String>){
    names.add(inputBook)
    println("[3] Book Added.")
}
fun removeBook(inputBook: String, names: ArrayList<String>){
    names.remove(inputBook)
    println("[4] Book Removed.")
}
fun countBooks(names: ArrayList<String>): Unit{
    println("[5] Size of Books : ${names.size}")

}
fun searchBookWildSearch(inputBook: String, names: ArrayList<String>):String{
    for(search in names.indices){
        if(inputBook == names[search]){
            return names[search]
        }
    }
    return "Wild search not found."
}

fun searchBookName(inputBook: String, names: ArrayList<String>):String{
    for(search in names.indices){
        if(inputBook == names[search]){
            return names[search]
        }
    }
    return "Book search not found."

}

fun showBooks(names: ArrayList<String>){
    for(entries in names.indices){
        println("    Book[${entries +1}] - ${names[entries]}")
    }
}