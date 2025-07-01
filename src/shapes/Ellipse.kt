package shapes

open class Ellipse(protected var center: Point, protected var vertRadii: Double, protected var horizRadii: Double){
    init {
        require(vertRadii > 0 && horizRadii > 0) { "Radii must be greater than 0" }
    }

    fun getAttributes() {
        println("Center{$center}, Vertical Radius{$vertRadii}, Horizontal Radius{$horizRadii}")
    }

    fun getArea(): Double {
        return vertRadii * horizRadii * Math.PI
    }

    fun move(dx: Double, dy: Double){
        center.move(dx, dy)
    }
}