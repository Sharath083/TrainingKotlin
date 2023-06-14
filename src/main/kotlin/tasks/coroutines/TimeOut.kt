package tasks.coroutines

import kotlinx.coroutines.*

//fun main()= runBlocking {   //main thread
//    println("Thread name ${Thread.currentThread().name}")
//   withTimeout(1000) {//it throws exception if the coroutine is not finished within 1 sec
//       try {
//
//
//           for (i in 1..500) {
//               println(i)
////            Thread.sleep(10)  //if we use sleep cancel will not work because coroutine is not cooperative
//               delay(10) //it makes coroutine cooperative because it belongs to kotlinx.coroutines package
////            yield()
//
//
//           }
//       }catch (e:TimeoutCancellationException){
//           println("Exception Caught")
//       }
//        println("Coroutine has ended")
//    }
////    delay(100)
////    job.cancel()
////    job.join()
//
//    println("End of main thread")
//
//}


// Using withTimeoutOrNull


fun main()= runBlocking {   //main thread
    println("Thread name ${Thread.currentThread().name}")
    val result:String?= withTimeoutOrNull(2000) {//it will throw exception and can return a value
        for (i in 1..500){
            println(i)
//            Thread.sleep(10)  //if we use sleep cancel will not work because coroutine is not cooperative
            delay(10) //it makes coroutine cooperative because it belongs to kotlinx.coroutines package
//            yield()
        }
        "Coroutine has ended"
    }
    delay(100)
//    job.cancel()
//    job.join()
//    job.cancelAndJoin()//we can use it instead of above
    println("status = $result")

    println("End of main thread")

}