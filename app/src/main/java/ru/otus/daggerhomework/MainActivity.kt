package ru.otus.daggerhomework

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var context: Context

    private val appComponent = (applicationContext as App).appComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerMainActivityComponent
            .builder()
            .appComponent(appComponent)
            .build()
            .inject(this)

        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "$context")
    }
}