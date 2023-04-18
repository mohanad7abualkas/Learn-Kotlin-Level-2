package lesson_22_Exception

class A {

    //شرح كيف نقوم بعمل استثناء (Exception catcher) إذا كان هناك خطأ متوقع في الكود

    var ex = Exception()

    // Exception catcher
    fun printValue(num: Int){

        try {
            if (num < 0){
                throw ex
            }
            println("Number is: $num")
        }
        catch (e: Exception){
            println("Number is Negative")
        }
    }

    // Exception propagator
    @Throws  // هذه الكلمة تعني أن هذه الدالة ترمي استثناء
    fun printNumber(n: Int){
        if (n > 100){
            throw ex
        }
        println("Number is in, its: $n")
    }
}