package Tasks


fun main(){
    nullCheck()


}
fun nullCheck(){
    var d:String?="dfgh"
    var s:String?=null
    if (s != null) {
        println(s.length)
    }
    var vv:Int=0
    var c = d?.let {
        vv=d.length ?: 2
        println(s?.length ?: 3)
        10000

    }?:5
    println(vv)
    println(c)



    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) }

    }


    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    println( nullableList.filterNotNull())
}
