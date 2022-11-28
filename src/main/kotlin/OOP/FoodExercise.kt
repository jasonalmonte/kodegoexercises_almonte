import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

open class Product{
    var name: String =""
        private set
    var price: Double = 0.0

    constructor(name:String, price:Double){
        this.name = name
        this.price = price
    }
}

class Fruits (name: String, price: Double): Product(name,price){
    // var price: Double = 0.0
   var quantity: Float = 0F
    var quantityUnits: String = "per piece"
}

class Shake (name: String, price: Double): Product(name,price){
    // var price: Double = 0.0
    var size: Any = ""
    var ingredients: ArrayList<String> = ArrayList()
    var addons: ArrayList<Any> = ArrayList()
}

class Juices (name: String, price: Double): Product(name,price){
    // var price: Double = 0.0
    var ingredients: ArrayList<String> = ArrayList()
    var size: Any = ""
}

class Sandwiches (name: String, price: Double): Product(name,price){
    //var price: Double = 0.0
    var ingredients: ArrayList<String> = ArrayList()
    var addons: ArrayList<Any> = ArrayList()
    var breadType: Any = ""
}

class Salad (name: String, price: Double): Product(name,price){
    //var price: Double = 0.0
    var ingredients: ArrayList<String> = ArrayList()
    var dressing: Any = ""
    var addons: ArrayList<Any> = ArrayList()
    var size: Any = ""
}

enum class OrderStatus{
    SENT_TO_KITCHEN,
    BEING_PREPARED,
    FOR_PICKUP,
    FOR_DELIVERY,
    DELIVERED,
    PICKED_UP,
    CANCELLED,
    UNKNOWN
}

class Cart(customer: Customer) {

    var uniqueID: String =""
    var items: HashMap<Product,Float> = HashMap()
    var status: OrderStatus = OrderStatus.UNKNOWN
    var count: Double = 0.0

    fun updateOrder(){
        this.status = status
    }

    fun addItems(product: Product, quantity: Float){
        //items.put(product, quantity)
        //items[product] = quantity

        count = quantity.toDouble()

        for(entry in items.entries){
            if (entry.key == product){
                count =  entry.value.toDouble() + quantity
            }
        }

        items[product] = count.toFloat()
        count = 0.0 //Reset Quantity
    }
    fun checkQuantity(){
        for(entry in items.entries){
            logger.info { "Product: ${entry.key.name} -> Quantity: ${entry.value}"}
        }
    }
}

data class Customer(var address: String, var mobileNumber: String,
                    var firstname: String, var lastname: String){
}

fun main(){
    var customerVar = Customer("Antarctica","091938475623","Jason","Garcia")
    var cartVar = Cart(customerVar)

    var fruits = ArrayList<Fruits>()

    fruits.add(Fruits("Apple",15.0))
    fruits.add(Fruits("Banana",10.0))
    fruits.add(Fruits("Orange",20.0))
    fruits.add(Fruits("Lemon",10.0))
    fruits.add(Fruits("Mango",25.0))

    cartVar.addItems(fruits[3],1.0F)
    cartVar.addItems(fruits[3],1.0F)
    cartVar.addItems(fruits[2],1.0F)
    cartVar.addItems(fruits[3],5.0F)
    cartVar.checkQuantity()

    var shakes = ArrayList<Shake>()
    shakes.add(Shake("Oreo",70.0))
    shakes.add(Shake("Chip Cream",70.0))
    shakes.add(Shake("Strawberry",70.0))
    shakes.add(Shake("Dark Chocolate",70.0))
    shakes.add(Shake("Chocolate",70.0))
    //  jason.add(Person("jason",28.0))
}

