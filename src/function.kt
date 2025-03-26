fun main() {

    //standard library functions or pre defined functions
    var a = Math.sqrt(256.0)
    println("The sqaure root of 256 is $a")

    var y =Math.round(3.9388)
    println("The output is $y")

    juice()
    student("Benedictus", 23)
    employee("Jack" ,620000, "Chairperson", false )
    employee("Anderson" ,78000, "Regular staff member", false )

}
//user defined functions
fun juice(){
    println("Apple")
}
fun student(name:String, age:Int){
    //parameters(variable) and arguments(value) this is to show different values in one variable
    println("$name is $age years old")
}
fun employee(name:String, salary:Int, position:String, disability:Boolean){
    println("$name is currently working as a $position nd is paid an annual salary of $salary. Disability: $disability")
}





