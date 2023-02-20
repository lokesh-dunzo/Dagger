package com.example.myapplication

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String,from : String , body : String);
}

@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(to,from)
    }
}

class MessageService(private val retryCount : Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(to,"" + retryCount)
    }
}