package Tasks.Collections


fun immutableSet(){
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

}
fun mutableSet(){
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruit.add("mango")
//    fruit.

}