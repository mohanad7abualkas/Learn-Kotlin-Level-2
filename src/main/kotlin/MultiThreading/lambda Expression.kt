package MultiThreading

fun main (args: Array<String>){

    // lambda Expression

    var t1 = Thread(Runnable {  for (i: Int in 0 until 5){
        println("HP2")
        Thread.sleep(1000) }
    })
    var t2 = Thread(Runnable {
        for (i: Int in 0 until 5) {
            println("DELL2")
            Thread.sleep(1000)
        }
    })

    t1.start()
    Thread.sleep(500)
    t2.start()


    // لجعل الأوبجكت ينفذ الدالة حتى النهاية
    t1.join()
    t2.join()

    // التحقق أنه تم التنفيذ حتى النهاية
    println( t1.isAlive)
    println("The End")

}