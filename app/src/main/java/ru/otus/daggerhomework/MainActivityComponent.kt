package ru.otus.daggerhomework

import dagger.Component
import javax.inject.Scope

@MainActivityScope
@Component(
    dependencies = [AppComponent::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)
}

@Scope
annotation class MainActivityScope