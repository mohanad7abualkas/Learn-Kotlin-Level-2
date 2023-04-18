class `lesson 5 (Overload)` {

    // مفهوم الـ overload أكثر من دالة بنفس الاسم مع اختلاف خصائص كل دالة عن الأخرى

    // function 1
    fun sum (a:Int, b: Int){
        println(a + b)
    }

    // function 2
    fun sum (a: Float, b:Float){
        println(a + b)
    }

    // function 3
    fun sum (){

    }

    // يتم استدعاء الدالة حسب القيم الذي تمرر إليها

}