package about_Interface

class sqare: Drawable {

    var l_sqare: Double? = null

    constructor(p_l: Double){
        l_sqare = p_l
    }

    override fun draw(color: String) {
        println("color shape: $color")
    }

    override fun getArray(): Double {
        return this.l_sqare!! * 2
    }
}