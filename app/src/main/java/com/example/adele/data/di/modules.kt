package com.example.adele.data.di

import com.example.adele.ui.bottom_nav.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { HomeViewModel() }
}

val repositoryModule: Module = module {
}

val apiModule: Module = module {

}

val appModules =
        listOf(viewModelModule, apiModule, repositoryModule)