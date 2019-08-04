
fun printHello() {
    println("Hello")
}

val printHello2: () -> Unit = {
    println("Hello")
}

val repeatHello: (Int) -> Unit = {num : Int ->
    println("Hello".repeat(num))
}

fun add(num1: Double, num2: Double) : Double {
    return  num1+num2
}

val ladd: (Double,Double) -> Double = {num1 : Double , num2 : Double ->
    num1 + num2
}

val lminus: (Double, Double) -> Double = {num1 : Double , num2 : Double ->
    num1 - num2
}

fun operation (num1 : Double , num2 : Double , callback : (Double,Double) -> Double)  : Double {
    return callback(num1,num2)
}

fun main() {
    printHello()
    printHello2()
    repeatHello(2)
    val res : Double = operation(1.0,2.0, ladd)
}