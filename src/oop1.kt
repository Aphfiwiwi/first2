fun main() {
    var doc1 = person()
    println(doc1.name)
    println(doc1.age)
    println(doc1.department)
    doc1.speak()





}
class person{
    var name ="George"
    var age = 27
    var department ="Pediatric"

    fun speak(){
        println("The doctor is speaking")
    }
}


