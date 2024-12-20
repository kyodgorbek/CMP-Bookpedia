package org.example.yodgorbek.book.presentation.book_list

import org.example.yodgorbek.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClick(val book: Book) : BookListAction
    data class OnTabSelected(val index: Int) : BookListAction


}