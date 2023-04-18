package Any_Class

class Demmo {

    companion object {
        fun show(a: Any) {
            a as first
            a.printVal()

        }

        fun returnShow(): Any {

            var objf = first()
            return objf

            var objs = second()
            return objs

            var objT = Third()
            return objT

        }
    }
}