package shapes

import java.lang.Math.pow
import java.lang.Math.sqrt

class Line(private var firstPoint: Point, private var secondPoint: Point) {
    init {
        require(firstPoint != secondPoint) { "The two points must not be the same" }
    }

    private val points = mutableListOf<Point>()

    init {
        points.add(firstPoint.clone())
        points.add(secondPoint.clone())
    }

    fun getPoints(): List<Point> = points.toList()

    fun getSlope(): Double{
        val numerator = secondPoint.getY() - firstPoint.getY()
        val denominator = secondPoint.getX() - firstPoint.getX()

        val slope = numerator / denominator

        return slope
    }

    fun getLength(): Double {
        val deltaY = secondPoint.getY() - firstPoint.getY()
        val deltaX = secondPoint.getX() - firstPoint.getX()

        val deltaYSquared = pow(deltaY, 2.0)
        val deltaXSquared = pow(deltaX, 2.0)

        val length = sqrt(deltaYSquared + deltaXSquared)

        return length
    }

    fun move(dx: Double, dy: Double): List<Point>{
        firstPoint.move(dx, dy)
        secondPoint.move(dx, dy)

        // Update the points list too
        points.clear()
        points.add(firstPoint.clone())
        points.add(secondPoint.clone())

        return points
    }
}