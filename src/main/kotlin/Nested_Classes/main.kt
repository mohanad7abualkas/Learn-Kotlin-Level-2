package Nested_Classes

// Nested Classes
fun main (args: Array <String>){

    var obj = A()
    obj.printA()

    // إنشاء object من كلاس الـ B
    var objB = A.B()
    objB.printB()

    // إنشاء أوبجكت من inner class يجب استدعاء الـ constructor للكلاس الخارجي
    var objC = A().C()
    objC.printC()


}