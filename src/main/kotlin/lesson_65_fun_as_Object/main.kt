package lesson_65_fun_as_Object

fun main (args: Array <String>){

    var objB = B()

    //  لاحظ استخدام الدالة getOBJ كـ object واستدعاء المتغيرات من خلالها أو استدعاء دوال أخرى أيضا
    objB.getOBJ().x = 10
    objB.getOBJ().y = 24
    objB.getOBJ().asObject()
}