package org.example.yodgorbek

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.example.yodgorbek.book.domain.Book
import org.example.yodgorbek.book.presentation.book_list.BookListScreen
import org.example.yodgorbek.book.presentation.book_list.BookListState
import org.example.yodgorbek.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
private fun BookSearchBarPreview(modifier: Modifier = Modifier) {
    Box(
        modifier =
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()

        )

    }


}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}

    )

}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "book $it",
        imageUrl = "https://picsum.photos/200",
        authors = listOf("Philipp Lackner "),
        description = "description $it",
        languages = emptyList(),
        firstPublishYear = "1989",
        averageRating = 4.67854,
        ratingCount = 10,
        numPages = 100,
        numEditions = 10


    )
}