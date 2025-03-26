//enter three numbers and shows the largest number
import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first number :")
    var first = read.nextInt()

    println("Enter the second number :")
    var second = read.nextInt()

    println("Enter the third number :")
    var third = read.nextInt()


    if ( first > second && first > third){
        println("$first is the largest number")
    }
    else if (second > first && second > third){
        println("$second is the largest number")
    }
    else{
        println("$third is the largest number")
    }



}