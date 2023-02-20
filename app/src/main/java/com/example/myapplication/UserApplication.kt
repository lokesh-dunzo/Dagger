package com.example.myapplication

import android.app.Application

class UserApplication : Application() {
    lateinit var appComponenet: AppComponenet
    override fun onCreate() {
        super.onCreate()
       appComponenet = DaggerAppComponenet.builder().build()
        //   .build()
       // appComponenet = DaggerApp
    }
}