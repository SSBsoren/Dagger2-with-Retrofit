package com.sagen.demo.di.component

import com.sagen.demo.ui.main.MainActivity
import com.sagen.demo.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}