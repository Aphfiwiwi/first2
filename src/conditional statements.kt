import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the temperature :")
    var temp = read.nextInt()

    if ( temp <25){
        println("It is below standard room temperature")
    }
    else{
        println("It is above standard room temp")
    }


}