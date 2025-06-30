package shapes

import java.lang.Math.pow
import java.lang.Math.sqrt

class Rectangle(private var topLeft: Point, private var bottomRight: Point) {
    init {
        require(topLeft.getX() < bottomRight.getX()) { "Invalid rectangle: left must be less than right" }
        require(topLeft.getY() > bottomRight.getY()) { "Invalid rectangle: top must be greater than bottom" }
    }

    fun getWidth(): Double {
        return bottomRight.getX() - topLeft.getX()  // Direct calculation
    }

    fun getHeight(): Double {
        return topLeft.getY() - bottomRight.getY()  // Direct calculation
    }

    fun getArea(): Double {
        return getWidth() * getHeight()
    }

    fun move(dx: Double, dy: Double): Rectangle {
        topLeft.move(dx, dy)
        bottomRight.move(dx, dy)

        return this
    }

    override fun toString(): String {
        return "Rectangle(topLeft=${topLeft}, bottomRight=${bottomRight})"
    }
}