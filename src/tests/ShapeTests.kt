package tests
import org.junit.Assert.*
import org.junit.Test
import shapes.*

class ShapeTests {
    @Test fun areaTriangle() {
        var triangle = Triangle(Point(0.0, 0.0), Point(0.0, 4.0), Point(4.0, 0.0))
        val area = triangle.getArea()

        assertEquals(
            "The computation of the area of a triangle isn't correct",
            0.5 * (4.0 * 4.0),
            area,
            0.0001 // delta for floating point precision
        )

    }

    @Test fun areaCircle() {
        var circle = Circle(Point(0.0, 0.0), 4.0)
        val area = circle.getArea()

        assertEquals(
            "The computation of the area of the circle isn't correct",
            Math.PI * 4 * 4,
            area,
            0.0001
            )
    }

    @Test fun areaEllipse() {
        val ellipse = Ellipse(Point(0.0, 0.0), 3.0, 5.0)
        val area = ellipse.getArea()

        assertEquals(
            "The computation of the area of the ellipse isn't correct",
            Math.PI * 3 * 5,
            area,
            0.0001
        )
    }


    @Test fun areaSquare() {
        var square = Square(Point(0.0, 0.0), 4.0)
        val area = square.getArea()

        assertEquals(
            "The computation of the area of the circle isn't correct",
            4.0 * 4.0,
            area,
            0.0001
        )
    }

    @Test fun areaRectangle() {
        var rectangle = Rectangle(Point(0.0, 0.0), Point(3.0, -5.0))
        val area = rectangle.getArea()

        assertEquals(
            "The computation of the area of the circle isn't correct",
            3.0 * 5.0,
            area,
            0.0001
        )
    }

    @Test fun slopeLine() {
        var line = Line(Point(-6.0,0.0), Point(0.0, 2.0) )

        assertEquals(
            "The computation of the slope of the line isn't correct",
            1.0 / 3.0,
            line.getSlope(),
            0.0001
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun invalidCircleRadius() {
        Circle(Point(0.0, 0.0), -3.0)
    }


    @Test fun movePoint() {
        val point = Point(2.0, 3.0)
        point.move(1.0, -1.0)
        assertEquals(3.0, point.getX(), 0.0001)
        assertEquals(2.0, point.getY(), 0.0001)
    }


    @Test fun clonePoint() {
        val original = Point(1.0, 1.0)
        val copy = original.clone()
        assertEquals(original.getX(), copy.getX(), 0.0001)
        assertEquals(original.getY(), copy.getY(), 0.0001)
        assertNotSame(original, copy)
    }
}