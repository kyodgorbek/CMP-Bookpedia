package org.example.yodgorbek

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.yodgorbek.app.App
import org.example.yodgorbek.di.initKoin

fun main() {
    application {
        initKoin()
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}