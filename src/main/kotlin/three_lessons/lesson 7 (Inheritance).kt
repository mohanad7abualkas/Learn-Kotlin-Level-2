package three_lessons
// super class
open class `lesson 7 (Inheritance)` {

    constructor(){
        println("Constructor 1")
    }

    constructor(p1: String, p2: String){
        println("$p1 \n $p2")
    }

    var x: Int? = null

    open fun printValue(){
        println("Hello !")
    }
}