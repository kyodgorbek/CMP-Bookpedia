This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - `commonMain` is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the
      folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for
  your project.

Learn more
about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

# CMP-Bookpedia

CMP-Bookpedia is a Kotlin Multiplatform (KMP) project that uses **Jetpack Compose** for building a cross-platform application to manage and display a collection of books. The app supports multiple platforms including Android, Desktop (Compose for Desktop), and iOS.

## Features

- **Kotlin Multiplatform**: Share code between Android, Desktop, and iOS.
- **Jetpack Compose**: A modern declarative UI toolkit for building native UIs.
- **Room Database**: For local data storage (currently integrated for Android and Desktop).
- **Koin**: Dependency injection framework used for managing dependencies.

## Platforms

- **Android**: Full Android application built using Jetpack Compose.
- **Desktop**: Desktop application using Jetpack Compose for Desktop.
- **iOS**: Cross-platform support with shared codebase (experimental).

## Prerequisites

To build and run the app, you need the following:

- **Android Studio** (for Android and Desktop development).
- **Xcode** (for iOS development, if you're targeting iOS).
- **Kotlin 1.8+** (or the version specified in the project).
- **JVM 11** for building and running the Desktop application.

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/kyodgorbek/CMP-Bookpedia.git
   cd CMP-Bookpedia


