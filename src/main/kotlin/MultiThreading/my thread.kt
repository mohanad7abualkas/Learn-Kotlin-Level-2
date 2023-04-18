package MultiThreading

// شرح مبدأ الـ Threading انظر إلى الخطوات بالأسفل
class HP: Thread {
    constructor(){ }

    override fun run(){
        for (i: Int in 0 until 5){
            println("HP")
            Thread.sleep(1000)
        }
    }
}

class DELL: Thread() {

    override fun run(){
        for (i: Int in 0 until 5){
            println("DELL")
            Thread.sleep(1000)
        }
    }


}

fun main (args: Array<String>){

    var objH = HP()
    var oblD = DELL()

    objH.start()
    Thread.sleep(500)
    oblD.start()

}


// 1- وراثة كلاس الـ Threading
// 2- عمل override لدالة الـ run
// 3- استدعاء دالة sleep
// 4- عند استدعاء الدالة في الـ main نقوم باستدعاء دالة الـ Start