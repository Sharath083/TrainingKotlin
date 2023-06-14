package tasks.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {

    val msg=launch(Dispatchers.Default) { //runs on parent thread until end
        println(Thread.currentThread().name)
    }
    val msg1=launch(Dispatchers.Unconfined) { //starts on parent ,if have any delays it will switch to any thread
        println(Thread.currentThread().name)
        delay(100)
        println(Thread.currentThread().name)

    }

}


