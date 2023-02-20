package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoyModule {
    @Binds
    abstract fun getFireBase(sqlRepository: SQLRepository) : UserRepository
}