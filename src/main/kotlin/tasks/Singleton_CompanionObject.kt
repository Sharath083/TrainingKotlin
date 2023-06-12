package tasks

object SingletonDemo { //syntax to create singleton
    var variable="SingletonVariable"

    fun single(){
        println("Singleton Method")
    }

}
//fun main(){
//    SingletonDemo.single()
//    println(SingletonDemo.variable)
//    SingletonDemo.variable="new"
//    println(SingletonDemo.variable)
//
//}

class Comp{
    fun normal(){
        println("Normal Method")
    }
    companion object{
        var co="Co Variable"
        fun co(){
            println("Companion ob method")
        }
    }
}
fun main(){
    var ob= Comp()
    ob.normal()//we have to create object to access methods outside com Object
    println(Comp.co)//can access using class name like static in java
    Comp.co()
}
