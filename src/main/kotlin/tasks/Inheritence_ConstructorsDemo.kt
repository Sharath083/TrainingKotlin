package tasks

 open class ConstructorsDemo (val nameClass:String){
    constructor(name:String,id:Int) : this(name) {
        println("name")
    }
    protected fun j(){
        println("protected fun")

    }
     init {
         println("init")
         sd()

     }
     fun sd(){
         println("sd")

     }


}
//fun main(){
//    var ob=ConstructorsDemo("main",1)
//    println( ob.nameClass)
//
//    var ob1=sub()
//    println(ob1.s)
//
//}
internal class sub : ConstructorsDemo("sub") {
    val f=j()
    val s=nameClass
}
class NonSub{ //: sub() {//Cannot inherit sub couse it is not open
    var sdd= ConstructorsDemo("sd")
    //sdd.j()//cannot call because protected
}




//open class ConstructorsDemo1(var name: String){
//    constructor(name:String,id:Int,pass:String):this("in 3 para"){
//        println(name)
//        println(id)
//        println(pass)
//    }
//    constructor(name:String,id:Int):this("in 3 para") {
//        println("name")
//    }
//
//
//}
//fun main(){
//    var sddf=ConstructorsDemo1("fgwy",1)
//    var sderfe=SubClass("dfsef",23,"Fwef",35)
//
//}
//class SubClass(var age: Int):ConstructorsDemo1("dfbresyfuy"){
//    constructor(name: String, id: Int, pass: String,age:Int):this(12) : super("f",23) {
//        println()
//    }
//}


open class ConstructorsDemo1{
    constructor(name:String,id:Int,pass:String){//:this(name,id){
        println(name)
        println(id)
        println(pass)
    }
    constructor(name:String,id:Int):this(name,id,"rg") {
        println("name")
    }


}
//fun main(){
//    var sddf=ConstructorsDemo1("fgwy",1)
//
//}
class SubClass: ConstructorsDemo1 {
    constructor(name: String, id: Int, pass: String) : super(name,id,pass) {
        println()
    }
}





open class Employee(name: String, age: Int, salary: Float) {
    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }
}
open class Programmer(name: String, age: Int, salary: Float): Employee(name,age,salary){
    fun doProgram() {
        println("programming is my passion.")
    }
}
class Salesman(name: String, age: Int, salary: Float): Employee(name,age,salary){
    fun fieldWork() {
        println("travelling is my hobby.")
    }
}
fun main(args: Array<String>){
//    var sddf=ConstructorsDemo1("fgwy",1)

    //    var ob=ConstructorsDemo("main",1)
//    println( ob.nameClass)
//
//    var ob1=sub()
//    println(ob1.s)


    val obj1 = Programmer("Ashu", 25, 40000f)
    obj1.doProgram()
    val obj2 = Salesman("Ajay", 24, 30000f)
    obj2.fieldWork()

}