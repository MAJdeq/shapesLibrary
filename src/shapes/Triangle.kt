package shapes

class Triangle(private var firstPoint: Point, private var secondPoint: Point, private var thirdPoint: Point) {
    init {
        require(!areCollinear(firstPoint, secondPoint, thirdPoint)) {
            "The three points are collinear and cannot form a valid triangle."
        }
    }

    fun getAttributes(){
        print("Point One: $firstPoint, Point Two: $secondPoint, Point Three: $thirdPoint")
    }

    fun getArea(): Double {
        val x1 = firstPoint.getX()
        val y1 = firstPoint.getY()
        val x2 = secondPoint.getX()
        val y2 = secondPoint.getY()
        val x3 = thirdPoint.getX()
        val y3 = thirdPoint.getY()

        return 0.5 * kotlin.math.abs(
            x1 * (y2 - y3) +
                    x2 * (y3 - y1) +
                    x3 * (y1 - y2)
        )
    }

    fun move(dx: Double, dy: Double){
        firstPoint.move(dx, dy)
        secondPoint.move(dx, dy)
        thirdPoint.move(dx, dy)
    }

    private fun areCollinear(p1: Point, p2: Point, p3: Point): Boolean {
        // Area of triangle is zero if points are collinear
        val area = (p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY()))
        return area == 0.0
    }
}