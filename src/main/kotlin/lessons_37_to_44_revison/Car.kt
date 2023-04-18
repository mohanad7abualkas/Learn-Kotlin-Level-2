package lessons_37_to_44_revison

open abstract class Car {

    var name: String? = null
    var model: Int? = null
    var speed: Double = 0.0

    open abstract fun printInfo()
    open abstract fun currentSpeed()
    open abstract fun increaseSpeed(in_Speed: Int)
    open abstract fun decreaseSpeed(de_Speed: Int)
}