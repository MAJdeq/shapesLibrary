package shapes

class Point(private var x: Double, private var y: Double) {

    // Getter methods (public access)
    fun getX(): Double = x
    fun getY(): Double = y

    // Clone method - returns a new shapes.Point with same coordinates
    fun clone(): Point = Point(x, y)

    // Move method - updates position by delta values
    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}