package Tasks.Collections

fun arrayDemo(){
    var arr = Array<Int>(3){0} //initialize the array
    println("Default array")
    arr.printArray()
    var arrInt=arrayOf<Int>(1,2,3,4,5)
    println("Integer array")
    arrInt.printArray()
    println("String array")
    val arrString = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
    arrString.printArray()
    val array= arrayOf(1,"s",20.32f,23.34)
    println("All Types")
    array.printArray()
    array[0]=23
    array[1]="ss"
//    array= arrayOf("sfg") //annot create new array because it is val
    println("All Types after change")
    array.printArray()
}
fun <D>Array<D>.printArray(){
    for(element in this){
        println(element)
    }
    println()
}

fun main(){
    arrayDemo()
}