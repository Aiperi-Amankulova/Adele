package com.example.adele.data.di

import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
}

val repositoryModule: Module = module {
}

val apiModule: Module = module {

}

val appModules =
        listOf(viewModelModule, apiModule, repositoryModule)