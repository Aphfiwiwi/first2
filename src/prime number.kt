import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter a number:")
    var num = read.nextInt()

    if (num == 0){
        println("$num is zero AKA neutral number")
    }
    else if (num % 2 == 0){
        println("$num is an even number")
    }
    else{
        println("$num is an odd number")
    }

}