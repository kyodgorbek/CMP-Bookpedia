package org.example.yodgorbek.book.presentation.book_list

import org.example.yodgorbek.book.domain.Book
import org.example.yodgorbek.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)

