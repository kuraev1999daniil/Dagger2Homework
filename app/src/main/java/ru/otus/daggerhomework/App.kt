package ru.otus.daggerhomework

import android.app.Application

class App : Application() {

    val appComponent = DaggerAppComponent.factory().create(this)
}