package ru.gmasalskih.ezcs.di

import org.koin.dsl.module
import ru.gmasalskih.ezcs.Test

internal val appModule = module {
    factory { Test() }
}
