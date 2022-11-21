package activity3_c

fun main(){
    var names : ArrayList<String> = arrayListOf("Nescafe", "Marlboro", "Gardenia", "Winston", "Safeguard",
        "Palmolive", "Johnson Powder", "Coke", "Royal", "Knorr",
        "Candle", "Champion", "Sprite", "Gatorade", "Red Horse",
        "Alfonso", "Ice", "Vinegar", "Pepper", "Garlic")

    var cart : HashMap<String, Int> = HashMap()
    var inputProduct = readln().toString()

    addToCart("Winston",1, cart)
    addToCart("Marlboro",1, cart)
    addToCart("Marlboro",1, cart)

    //addToCart(inputProduct,1,cart)
    checkOut(cart)
    removeFromCart(inputProduct,cart)

    for(y in cart.entries){
        println("${y.key} ${y.value}")
    }
}

fun addToCart(inputProduct: String, quantity: Int, cart: HashMap<String, Int>,) {
    var countExistingName: Int = 0

    for (x in cart.entries) {
        if (inputProduct == x.key) {
            countExistingName++
        }
    }
    if (countExistingName > 0) {
        cart["${inputProduct}_${countExistingName}"] = quantity
        println("[2] Add to cart : ${inputProduct}_${countExistingName}")
    } else {
        cart[inputProduct] = quantity
        println("[2] Add to cart : $inputProduct")
    }
    countExistingName = 0
}

fun checkOut(cart: HashMap<String, Int>,){
    println("[3] Checkout : ${cart.count()} Items")
}
fun removeFromCart(inputProduct: String, cart: HashMap<String, Int>,){
    cart.remove(inputProduct)
    println("[4] Remove from cart : $inputProduct")
}