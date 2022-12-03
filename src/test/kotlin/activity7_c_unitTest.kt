import activity5_c.Product
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CartTester{

    private val carts: Carts = Carts()

    @Test
    fun addItemCheck(){
        assertThrows<ProductNotFind>{
            carts.addItems("Mango")
        }
    }

    @Test
    fun checkOutCheck(){
        assertThrows<InsufficientStock>{
            carts.checkOut("Apple",100,100,15.0F,100.0F)
        }
        assertThrows<InsufficientCash>{
            carts.checkOut("Apple",0,100,15.0F, 100.0F)
        }
    }



}