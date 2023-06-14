package tasks.coroutines

import kotlinx.coroutines.*

//fun main()= runBlocking {   //main thread
//    println("Thread name ${Thread.currentThread().name}")
//    val job:Job=launch {
//        for (i in 1..500){
//            println(i)
////            Thread.sleep(10)  //if we use sleep cancel will not work because coroutine is not cooperative
////            delay(10) //it makes coroutine cooperative because it belongs to kotlinx.coroutines package
//            yield()
//
//
//        }
//        println("Coroutine has ended")
//    }
//    delay(100)
////    job.cancel()
////    job.join()
//    job.cancelAndJoin()//we can use it instead of above
//
//    println("End of main thread")
//
//}

//Another way to make it cooperative by using "isActive



fun main()= runBlocking {   //main thread
    println("Thread name ${Thread.currentThread().name}")
    val job:Job=launch(Dispatchers.Default) {
        for (i in 1..5000){
            if(!isActive){//if Dispatchers.Default is not used isActive will not work will not work
                return@launch//used instead of break statement
//                break
            }
            println(i)
            println(!isActive)
//            Thread.sleep(1)
//            Thread.sleep(10)  //if we use sleep cancel will not work because coroutine is not cooperative
//            delay(10) //it makes coroutine cooperative because it belongs to kotlinx.coroutines package
//            yield()


        }
        println("Coroutine has ended")
    }
    delay(1)
//    job.cancel()
//    job.join()
    job.cancelAndJoin()//we can use it instead of above

    println("End of main thread")

}