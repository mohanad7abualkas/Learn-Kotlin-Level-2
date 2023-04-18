class `lesson 2 (Constructor)` { //constructor

    // constructorعند وضع علامة () بعد الكلاس تعتبر بديل عن إنشاء دالة الـ

    var first_Name: String? = null
    var last_Name: String? = null
    var age: Int? = null

    // constructor 1
    constructor(P_firstName: String, P_lastName: String, P_age: Int){

        this.first_Name = P_firstName
        this.last_Name = P_lastName
        this.age = P_age

        println("First Name: $first_Name")
        println("Last Name: $last_Name")
        println("Age: $age")
    }

    // constructor 2
    constructor(v: String, a: Int){
        println(v + a)
    }

}