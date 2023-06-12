package tasks

class Genrices<D>(var age:D)
//data class Genrice<D>(var age:D) {
//
//}
fun main(){
    var ob: Genrices<Int> = Genrices(1)
    var ob1: Genrices<String> = Genrices("12") //can declare any type of value by giving default generic while declaring
    println(ob)
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    printValue(stringList)
    printValue(floatList)
    println("Using Extension function")
    stringList.printList()
    floatList.printList()

}
fun <T>printValue(list: ArrayList<T>){//can have genrices for functions to pass any data type
    for(element in list){
        println(element)
    }
}
fun <D>List<D>.printList(){
    for(element in this){
        println(element)
    }
}