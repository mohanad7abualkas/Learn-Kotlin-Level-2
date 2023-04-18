package lesson_22_Exception

import java.lang.Exception
import java.lang.NumberFormatException

// Exception
fun main (args: Array <String>){

// توضيح كيفية استخدام الـ try & catch
    try {
        println("Enter X Value: ")
        var x: Int = readLine()!!.toInt()   // احتمالية حدوث throw (استثناء)
        println("Enter Y Value: ")
        var y: Int = readLine()!!.toInt()  // throw
        println("X add Y = ${x / y}")
    }
    // وظيفة الـ parameter e هو استقبال الخطأ المتوقع وتخزينه
    catch (e: NumberFormatException){
        println("Wrong Entered !")
    }                                // استخدام أكثر من Catch
    catch (e: ArithmeticException){
        println("You can't divide by zero ")
    }
    catch (e: Exception){

    }

    println("Done")



}