import java.lang.Exception

fun main(){
    var check = ExceptionX("")

    check.insufficientStock(10,20)
    check.productNotFound(Products("Avocado",1.0F,10.0F))
    check.noItem()
    check.insufficientCash(100.0F,50.0F)
    check.wrongInputValue()

}
sealed class ExceptionMessage(message: String):Exception(message){
    class InsufficientStock(message:String = "Insufficient Stock") : ExceptionMessage(message)
    class ProductNotFound(message:String = "Product not found") : ExceptionMessage(message)
    class NoItem(message:String = "No item in the cart") : ExceptionMessage(message)
    class InsufficientCash(message:String = "Insufficient Cash") : ExceptionMessage(message)
    class WrongInputValue(message:String = "Invalid input") : ExceptionMessage(message)
}

class ExceptionX(message: String){
    fun insufficientStock(stock: Int, qtyOrder: Int){
        if (stock <= qtyOrder){
            throw ExceptionMessage.InsufficientStock()
        }
    }
    fun productNotFound(products: Products){
        var checkCart = CartItem()
        if(products.itemName != checkCart.items.entries.toString()){
            throw ExceptionMessage.ProductNotFound()
        }
    }
    fun noItem(){
        var checkCart = CartItem()
        if(checkCart.items.size == 0){
            throw ExceptionMessage.NoItem()
        }
    }
    fun insufficientCash(price: Float, cash: Float){
        if(price >= cash){
            throw ExceptionMessage.InsufficientCash()
        }
    }
    fun wrongInputValue(){
        var checkCart = CartItem()
        var productItem: String
        var productQty: Float
        var productPrice: Float

        try {
            print("Product : ")
             productItem = readln()
            print("Order Qty : ")
             productQty= readln().toFloat()
            print("Total Price : ")
             productPrice = readln().toFloat()

             checkCart.addItems(Products(productItem,productQty, productPrice))
        }catch (_:Exception){
            throw ExceptionMessage.WrongInputValue()
        }
    }
}
open class Products{
    var itemName: String = ""
    var price: Float = 0.0F
    var qty: Float = 0.0F
    var unit: String = ""

    constructor(item: String,qty: Float,price: Float){
        this.itemName = item
        this.qty = qty
        this.price = price
    }
}
class CartItem{
    var items: HashMap<Products,Float> = HashMap()
    var prices: HashMap<Products,Float> = HashMap()

    fun addItems(Products: Products){
        items[Products] = Products.qty
        prices[Products] = Products.price
    }

    fun removeItems(product: String){
        items.keys.removeIf{ key -> key.itemName ==  product}
        prices.keys.removeIf{ key -> key.itemName ==  product}
    }

    fun checkOut(){
        var total : Float = 0.0F
        var qtyCount : Float = 0.0F
        for(index in prices.entries){
            total += index.value
        }
        for(index in items.entries){
            qtyCount += index.value
        }
        println("($qtyCount) Items | Total Cost : $total")
    }
}