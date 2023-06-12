package tasks

import java.util.*


fun shiftFun(input: Char, shift: Int): Char {
    return if (shift == 0) {
        input
    } else if (input != 'z' && input != 'Z' ) {

        shiftFun(input + 1, shift - 1)

    } else if (input == 'z') {

        shiftFun('a', shift - 1)
    } else {
        shiftFun('A', shift - 1)
    }
}
fun main(){

    val reader = Scanner(System.`in`)
    println("Enter a string")
    val inputString = readlnOrNull()
    println("Enter shift size")
    val shiftSize:Int= reader.nextInt()
    var final:String=""

    inputString?.let {
        for (element in inputString) {
            final += shiftFun(element, shiftSize)
        }

    }
    println("Encrypted Text = $final")

}
//    fun shiftFun(s: Char, l: Int): Char {
//        var d: Char = s
//        var l1: Int = l
//
//        while (l1 != 0) {
//
//            if (d != 'z' && d != 'Z') {
//                d++
//                l1--
//            } else if (d == 'z') {
//                d = 'a'
//                l1 -= 1
//            } else {
//                d = 'A'
//                l1 -= 1
//            }
//        }
//
//        return d
//    }
