package many_subjects

import many_subjects.Animal

// sub class
class cat: Animal {

    var name: String? = null

    constructor(p_Name: String){
        this.name = p_Name
        println("Name is $name")
    }

    override fun play(){
        println("Cat Play ${this.name}")
    }

    override fun sleep() {
        println("${this.name} Sleeping")
    }
}