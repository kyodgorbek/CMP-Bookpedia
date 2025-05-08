package org.example.yodgorbek.book.data.network

import org.example.yodgorbek.book.data.dto.BookWorkDto
import org.example.yodgorbek.book.data.dto.SearchResponseDto
import org.example.yodgorbek.core.domain.DataError
import org.example.yodgorbek.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}