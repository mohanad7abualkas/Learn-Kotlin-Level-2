package Access_Modifier

open class `lesson 19 (Protected)` {

    protected var n: Int? = null

    protected var name1: String? = null

    fun SetName(p_Name: String) {
        this.name1 = p_Name
    }

    fun GetName(): String?{
        return this.name1
    }

}

fun main (args: Array <String>){

    var obj1 = `lesson 19 (Protected)`()
    obj1.SetName("Ahmad")
    var print_Name = obj1.GetName()
    println(print_Name)

}