package tasks.coroutines.suspendingFun




import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main()= runBlocking {   //main thread


    println("Thread name ${Thread.currentThread().name}")

    val time= measureTimeMillis {
        val msg1: Deferred<String> = async { functionCon1() }//child 1  // runs on background coroutine let be c1


        val msg2: Deferred<String> =
            async { functionCon2() }//child 2  // runs on background coroutine let be c2 .so they run in parallel
        println(msg1.await() + msg2.await())//if msg1 and msg2 is not used in program then the async coroutines will not be executed
        //here these two are running  Concurrently which took 1 sec

    }


    println("Time Taken=$time")
    println("Main Thread Ended")


}
suspend fun functionCon1():String{
    delay(1000)
    println("Lazy fun 1")
    return "hello"
}
suspend fun functionCon2(): String {
    delay(1000)
    println("lazy fun 2")
    return "World"
}
//
//
//
//
//
//
//
//




//package tasks.coroutines.suspendingFun
//
//
//
//
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
//fun main()= runBlocking {   //main thread
//
//
//    println("Thread name ${Thread.currentThread().name}")
//
//val time= measureTimeMillis {
//    val msg1: Job = launch {
//        functionLazy1() }//child 1  // runs on background coroutine let be c1
//
//
//    val msg2: Job =launch { functionLazy2() }//child 2  // runs on background coroutine let be c2 .so they run in parallel
////        println(msg1.await()+msg2.await())//if msg1 and msg2 is not used in program then the async coroutines will not be executed
//    //here these two are running  Concurrently which took 1 sec
//    msg1.join()
//    msg2.join()
//
//}
//
//
//    println(time)
//    println("Main Thread Ended")
//
//
//}
//suspend fun functionLazy1(){
//    delay(3000)
//    println("Lazy fun 1")
////    return "hello"
//}
//suspend fun functionLazy2() {
//    delay(3000)
//    println("lazy fun 2")
////    return "World"
//}








