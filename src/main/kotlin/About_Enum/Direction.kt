package About_Enum

// Enum = Enumeration
enum class Direction {

    North(10, "N"){
        override fun NameOfDirection() {
            println("North")
        }
    },
    East(25, "E"){
        override fun NameOfDirection() {
            println("East")
        }
    },
    West(26, "W") {
        override fun NameOfDirection() {
            println("West")
        }
    },
    South(13, "S") {
        override fun NameOfDirection() {
            println("South")
        }
    };

    var num: Int? =null
    var Name: String? = null

    // عدد الـ Parameters يجب أن يكون مساوي لعدد القيم التي داخل الثابت
    private constructor(P_num: Int, P_name: String) {
        num = P_num
        Name = P_name
    }

    fun printNumOfDirection(){
        println("Direction: $Name")
    }

    abstract fun NameOfDirection()

}

fun main (args: Array<String>){
    println( Direction.East.Name)
    Direction.North.printNumOfDirection()
    Direction.West.NameOfDirection()

    println("==================")

    // استخدام الـ when مع الـ Enum
    var so = Direction.North
    when (so)
    {
        Direction.South -> println("South")
        Direction.West -> println("West")
        Direction.North -> println("North")
        Direction.East -> println("East")
    }

    println("********************")
    // شرح الـ Values  و الـ Valueof()
    var x = Direction.valueOf("North")
    x.NameOfDirection()

    // تابع
    println("Enter Direction")
    var y = Direction.valueOf(readLine()!!.toString())
    when (y)
    {
        Direction.South -> println("South")
        Direction.West -> println("West")
        Direction.North -> println("North")
        Direction.East -> println("East")
    }

    println("==========================")

    // دالة الـ values() يتم تخزين جميع الثوابت فيها وترجع مصفوفة من نوع Enum
    for (i in Direction.values())
    {
        println(i)
    }

}