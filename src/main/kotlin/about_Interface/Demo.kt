package about_Interface

import kotlin.contracts.contract

// implement to My Interface & My interface 2
class Demo: A, `My Interface`{

    constructor(){}

    var a: Int? = null


    override fun show() { }

    override fun display() {
        println("In display")
    }

    fun printVal(){

    }
}

// كلاس الـ Demo يرث كلاس الـ A وكذلك الـ My Interface الذي بدورها ترث الـ My Interface 2,
// وبالتالي بإمكان الـ Demo استخدام جميع خصائص كلاهما
