package tasks

fun main() {
    val value1: Long = 200
    val value2: Int =value1.toInt()
    println(value2)
    val value3 = 100
    val value4: Long =value3.toLong()
    println(value4)
    val string="s"
    try {
        val num=string.toInt()
        println(num)
    }catch (e:NumberFormatException){
        println(e)
    }

}