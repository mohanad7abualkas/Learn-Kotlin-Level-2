package about_Interface

fun main (args: Array <String>){

    var obj = Demo()
    obj.display()

    println("*=*=*=*=*=*=*=*=*=*=*=*=")

    // Drawable & circle
    var obj1 = circle(5.0)
    obj1.draw("Black")
    var r_circle = obj1.getArray()
    println("Circle area: $r_circle")

    println("*=*=*=*=*=*=*=*=*=*=*=*=")

    // poly_Demo
    var r_circle1 = circle(2.5)
    var l_sqare = sqare(4.2)
    var wh_rec = rectangle(3.0,2.0)

    var poly_D = poly_Demo()
    var result = poly_D.poly(l_sqare)
    println(result)
}