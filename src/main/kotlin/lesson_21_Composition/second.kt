package lesson_21_Composition

class second: fist {
    constructor(){

    }

    // توضيح مفهوم الـ Composition
    var obj1 = fist()

    fun test(){
        obj1.n = 22
        obj1.printValue()
    }

}