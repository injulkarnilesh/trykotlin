package operator

data class Point(val x: Int, val y: Int)

operator fun Point.plus(point: Point) = Point(this.x + point.x, this.y + point.y)
operator fun Point.minus(point: Point) = Point(this.x - point.x, this.y - point.y)
operator fun Point.compareTo(point: Point) = this.x.compareTo(point.x)
operator fun Point.unaryMinus() = Point(-this.x, -this.y)


fun main() {
    val p1 = Point(15, 10)
    val p2 = Point(5, 5)

    println(p1 + p2)
    println(p1 - p2)
    println(p1 > p2)
    println(-p1)

    val (x, y) = p1
    println("${x},${y}")
}