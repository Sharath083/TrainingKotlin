package Tasks.Collections

fun immutableList(){//cannot add or change elemnets in immutable list

    var list = listOf("Ajay","Vijay","Prakash",1,2,3)

//    list.set
    var intList: List<Int> = listOf<Int>(1,2,3)
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
//    list.add("d")  //fixed size ,cannot add new elements

}
fun mutableList() {
    val mutableList: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
//    mutableList=mutableListOf(1, 4, 9, 16, 25)//can not create new object because of val
    var mutableList1: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
    mutableList1= mutableListOf(1,23,453)
    val anyList = mutableListOf("Ajay","Vijay","Prakash",1,2,3)
    anyList.printList()
    anyList.set(1,"sf")
    println("After change")
    anyList.printList()

    val arrayList:ArrayList<String> = arrayListOf("2df","gew")

    println("array list")

    arrayList.printList()

}

fun <D>List<D>.printList(){

    for(element in this){
        println(element)
    }

}

fun main(){
    val arrayList:ArrayList<String> = arrayListOf("2df","gew")
    println(arrayList)
//    mutableList()
}