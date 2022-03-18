fun main (args: Array<String>){
    var x = 5
    var y = 8

    if (x >  y) {
        println("x is greater than y")
    }else {
        println("x is not greater than y")
    }
    println("Process done.")
}

// or 

fun main (args: Array<String>){
    var x = 5
    var y = 8

    println(if (x > y) "x is greater than y" else "x is not greater than y")
}
