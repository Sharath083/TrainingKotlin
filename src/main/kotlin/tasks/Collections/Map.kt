package tasks.Collections

fun immutableMap(){
    val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
// Mutable map with explicit type declaration
    println("The first value in the map is: ${readOnlyAccountBalances[1]}")


}
fun mutableMap(){
    val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    accountBalances[4] = 100
    println(accountBalances)
    accountBalances.remove(4)    // Remove the key 4 from the list
    println(accountBalances)
}
fun main(){

    immutableMap()

    mutableMap()
}