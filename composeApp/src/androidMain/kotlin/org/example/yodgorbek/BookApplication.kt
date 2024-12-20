package org.example.yodgorbek

import android.app.Application
import org.example.yodgorbek.di.initKoin
import org.koin.android.ext.koin.androidContext


class BookApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}