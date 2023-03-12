package ru.gmasalskih.ezcs

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.gmasalskih.ezcs.di.appModule

class EzCSApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@EzCSApp)
            modules(appModule)
        }
    }
}
