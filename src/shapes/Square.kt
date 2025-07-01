package shapes

class Square(topLeft: Point, width: Double) : Rectangle(
    topLeft,
    Point(topLeft.getX() + width, topLeft.getY() - width)
)


