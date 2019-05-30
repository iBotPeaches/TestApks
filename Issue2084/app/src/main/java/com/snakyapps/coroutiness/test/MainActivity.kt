package com.snakyapps.coroutiness.test

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : Activity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job
    val job = SupervisorJob()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launch {
            while(isActive) {
                withContext(Dispatchers.Default) {
                    delay(2000)
                }
                Toast.makeText(this@MainActivity, "Coroutine has worked!", Toast.LENGTH_SHORT).show()
                withContext(Dispatchers.Default) {
                    delay(2000)
                }
            }
        }
    }

    override fun onStop() {
        super.onStop()
        job.cancel()
    }
}
