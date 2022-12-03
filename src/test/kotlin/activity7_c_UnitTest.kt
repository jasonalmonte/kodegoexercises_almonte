import activity7_c_UnitTest.Carts
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import activity7_c_UnitTest.Errors

internal class CartTester{

    private val carts: Carts = Carts()

    @Test
    fun addItemCheck(){
        assertThrows<Errors.ProductNotFind>{
            carts.addItems("Mangoo")
        }
    }

    @Test
    fun checkOutCheck(){
        assertThrows<Errors.InsufficientStock>{
            carts.checkOut("Apple",100,100,15.0F,100.0F)
        }
        assertThrows<Errors.InsufficientCash>{
            carts.checkOut("Apple",0,100,15.0F, 100.0F)
        }
    }



}