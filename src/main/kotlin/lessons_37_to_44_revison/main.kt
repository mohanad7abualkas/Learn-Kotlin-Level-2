package lessons_37_to_44_revison

fun main (args: Array <String>){

    var obj_Toyoto = Toyoto()
    var obj_BMW = BMW()

    obj_Toyoto.name = "super toooyooto"
    obj_Toyoto.model = 2019
    obj_Toyoto.speed = 150.0
    obj_Toyoto.printInfo()
    obj_Toyoto.currentSpeed()
    obj_Toyoto.increaseSpeed(10)  //   warning  danger
    obj_Toyoto.decreaseSpeed(70)

    println("=========================")

    obj_BMW.name = "BMW X77"
    obj_BMW.model = 2020
    obj_BMW.speed = 100.0
    obj_BMW.printInfo()
    obj_BMW.currentSpeed()
    obj_BMW.increaseSpeed(50)  // danger  warning
    obj_BMW.decreaseSpeed(100)

    println("===================")

    // هذا الكلاس لتوضيح سرعة العمل مع الوراثة والخصائص الأخرى
    var obj_mr = mercedes()
    obj_mr.name = "merrreyy"
    obj_mr.model = 2007
    obj_mr.speed = 270.0
    obj_mr.printInfo()

    println("===================")


    // توضيح أكثر لمفهوم الـ polymorphism مع الـ Abstract
    var obj_bmw = BMW()
    obj_bmw.name = "B M W"
    obj_bmw.model = 2009
    obj_bmw.speed = 230.0

    var objDemo = Demo()
    objDemo.poly(obj_bmw)
}