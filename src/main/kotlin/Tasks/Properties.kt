package Tasks

    fun  main(args: Array<String>) {

        val sai = Girl()
        sai.actualAge = 15
        sai.age = 15
        println("actual age = ${sai.actualAge}")
        println("pretended age = ${sai.age}")

        val sai1 = Girl()
        sai1.actualAge = 22
        sai1.age = 22
        println("actual age = ${sai1.actualAge}")
        println("pretended age = ${sai1.age}")
    }

class Girl {
    //
    var age: Int = 0
        get() = field+56
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}

