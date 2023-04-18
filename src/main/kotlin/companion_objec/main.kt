package companion_objec

fun main (args: Array<String>) {

    C.age = 21
    C.name = "Mohanad"
    C.printElements()

    var obj1 = C()
    obj1.age = 25
    obj1.printVal(obj1.age!!)

}