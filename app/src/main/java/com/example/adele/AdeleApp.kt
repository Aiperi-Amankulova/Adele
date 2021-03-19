package com.example.adele

import android.app.Application
import com.example.adele.data.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AdeleApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AdeleApp)
            modules(appModules)
        }
    }
}