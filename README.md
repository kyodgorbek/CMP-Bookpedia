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

CMP-Bookpedia is a Compose Multiplatform (CMP) project that uses **Jetpack Compose** for building a cross-platform application to manage and display a collection of books. The app supports Android, (Compose for Desktop), and iOS.

## 📐 Design

The design of **CMP-Bookpedia** prioritizes simplicity, usability, and cross-platform compatibility. Below is a breakdown of the design philosophy and key UI components used in the project.

## Features

-- **Jetpack Compose**: Build UIs declaratively for multiple platforms.
- **Clean Architecture**: Structured with **Presentation**, **Domain**, and **Data** layers.
- **Room Database**: Store favorite books locally on Android and Desktop.
- **Koin**: Dependency Injection for simplified app architecture.
- **Ktor**: For handling API requests to **Open Library API**.
- **Custom Animations**: Beautiful transitions to enhance user experience.
- **Offline Support**: Room database allows users to view favorite books without an internet connection.

## 📸 **Screenshots**

### 🏠 **Home Screen**
![Home Screen](https://raw.githubusercontent.com/kyodgorbek/CMP-Bookpedia/master/composeApp/assets/screen1.png)
### 🔍 **Search Screen**
![Search Screen](https://raw.githubusercontent.com/kyodgorbek/CMP-Bookpedia/master/composeApp/assets/screen2.png)

### 📘 **Book Details**
![Book Details](https://raw.githubusercontent.com/kyodgorbek/CMP-Bookpedia/master/composeApp/assets/screen3.png)

### 🌟 **Favorites Screen**
![Favorites Screen](https://raw.githubusercontent.com/kyodgorbek/CMP-Bookpedia/master/composeApp/assets/screen4.png)
  ### 🎨 **Design Approach**

- **Minimalist UI**: Clean and intuitive interface with minimal distractions.
- **Consistent Design**: Ensures a similar look and feel on Android, Desktop, and iOS.
- **Responsive Design**: The layout adjusts for different screen sizes and orientations.
- **Animations**: Smooth transitions between screens for a polished user experience.

---

### ✍️ **Design Components**

| **Component**       | **Description**                         |
|---------------------|-----------------------------------------|
| **Book List Screen** | Displays a scrollable list of books, each with a title, author, and thumbnail. |
| **Search Bar**       | Allows users to search for books by title, author, or keyword. |
| **Book Detail Screen**| Displays full details of the book, including title, author, description, and an option to save as a favorite. |
| **Navigation Drawer**| Slide-out drawer to navigate between **Book List**, **Favorites**, and **Settings**. |
| **Custom Animations**| Transitions between list and detail screens, button clicks, and search animations. |
| **Loading Indicators**| Custom loading spinners while data is being fetched from the API. |
| **Error States**     | Display error messages when API calls fail or when no search results are found. |

---

### 🎨 **UI Colors and Themes**

| **Color**           | **Usage**           | **Hex Code**       |
|---------------------|---------------------|---------------------|
| **Primary Color**    | App bar, action buttons | `#3B82F6` (Blue)   |
| **Accent Color**     | Highlight actions, buttons | `#22C55E` (Green)  |
| **Background Color** | Screen background  | `#F9FAFB` (Light Gray) |
| **Text Color**       | Primary text       | `#1F2937` (Dark Gray)  |
| **Error Color**      | Error messages     | `#EF4444` (Red)    |


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


