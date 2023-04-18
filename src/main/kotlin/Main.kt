import Abstract_File.A
import three_lessons.`lesson 7 (2)`
import three_lessons.`lesson 7 (3)`

fun main(args: Array<String>) {

    // lesson 2
    var obj1 = `lesson 2 (Constructor)`("Mohanad", "Abualkas", 22)
    var ob1 = `lesson 2 (Constructor)`("mohanad: ", 21)

    // lesson 5
    var obj2 = `lesson 5 (Overload)`()
    obj2.sum(5,9)
    obj2.sum(2.5f,3.5f)

    // lesson 7  // Inheritance
    var obj3 = `lesson 7 (2)`()
    obj3.printValue()
    obj3.printTest()

    var ob3 = `lesson 7 (3)`()
    ob3.mul()
    ob3.printValue()

    println("========================")
    var o3 = `lesson 7 (2)`()

    // lesson 7 // override lesson 12
    var obj4 = `lesson 7 (2)`()
    obj4.printValue()

    // تابع درس 36 abstract
    var obj_a = A()  // كلاس A داخل مجلد الـ Abstract
    obj_a.printValue()


}