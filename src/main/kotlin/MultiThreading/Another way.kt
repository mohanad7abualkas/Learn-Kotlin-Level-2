package MultiThreading

// طريقة أخرى لتطبيق مبدأ الـ Threading باستخدام interface الـ Runnable
class HP1: Runnable {  // interface

    override fun run(){
        for (i: Int in 0 until 5){
            println("HP1")
            Thread.sleep(1000)
        }
    }
}

class DELL1: Runnable {  // interface

    override fun run(){
        for (i: Int in 0 until 5){
            println("DELL1")
            Thread.sleep(1000)
        }
    }


}

fun main (args: Array<String>){

    var objH = HP1()
    var oblD = DELL1()

    var t1 = Thread(objH)
    var t2 = Thread(oblD)

    t1.start()
    Thread.sleep(500)
    t2.start()

}