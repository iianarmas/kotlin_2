// new Function

fun main(args: Array<String>) {

    printSumOfTwo(10, 14)
}

fun printSumOfTwo(int1: Int, int2: Int): Unit {
    // return Unit if it has no return value or simply omit it

    val result: Int = int1 + int2

    println(result)
}


// new Function that returns something

fun main(args: Array<String>){
    println(greatestValue(5, 4))
}

fun greatestValue(a: Int, b: Int): Int {
    val result = if (a > b) a else b
    return result
  
  // or
  
  return if (a > b) a else b
    
  // or
    
    fun greatestValue(a: Int, b: Int): Int = if (a > b) a else b
}
