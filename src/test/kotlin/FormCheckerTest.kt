import OOP.MobileNumberException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import OOP.FormChecker

//val formChecker: FormChecker = FormChecker()
internal class SampleTest{
    private val formChecker: FormChecker = FormChecker()

    @Test
    fun checkCellNumberLength(){
        assertThrows<MobileNumberException>{
            formChecker.checkCellNumber("091111111119") // 12 digit
        }
        assertThrows<MobileNumberException.InvalidLength>{
            formChecker.checkCellNumber("091111111119") //12 digit
        }
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooLong>{ //13 digit
            formChecker.checkCellNumber("0911111111119")
        }
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooShort>{ //8 digit
            formChecker.checkCellNumber("09111119")
        }
    }
}

