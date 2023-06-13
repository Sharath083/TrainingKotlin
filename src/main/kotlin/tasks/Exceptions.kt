package tasks

fun main() {
    val str = getNumber("10")
    println(str)
    println(div(1,0))
    nested()
    throws()
}
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}
fun div(a:Int,b:Int):Any{
    return try {
        a/b
    }catch (e:ArithmeticException){
        "$e  give different denominator"
    }
}

fun nested(){
    val arr1 = intArrayOf(4, 8, 16, 3)
    val arr2 = intArrayOf(2, 0)
    try {

        for (i in arr1.indices) {
            try {
                println(arr1[i].toString() + " / " + arr2[i] + " is " + arr1[i] / arr2[i])
            } catch (e: ArithmeticException) {
                println("$e Can't divided by Zero!")
            }

        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("$e Element not found.")
    }
    finally {
        println("Finally block")
    }
}
fun throws() {
    validate(15)
    println("code after validation check...")
}
fun validate(age: Int) {
    try {
        if (age < 18)
            throw ArithmeticException("under age")
        else
            println("eligible for drive")
    }catch (e:ArithmeticException){
        println(e)
    }

}