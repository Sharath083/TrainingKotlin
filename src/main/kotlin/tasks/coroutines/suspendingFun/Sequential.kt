package tasks.coroutines.suspendingFun


import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main()= runBlocking {   //main thread
    println("Thread name ${Thread.currentThread().name}")

    val time= measureTimeMillis {

        println(function1() + function2())
        //here these two are running  sequentially which took 2 secs
        //By default method in coroutine run sequentially
    }
    println("Time taken = $time")
    println("Main Thread Ended")


}
suspend fun function1(): String {
    delay(1000)
    return "hello"
}
suspend fun function2(): String {
    delay(1000)
    return "World"
}