package Anonymose_Class

fun main (args: Array<String>){

    var obj = A()
    obj.show()

    // إنشاء كلاس مباشرة بدون اسم ويحتوي على أوبجت له اسم
    var OBJ = object : `My Interface`
    {
        override fun show() {
            println("Anonymous Class")
        }
    }
    OBJ.show()

    println("================")

    // إنشاء كلاس بدون اسم وأيضا أوبجكت بدون اسم
    Y.Poly(object : `My Interface`
    {
        override fun show() {
            println("class without name & object without name too")
        }
    })
}