package Tasks

import java.util.*

fun shiftFun(s:Char, l:Int):Char {
    var d: Char = s
    var l1:Int=l

    while(l1 != 0){

        if (d != 'z'&& d!='Z') {
            d++
            l1--
        }
        else if(d=='z') {
            d='a'
            l1 -= 1
        }
        else{
            d='A'
            l1 -= 1
        }
    }

    return  d
}
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter a string")
    var inputString:String? = readlnOrNull()
    println("Enter shift size")
    var shiftSize:Int= reader.nextInt()
    var final:String=""

    var output=inputString?.let {
        for (i in 0..inputString.length-1){
            final+= shiftFun(inputString[i],shiftSize)
        }

    }
    println("Encrypted Text = $final")

}