package activity7_c_UnitTest
import activity5_c.Product
sealed class Errors(message: String):  Exception(message){
    class InsufficientStock(message: String = "Not Enough stock") : Errors(message)
    class InsufficientCash(message: String = "Insufficient") : Errors(message)
    class ProductNotFind(message: String = "Not") : Errors(message)
}


class Carts{
    var items: HashMap<Product,Float> = HashMap()
    var prices: HashMap<Product,Float> = HashMap()

    fun addItem(product: Product){
        items[product] = product.qty
        prices[product] = product.price
    }

    fun addItems(product: String){
        addItem(Product("Apple",10.0F, 8.0F))
        addItem(Product("Mango",10.0F, 8.0F))
        addItem(Product("Banana",10.0F, 8.0F))

        for(index in items.entries){
            if (product == index.key.itemName){
                throw Errors.ProductNotFind()
            }
        }
    }

    fun checkOut(product: String, stock:Int, qtyOrder: Int, price: Float, cash: Float){
        if(stock >= qtyOrder){
            throw Errors.InsufficientStock()
        }
        if(price <= cash){
            throw Errors.InsufficientCash()
        }
    }
}