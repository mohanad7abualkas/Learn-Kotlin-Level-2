package lessons_37_to_44_revison


// مراجعة للـ Abstract مع الـ polymorphism
class Demo {

    // هنا يتم تمرير أوبجكت للـ parameter من الكلاسات الوارثة لكلاس الـ Car لأنه من نوع Abstract ولا يمكن إنشاء أوبجكت منه
    fun poly (car: Car){
        car.printInfo()
    }
}