package about_Interface

class rectangle: Drawable {

    var width: Double? = null
    var high: Double? = null

    constructor(p_width: Double, p_high: Double){
        width = p_width
        high = p_high
    }

    override fun draw(color: String) {
        println("color shape: $color")
    }

    override fun getArray(): Double {
        return this.width!! * this.high!!
    }
}