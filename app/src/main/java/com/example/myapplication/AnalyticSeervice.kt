package com.example.myapplication

import android.util.Log

interface AnalyticSeervice {
    fun trackEvent(eventName : String , eventTyp : String)
}

class MixPanel : AnalyticSeervice {
    override fun trackEvent(eventName: String, eventTyp: String) {
        Log.d("Lokesh","Dhayal")
    }
}

class FireBaseAnalytics : AnalyticSeervice{
    override fun trackEvent(eventName: String, eventTyp: String) {
        Log.d("FireBase","Analytis")
    }
}