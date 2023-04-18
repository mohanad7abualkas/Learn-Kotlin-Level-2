package three_lessons
//sub class                 // super class Direct
open class `lesson 7 (2)`: `lesson 7 (Inheritance)` {



    constructor(): super("Mohanad","Abualkas"){

    }

    fun mul(){
        println("5 * 5 = 25")
    }

    fun printTest(){
        println(this.mul())
        println(super.x)
    }

    override fun printValue() {
        super.printValue()
        println("Hi (2)")
    }

}