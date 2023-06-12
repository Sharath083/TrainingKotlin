package tasks

abstract class Bank {
    abstract fun simpleInterest(p: Int, r: Double, t: Int) :Double
}

class SBI : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{
        return (p*r*t)/100
    }
}
class PNB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{
        return (p*r*t)/100
    }
}
//fun main() {
//    var sbi : Bank =SBI()
//    val sbiint = sbi.simpleInterest(1000,5.0,3)
//    println("SBI interest is $sbiint")
//    var pnb : Bank= PNB()
//    val pnbint = pnb.simpleInterest(1000,5.0,3)
//    println("PNB interest is $pnbint")
//}

interface MyInterface1 {
    fun doSomething() {
        println("MyInterface 1 doing some work")
    }
    fun absMethod() //should implement because body is not defined
}

interface MyInterface2 {
    fun doSomething() {
        println("MyInterface 2 doing some work")
    }
    fun absMethod() {
        println("MyInterface 2 absMethod")
    }

}

class C : MyInterface1 {
    override fun absMethod() {
        println("MyInterface1 absMethod implementation")
    }
}

class D : MyInterface1, MyInterface2 {
    override fun doSomething() {
        super<MyInterface1>.doSomething()//calls do something in interface1
        super<MyInterface2>.doSomething()//calls do something in interface2
    }

    override fun absMethod() {  //overriding this method because it is abstract

        super<MyInterface2>.absMethod()
    }
}

fun main() {
    val d = D()
    val c = C()
    d.doSomething()
    d.absMethod()
    c.doSomething()
    c.absMethod()
}