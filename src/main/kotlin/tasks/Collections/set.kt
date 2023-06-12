package tasks.Collections


fun immutableSet(){
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

}
fun mutableSet(){
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruit.add("mango")
    fruit.remove("apple")
    println(fruit)

}
fun main(){

    immutableSet()

    mutableSet()
}