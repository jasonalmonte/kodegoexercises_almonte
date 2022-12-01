package activity5_c

open class Product{
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
class Cart{
    var items: HashMap<Product,Float> = HashMap()
    var prices: HashMap<Product,Float> = HashMap()

    fun addItems(product: Product){
        items[product] = product.qty
        prices[product] = product.price
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

fun main(){
    var cartVar = Cart()

    cartVar.addItems(Product("Apple",10.0F, 8.0F))
    cartVar.addItems(Product("Mango",1.0F, 28.0F))
    cartVar.addItems(Product("Mango",3.0F, 24.0F))
    cartVar.checkOut()
    cartVar.removeItems("Mango")
    cartVar.checkOut()
}