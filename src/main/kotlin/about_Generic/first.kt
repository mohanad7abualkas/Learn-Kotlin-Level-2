package about_Generic

// لا يمكن إنشاء متغيرات من نوع T
class first<in T> {

    fun value(P_val: T){
        println(P_val)
    }


}

// لا يمكن إنشاء parameters داخل الدوال, كل شيء يكون خارجي عكس الـ in
abstract class second<out T>{


    abstract fun value(): T
}