package tasks.coroutines

import kotlinx.coroutines.*

fun main()= runBlocking {   //main thread
    println("Thread name ${Thread.currentThread().name}")
    val job:Job=launch {
        try {
            for (i in 1..50) {
                delay(5)
                println(i)
//            Thread.sleep(10)  //if we use sleep cancel will not work because coroutine is not cooperative
//            delay(10) //it makes coroutine cooperative because it belongs to kotlinx.coroutines package
                //all suspending functions will throw exception


            }
        }catch (e:CancellationException){
            println("$e ")
        }
        println("Coroutine has ended")
    }
    delay(1000)
    job.cancel(CancellationException("crashed"))
//    job.join()
//    job.cancelAndJoin()//we can use it instead of above

    println("End of main thread")

}