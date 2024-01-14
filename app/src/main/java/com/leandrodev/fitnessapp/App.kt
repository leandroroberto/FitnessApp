package com.leandrodev.fitnessapp

import android.app.Application
import com.leandrodev.fitnessapp.model.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase
    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDataBase(this)
    }
}