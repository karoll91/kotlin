import javafx.scene.shape.Shape.subtract
import java.util.*

fun add(number1 : Int, number2 : Int) : Int{
    return number1 + number2
}
//fun isGreaterOrEqual() : Boolean{
//
//}
//fun isLessOrEqual() : Boolean{
//
//}
//fun isGreater() : Boolean{
//
//}
//fun isLess() : Boolean{
//
//}

//Calculator - Add, Subtract, Division, Multiplication
// Equalites - >= <= > <
fun main(){
    val reader1 = Scanner(System.`in`)
    print("Enter numbers: ")
    // nextInt() reads the next integer from the keyboard
    var number1:Int = reader1.nextInt()
    var number2:Int = reader1.nextInt()

    println("Sum:" + add(number1,number2))

    var number3 = readLine()!!.toInt()
    var number4 = readLine()!!.toInt()

    var sum2: Int = number3 + number4
    println("sum: $sum2")

    var sub: Int = number3 - number4
    println("sub: $sub")

    var div: Int = number3 / number4
    println("div: $div")

    var mul: Int = number3 * number4
    println("mul: $mul")
}