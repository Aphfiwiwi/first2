open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
class circle:shape(){
    override fun draw(){
        println("drawing a circle")
    }
}

class square:shape() {
    override fun draw() {
        println("drawing a square")
    }
}

fun main() {
    var x = shape()
    x.draw()
    var y = circle()
    y.draw()
    var z = square()
}