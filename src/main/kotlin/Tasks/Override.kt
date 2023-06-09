
open class Bird {
    open var color:String=""
    open fun fly(){
        println("$color is flying")
    }
}
class Parrot: Bird() {
    override var color = "Green"
    override fun fly() {
        println("$color is flying...")
    }
}
class Duck: Bird() {
    override var color = "White"
    override fun fly() {
        println("$color is flying...")
    }
}
fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)
    val d = Duck()
    d.fly()
    println(d.color)
}