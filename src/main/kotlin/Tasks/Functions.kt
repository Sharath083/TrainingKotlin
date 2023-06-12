package Tasks

import java.math.BigInteger


fun main(){
    val myLamda = { b: Int, a: Int -> greater(a, b) }
    var res = ""


//    add(1,2,myLamda)
//    sub(5,2,{x,y-> res=greater(x,y) })
//    println(res)
//
//    rev(res) { it.reversed() } // "it" is used when there is only ine variable in lamda fun
//
//    sub1(7,2){x,y-> greater(x,y) }
//
//    var s = "SDF"
//    var c = with(S()){
//        this.j = "sadas"
//        this. j
//    }
//
//    println(c)
//    s = "as$s"

//var funTypes=FunTypes()
//    println(funTypes.namedParameters(b=2, a = 1, c = 3))
//    println(funTypes.namedParameters(b=2, a = 1))


    var set = Student_Extension_Function()
    println("pass status :    ${set.isPassed(55)}")
    println("Scholor status : ${set.isScholor(95)}")

    val s1 = "hey "
    val s2 = "Hello "
    val s3 = "There "
    println(s1.con(s2,s3))
    val a1 = 1
    a1.sum(2)
    a1.greater(2)
        5 greater 3  //use of infix function
    println(feb(n=10000000, BigInteger("1"), BigInteger("0")))
}

tailrec fun feb(n:Int,a:BigInteger,b:BigInteger): BigInteger {
    if (n==0)
        return b
    else
        return feb(n=n-1,a=a+b,b=a)
}

infix fun Int.greater(num: Int){  //infix will have only one parameter
    if (this>num){
        println("greater is $this")
    }else{
        println("greater is $num")
    }

}
fun Int.sum(num:Int){
    println("Sum is ${this+num}")
}
fun String.con(s1:String,s2:String):String{
    return this + s1 + s2
}
fun Student_Extension_Function.isScholor(marks:Int):Boolean{  //Here it adds this function under Student_Extension_Function class.
    // With this we can add any fun anywhere
    return marks>90
}


class Student_Extension_Function{
    fun isPassed(marks:Int):Boolean{
        return marks>50
    }
}
class FunTypes(){
    fun namedParameters(a:Int,b:Int,c:Int=12):String{
        return "a=$a ,b=$b ,c=$c"
    }
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
//
//fun add(a: Int, b: String, action: (Int, Int) -> String) {
//    var s = a + b;
//    println( action(b,a))
//
//}
