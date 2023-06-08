package Tasks


fun main(){
    nullCheck()



}
fun nullCheck(){
    var s:String?="Dwetdfte"
    var d:String?=null
    if (s != null) {
        println(s.length)
    }
    println(d?.length)
    println(d!!.length)//throws exception




    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) }

    }


    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    println( nullableList.filterNotNull())
}
