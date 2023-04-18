package many_subjects

// super class
open class Animal {

    open fun play() {
        println("Default")
    }

    open fun sleep(){
        println("Default")
    }
}


//  many_subjects.main function
fun main (args: Array <String>){

    var ca = cat("Cuety")
    ca.play()
    ca.sleep()

    println("==============")

    var dg = Dog("Tony")
    dg.play()
    dg.sleep()

}