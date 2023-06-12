package tasks

class Nested {
    private var num:Int=1
    fun outer(){
        println("outer")
    }
    class Inner(){
        private var num2:Int=2
        fun innerFun(){
            println("Inner")
        }
        class Inner2(){
            fun inner2(){
                println("inner2")
//                var s:Int=num+num1
            }
        }
    }

}
fun main(){
    var ob= Nested()
    var ob1= Nested.Inner()
    var ob2= Nested.Inner.Inner2()
    ob.outer()
    ob1.innerFun()
    ob2.inner2()
}