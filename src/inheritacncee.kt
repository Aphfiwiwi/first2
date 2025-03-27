//parent class
open class animal{
    var age =4
    var gender = "male"

    fun sound(){
        println("Animal is speaking")
    }
}
//child class
class dog(){
    fun bark(){
        println("The dog is barking")
    }
}

class cat{
    var colour  =" ginger"
    var hasfur = true

    fun purr(){
        println("The cat is purring")
    }
}

fun main() {
    var a =animal()
    var b =dog()
    b.bark()
    println()
    var c =cat()
}