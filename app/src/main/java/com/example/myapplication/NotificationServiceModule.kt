package com.example.myapplication

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule(private val retryCount : Int) {

    @Singleton
    @Named("Massage")
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}