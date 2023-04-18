package Any_Class

fun main (args: Array<String>){

    var objf = first()
    var objs = second()

    // توضيح استخدام الـ Any as Parameter
    Demmo.show(objf)

    // استقبال القيمة الراجعة التي من نوع Any من دالة returnShow()
    objf = Demmo.returnShow() as first
    objs = Demmo.returnShow() as second



}