package companion_objec

class C {

    // أمكانية استدعاء العناصر بشكل مباشر من هذا الكلاس

    var age: Int? = null

    companion object{
        var age: Int? = null
        var name: String? = null

        fun printElements(){
            println("Your Name is: $name \n Your Age is: $age")
        }
    }

    fun printVal(a: Int){
        println(a)
    }

}