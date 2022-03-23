// this will print range from 1 to 100

for (i in 1..100) println(i)


// to print range that doesn't include the last number, use "until"

for (i in 1 until 100) println(i)


// use "downTo" to reverse the range

for (i in 15 downTo 10) println(i)

// use "step" to skip numbers in range

for (i in 1..100 step 2) println(i)


// looping through items in an array

fun main(args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    
    for (item in options) println("$item is an item in the array.")

}

// looping through items in an array with indeces

fun main(args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")

    for ((ind, i) in options.withIndex()) println("Index $ind has item $i")

}
