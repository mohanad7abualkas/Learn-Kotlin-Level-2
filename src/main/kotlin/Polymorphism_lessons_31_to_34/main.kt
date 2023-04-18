package Polymorphism_lessons_31_to_34

fun main (args: Array <String>){

    // كيفية تطبيق أو شكل مبدأ الـ polymorphism
    var rec : shape = rectangle()
    rec.draw()

    var rec1 = rectangle()
    rec1.draw()

    println("========================")

     // طريقة 1
    // إنشاء أوبجكت على شكل مصفوفة
    var shapes = Array<shape>(3) { shape() }

    shapes[0] = rectangle()
    shapes[1] = circle()
    shapes[2] = square()

    for (i: Int in 0 until shapes.size){
        shapes[i].draw()
    }

    println("========================")

    // طريقة أخرى لتطبيق مبدأ الـ Polymorphism
    var obj_Shape = shape()
    var a = A()
    var rec2 = rectangle()
    // هنا نقوم بتمرير parameter من نوع shape (كلاس)
    a.printVal(obj_Shape)
    a.printVal(rec2)


}