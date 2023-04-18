package about_Interface

class circle: Drawable {

    private var radius: Double? = null

    constructor(p_radius: Double){
        radius = p_radius
    }

    override fun draw(color: String) {
        println("Drawing circle... color shape: $color")

    }

    override fun getArray(): Double {
        return Math.PI * this.radius!! * this.radius!!
    }


}