package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegisterationService: UserRegisterationService
    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val a = DaggerUserRegistorationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()
        emailService = a.getEmailService()

        val b = DaggerUserRegistorationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()

        emailService1 = b.getEmailService()


        a.inject(this)
        */
        //val a = (application as UserApplication).userRegistorationComponent
        //emailService1 = a.getEmailService()
        //emailService1 = a.getEmailService()
       // a.inject(this)
       // userRegisterationService.registor("Lokesh@gmail.com","111.111")
    }
}