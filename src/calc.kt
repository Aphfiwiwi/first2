import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first number :")
    var first = read.nextInt()

    println("Enter the operator:")
    var operator = readln()

    println("Enter the second number :")
    var second = read.nextInt()


    var result = when (operator) {
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" -> first / second
        else -> "Invalid day of the week"
    }
    println("the result is $result")
}