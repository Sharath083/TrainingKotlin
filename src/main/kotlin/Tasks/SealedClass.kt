package Tasks

sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
//    data class
//      object NotAShape : Shape()
//    sealed class{}
//    sealed interface// we can have both sealed class and interface inside sealed class
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle ->println("Circle  ${3.14*e.radius*e.radius}")
        is Shape.Square ->println("Square  ${e.length*e.length}")
        is Shape.Rectangle ->println("Rectagle  ${e.length*e.breadth}")

    }
fun main(args: Array<String>) {

    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)
}