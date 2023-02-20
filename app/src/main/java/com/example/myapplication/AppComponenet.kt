package com.example.myapplication

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponenet {
    fun getAnalayticService() : AnalyticSeervice
}