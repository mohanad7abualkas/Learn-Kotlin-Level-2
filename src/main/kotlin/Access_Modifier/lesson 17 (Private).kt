package Access_Modifier

class `lesson 17 (Private)`: `lesson 19 (Protected)` {

    constructor(){

    }
    var x = 21
    private var name = "Non"

    // لا يمكن استخدام أي عنصر private خارج الكلاس
     fun SetValue(p_name: String){
        this.name = p_name
    }

    fun GetValue(): String{
        return this.name
    }

    // استخدام الـ Protected من كلاس  lesson 19
    fun protest(){
        super.n = 21
        super.name1 = "mohanad"
    }


}

fun main (args: Array <String>){

    var obj = `lesson 17 (Private)`()
    obj.x

    // وضعنا قيمة داخل متغير private عن طريق استخدام دوال الـset و الـGet
    obj.SetValue("Mohanad")
    var n = obj.GetValue()
    println(n)



}