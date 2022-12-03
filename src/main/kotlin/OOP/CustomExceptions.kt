package OOP

class CellNumberException(message: String) : Exception(message)
sealed class MobileNumberException(message:String) : Exception(message) {

    sealed class InvalidLength(message: String) : MobileNumberException(message)    {
         class MobileNumberTooShort(message:String = "Length is Short") : InvalidLength(message)
         class MobileNumberTooLong(message:String = "Length is Short") : InvalidLength(message)
    }

     class ContainsCharacter(message: String) : MobileNumberException(message)

    sealed class UnknownProvider(message:String) : MobileNumberException(message){
         class NotGlobeProvider(message:String) : UnknownProvider(message)
         class NotSmartProvider(message:String) : UnknownProvider(message)
         class NotTouchMobileProvider(message:String) : UnknownProvider(message)
         class NotTalkNTextProvider(message:String) : UnknownProvider(message)
    }
}

fun main(){
    var cellNumber = "11112223333a"

    try{
        checkCellNumber(cellNumber)
    }catch(e:Exception){
        e.printStackTrace()
    }

}

fun checkCellNumber(cellNumber: String){
    if(cellNumber.length > 11) {
      throw MobileNumberException.InvalidLength.MobileNumberTooShort()
    }

    if(cellNumber.length < 11) {
        throw MobileNumberException.InvalidLength.MobileNumberTooLong()
    }

    if(!isNumeric(cellNumber))
        throw CellNumberException("Contains Alphabets")
}

fun isNumeric(toCheck: String): Boolean{
    return toCheck.all { char -> char.isDigit() }
}

fun checkMobileNumberV2(cellNumber: String) =
    try{
        true
        throw CellNumberException("Invalid Length")
    }catch(e:Exception){
        false
    }