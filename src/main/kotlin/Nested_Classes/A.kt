package Nested_Classes

class A { // Outer Class

    var x: Int? = null

    fun printA() {
        println("Outer Class A")
    }

    class B{  // Inner Class

        var y: Int? = null

        fun printB(){
            println("inner class B")
        }
    }

    // كلمة inner تعني أن هذا الكلاس يمكنه استخدام محتويات الكلاس الخارجي
    inner class C{

        fun printC(){
            x = 24
            println("Inner Class C")
            println("X Value is $x")
        }
    }


    // تابع لكلاس A
    fun demo(){
        class localClass {  // local inner class    // inside function

            var a: String? = null

            fun printSt(){
                println(a)
            }
        }
        // انشاء أوبجت من local inner class
        var o = localClass()
        o.a = "mohanad"
    }
}