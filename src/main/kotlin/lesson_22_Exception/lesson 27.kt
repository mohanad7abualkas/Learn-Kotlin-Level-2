package lesson_22_Exception

fun main (args: Array <String>){

    // تابع لـ Exception catcher
    var obj = A()
    obj.printValue(-7)

    // تابع لـ Exception propagator
    try {
        obj.printNumber(200)
    }
    catch (e: Exception){
        println("Number is > 100")
    }

}