package about_Generic

class G2<T,E> {

    var name: T? = null
    var age: E? = null

    fun demo (a: T, x: E){
        println("a = $a \n x = $x")
    }
}

fun main (args: Array<String>){

    var obj1 = G2<String,Float>()
    obj1.age = 65f
    obj1.name = "Mohanad"

    obj1.demo("Mohanad", 21f)
}