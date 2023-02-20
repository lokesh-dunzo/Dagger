package com.example.myapplication

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {
    @Singleton
    @Provides
    fun getAnalyticService() : AnalyticSeervice{
        return MixPanel();
    }
}