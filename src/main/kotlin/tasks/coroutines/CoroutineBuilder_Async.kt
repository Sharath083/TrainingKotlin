package tasks.coroutines

import kotlinx.coroutines.*

fun main()= runBlocking {   //main thread
    println("Start of Thread : ${Thread.currentThread().name}") //thread started
//    thread {
//        launch {
//
//        }
//    }

    //using async we can return data
    val cor: Deferred<Int> =async { //coroutine that created on Main Thread runs on same thread as main thread
        println("Start of coroutine : ${Thread.currentThread().name}")//starts on thread T1

        delay(1000)//coroutine suspended but main thread is free
        println("End of coroutine After 1second: ${Thread.currentThread().name}")
        1010

    }
//    delay(1000)instead of
//    val num=jobDeferred.await() can store return of cor
    cor.join()//waits until the coroutine finishes

    println("End of Thread : ${Thread.currentThread().name}")

}