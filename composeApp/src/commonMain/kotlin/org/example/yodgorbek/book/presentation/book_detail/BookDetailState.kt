package org.example.yodgorbek.book.presentation.book_detail

import org.example.yodgorbek.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)