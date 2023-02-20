package com.example.myapplication

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NotificationServiceModule::class,UserRepositoyModule::class,AnalyticsModule::class])
interface UserRegistorationComponent {
    fun getEmailService() : EmailService
    fun inject(mainActivity: MainActivity)
    @Component.Factory
    interface Factory{

    }
}