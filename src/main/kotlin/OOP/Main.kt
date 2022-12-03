package OOP
import OOP.CellNumberException
import OOP.MobileNumberException
import OOP.isNumeric

class FormChecker {
    fun checkCellNumber(cellNumber: String){
        if(cellNumber.length > 11) {
            throw MobileNumberException.InvalidLength.MobileNumberTooLong()
        }

        if(cellNumber.length < 11) {
            throw MobileNumberException.InvalidLength.MobileNumberTooShort()
        }

        if(!isNumeric(cellNumber))
            throw CellNumberException("Contains Alphabets")
    }

    fun getTax(values:ArrayList<Int>): Double{
        var sum = 0
      if(values.size == 0)
          return 0.0
      for(value in values){
          sum += value
      }
        return sum * .12
    }
}