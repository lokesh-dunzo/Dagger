package com.example.myapplication

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email: String,password: String);
}

@Singleton
class SQLRepository @Inject constructor(val analyticSeervice: AnalyticSeervice) : UserRepository{

    override fun saveUser(email : String, password : String){
        Log.d("Saving","Data in SQl");
        analyticSeervice.trackEvent("Save User","Create")
    }
}

class FireBaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Saving","Data in firbase")
    }
}

