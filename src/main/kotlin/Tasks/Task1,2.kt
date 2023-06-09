package Tasks




fun main(args: Array<String>) {
//        println("Variables")
//        variables()
//        println("Strings")
//        strings()
//        println("operators")
//        operators()
//        println("IF")
//        conditionStatementsIf()
//        println("Loops")
//        println(whenStatement(23))
//        val array = arrayOf("a", "b", "c")
//        forLoop(array)
//        whileLoop(array)
//        doWhile(array)
//        f(baz="ds")

    val myLamda={b:Int,a:Int-> greater(a,b) }
    var res=""


    add(1,2,myLamda)
    sub(5,2,{x,y-> res=greater(x,y) })
    println(res)

    rev(res) { it.reversed() } // "it" is used when there is only ine variable in lamda fun

    sub1(7,2){x,y-> greater(x,y) }

    var s = "SDF"
    var c = with(S()){
        this.j = "sadas"
        this.j
    }

    println(c)
    s = "as$s"


}
class S{
    var j = "asd"
}
fun sub1(a: Int, b: Int, action: (Int, Int) -> String ) {
    println( action(a,b))

}
fun sub(a: Int, b: Int, action: (Int, Int) -> Unit ) {
    action(a,b)

}

fun rev(s:String,ac:(String)->String){
    println(ac(s))
}
fun greater(a:Int,b:Int):String{
    if (a>b){
        return "$a is greater"
    }else{
        return "$b is greater"
    }
}
fun variables() {
    var mutable = 1
    val immutabal = 1
    println(mutable)
    println(immutabal)
    mutable = 2
    println("After changing mutable=$mutable")
//    immutabal=3
    var float = 3.12
    println(float)

    val eNumber: Float = 35E3F
    println(eNumber)


    var a: String = "sharath"
    println("Before a= $a")
    a = "Sharath kumar"
    println("After  a =$a")
    val b: String = "sharath"
    println("val b=$b")
//    b="sharath kumar"

    var i: Int = 1
    println("var i=$i")
    val j: Int = 12
    println("val j=$j")


}

fun strings() {
    var string: String = "Sharath Kumar Reddy"
    println(string)

    var name: String = string

    string = string.plus(".B")
    println(string)

    println(string.equals(name))

    println(string.equals("Sharath Kumar Reddy.B "))

    println(string.indexOf("B"))

    println(string.get(20))

    println(string.substring(0, 19))

    println(string.uppercase())

    println(string.plus(name))


}

fun operators() {
    var a = 3
    var b = 4
    println(a == b)

    println(a >= b)

    a += b

    println(a)
}

fun conditionStatementsIf() {
    var a: Int = 12
    var b: Int = 14
    var c = if (a >= b) {
        a
    } else {
        b
    }
    println(c)
}

fun whenStatement(i: Int): String? {
    var s = when (i) {
        in 1..5 -> "selected 1 to 5"
        6 -> "selected 6"
        7, 8 -> "selected 7 or 8"
        !in 9..15 -> "not in 9 to 15"
        else -> {
            return "invalid"
        }
    }
    return s

}

fun forLoop(array: Array<String>) {

    for (i in array) {
        println(i)
    }
    for ((i, j) in array.withIndex()) {
        println("$j is at $i")
    }

}

fun whileLoop(array: Array<String>) {
    var s = array.size
    var i = 0
    while (s > 0) {
        println(array[i])
        s--
        i++
    }
}

fun doWhile(array: Array<String>) {
    var s = array.size
    var i = 0
    do {
        println(array[i])
        s--
        i++
    } while (s > 0)
}



fun f(
    bar: String = "12",
    baz: String = "1"
) {
    println("sgft")
}



fun add(a: Int, b: Int, action: (Int, Int) -> String) {
    var s = a + b;
    println( action(b,a))

}
