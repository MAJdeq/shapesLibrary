import shapes.*

fun main(){
    val pointOne = Point(1.0, 1.0)
    val pointTwo = Point(3.0, 5.0)
    val pointThree = Point(7.0, 1.0)

    var triangle = Triangle(pointOne, pointTwo, pointThree)

    println(triangle.getArea())
    triangle.getAttributes()
}