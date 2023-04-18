package about_Generic

// Generic Class
// T = Type Parameters
class G <T> {

    // إنشاء متغير نوعه غير محدد أو غير معروف (DataType)
    var unknown: T? = null

    fun firstFun(x: T){
        println("X = $x")
    }

    fun secondFun(a: T): T{
        return a
    }


}

fun main (args: Array <String>){

    // عند إنشاء object من الكلاس يجب تحديد نوع المتغير
    var obj1 = G<Int>()
    obj1.unknown = 24
    obj1.firstFun(29)
    var recive = obj1.secondFun(55)
    println(recive)

    println("===================")

    var obj2 = G<String>()
    obj2.unknown = "Mohanad"
    obj2.firstFun("Mohanad")
   var recive2 =  obj2.secondFun("Ahmad")
    println(recive2)

}