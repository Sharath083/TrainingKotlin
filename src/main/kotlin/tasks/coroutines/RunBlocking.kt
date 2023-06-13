package tasks.coroutines

import kotlinx.coroutines.*

fun main()= runBlocking {   //main thread
//    runBlocking {//runs on main thread

        println("Start of Thread : ${Thread.currentThread().name}") //thread started

//    thread {  //background thread-0
//        println("Start of Sub-Thread : ${Thread.currentThread().name}")//start
//        Thread.sleep(1000)//doing some work
//        println("End of Sub-Thread After 1second: ${Thread.currentThread().name}")//ended after main thread because of 1 second work
//    }

        GlobalScope.launch {//on thread T1  //coroutine that created on another background  thread
            println("Start of coroutine : ${Thread.currentThread().name}")//starts on thread T1

//            Thread.sleep(1000)//it blocks the thread1 for second
            delay(1000)//it only blocks the coroutine but not the background thread T!
            //doing some work
            println("End of coroutine After 1second: ${Thread.currentThread().name}")//MAy execute on T1 or other threads
            //ended after main thread because of 1 second work
        }

//        runBlocking { //it is a coroutine that blocks the thread
//            delay(1000)//can use delay by using run Blocking
//        }
        delay(1000)//runs on main thread
//    delay(100) will only work inside a coroutine
//        Thread.sleep(1099)//if we remove this the program will end before the execution of coroutine
        println("End of Thread : ${Thread.currentThread().name}")//thread ended before sub thread.they ran in  parallel without blocking
//    }

}


suspend fun sus(){
    //we can create our own suspend functions
}