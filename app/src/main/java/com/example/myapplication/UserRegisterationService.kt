package com.example.myapplication

import dagger.Component
import javax.inject.Inject
import javax.inject.Named

class UserRegisterationService  @Inject constructor(private val userRepository: UserRepository,@Named("Massage") private val notificationService: NotificationService) {
    fun registor(email:String,password : String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"no-reply@lokesh.com","111.111")
    }
}