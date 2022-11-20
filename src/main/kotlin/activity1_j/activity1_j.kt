import mu.KotlinLogging
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
private val logger = KotlinLogging.logger{}
fun main(){
    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var dateToday = LocalDateTime.now().format(formatter)

    //
    var dateNow = dateToday
    var itemCode:ArrayList<String> = ArrayList()
    var itemDescription:ArrayList<String> = ArrayList()
    var itemCategory:ArrayList<String> = ArrayList()
    var quantity = 0
    var stocks = 0
    var itemPrice:ArrayList<Float> = ArrayList()
    var change:Float = 0.0F
    var cash:Float = 0.0F

    var addCart:ArrayList<String> = ArrayList()
    var addCartQty:ArrayList<Int> = ArrayList()
    var addTotal:ArrayList<Float> = ArrayList()
    var addInput:String = ""
    var addQtyInput:Int = 0

    itemCode.add("Banana")
    itemCode.add("Apple")
    itemCode.add("Grapes")
    itemPrice.add(15.0F)
    itemPrice.add(20.0F)
    itemPrice.add(10.0F)

    print("Add cart: ")
    addInput = readln()
    print("Add Qty: ")
    addQtyInput = readln().toInt()

    for(item in itemCode.indices){
        if(addInput == itemCode[item]){
            addCart.add(addInput)
            addCartQty.add(addQtyInput)
            addTotal.add(addQtyInput * itemPrice[item])
        }
    }

    for(x in addCart.indices){
        println("Item bought: ${addCart[x]} , Qty: ${addCartQty[x]} , Total: ${addTotal[x]}")
    }
    var user: String = "Cashier"

}