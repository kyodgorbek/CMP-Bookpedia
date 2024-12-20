package org.example.yodgorbek

import androidx.compose.ui.window.ComposeUIViewController
import org.example.yodgorbek.app.App
import org.example.yodgorbek.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    })
{ App() }