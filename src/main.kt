import shapes.Line
import shapes.Point
import shapes.Rectangle

fun main(){
    val p1 = Point(1.0,5.0);
    val p2 = Point(6.0, 2.0);

    var rectangle = Rectangle(p1, p2)

    println(rectangle.getWidth())
    println(rectangle.getHeight())
    println(rectangle.getArea())
    println(rectangle.move(4.0, 4.0))
    println(rectangle.getWidth())
}