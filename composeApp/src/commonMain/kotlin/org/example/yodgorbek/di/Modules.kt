package org.example.yodgorbek.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.example.yodgorbek.book.data.database.DatabaseFactory
import org.example.yodgorbek.book.data.database.FavoriteBookDatabase
import org.example.yodgorbek.book.data.network.KtorRemoteBookDataSource
import org.example.yodgorbek.book.data.network.RemoteBookDataSource
import org.example.yodgorbek.book.data.repository.DefaultBookRepository
import org.example.yodgorbek.book.domain.BookRepository
import org.example.yodgorbek.book.presentation.SelectedBookViewModel
import org.example.yodgorbek.book.presentation.book_detail.BookDetailViewModel
import org.example.yodgorbek.book.presentation.book_list.BookListViewModel
import org.example.yodgorbek.core.data.HttpClientFactory


import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf

import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)


}

