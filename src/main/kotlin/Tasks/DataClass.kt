package Tasks
class NormalClass(var name:String,var age:Int)
data class DataClass(var name:String,var age:Int)//it has inbuilt toString.hashcode,getter and setters
data class DataClass1(var name:String,var age:Int=23)//can have default value and can change value
fun main(){

    var obNormalClass=NormalClass("s",23)//Normal class
    println(obNormalClass)

    var ob1=DataClass("s",22)
    println(ob1)//directly getting to string
    ob1.age=223//setting age
    println(ob1.age)//getting age

    var ob2=ob1.copy()

    println(ob1.hashCode())
    println(ob2.hashCode())
    println(ob1 == ob2)
}




