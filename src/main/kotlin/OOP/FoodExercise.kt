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

    fun updateOrder(){
        this.status = status
    }

    fun addItems(product: Product, quantity: Float){
        //items.put(product, quantity)
        items[product] = quantity
    }
}

data class Customer(var address: String, var mobileNumber: String,
                    var firstname: String, var lastname: String){

}


fun main(){

    var fruits = ArrayList<Fruits>()
    fruits.add(Fruits("Apple",0.0))
    fruits.add(Fruits("Banana",0.0))
    fruits.add(Fruits("Orange",0.0))
    fruits.add(Fruits("Lemon",0.0))
    fruits.add(Fruits("Mango",0.0))

    logger.info {  }

    var customer2 = Customer("","","","")
    var cart2 = Cart(customer2)


    cart2.addItems(fruits[0],0.0F)
    fruits.add(Fruits("sada",0.0))

    //var persona = Product()
    var humana = Human("",0.0)

    humana.go()
    var customer1 = Customer("","","","")

    //  jason.add(Person("jason",28.0))

}


class Person{
    var names: String = ""
    var ages: Double = 5.0


    fun go(){
        logger.info { "I'm a person."}
    }

}
class Human (name : String, age: Double) {

    fun go(){
        logger.info { "I'm human."}
    }
}
open class Body{
    open fun go(){
        logger.info { "Please override.."}
    }
}
