package lessons_37_to_44_revison

class Toyoto: Car {

    var ex = Exception()
    constructor(){}

    override fun printInfo() {
        println("Name is: ${super.name}")
        println("Module is: ${super.model}")
        println("Speed is: ${super.speed}")
    }

    override fun currentSpeed() {

        println("Current Speed: ${super.speed}")

    }


    // Exception catcher
    override fun increaseSpeed(in_Speed: Int) {

        super.speed = super.speed.plus(in_Speed)
        try {
            if (super.speed > 250) {
                throw Exception ("Danger, Speed is out of range")
            } else if (super.speed > 170){
                throw Exception ("Warning, Please reduce the speed")
            }
            println("Speed after increase $in_Speed is: ${super.speed}")

        }
        catch (e: Exception){
            println(e.message)
        }

    }

    override fun decreaseSpeed(de_Speed: Int) {
        super.speed = super.speed.minus(de_Speed)
        println("Speed after decrease $de_Speed is: ${super.speed}")

    }
}