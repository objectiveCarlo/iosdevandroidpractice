# 🚀 Android Dev for iOS Developers

Welcome to this repo! This project is specifically designed for **iOS developers** who want to get started with **Android development** using **Kotlin** and **Jetpack components**.

## 📱 What This Project Covers

- ✅ Basics of Android project structure and Gradle
- ✅ Simple `ViewModel` and `LiveData` usage
- ✅ Making network requests with `Retrofit`
- ✅ Parsing JSON using `Gson`
- ✅ Testing with `JUnit` and `MockWebServer`

## 🎯 Goal

Help iOS devs understand Android equivalents and patterns such as:

| iOS (Swift)              | Android (Kotlin)           |
|--------------------------|----------------------------|
| `UIViewController`       | `Activity` / `Fragment`     |
| `Observable`             | `LiveData`                 |
| `URLSession`             | `Retrofit` + `OkHttp`      |
| `XCTest`                 | `JUnit` + `MockWebServer`  |
| `Combine` / `RxSwift`    | `Coroutines` + `Flow`      |
| `SwiftUI`                | `Jetpack Compose` *(optional)* |

## 🧪 Try It Yourself

You can run this project in **Android Studio**. It includes:

- A simple API call to [Spaceflight News API](https://api.spaceflightnewsapi.net/v4/articles)
- A `ViewModel` that loads data
- Integration tests using test doubles

## 📂 Structure

```
.
├── app/
│   ├── viewmodel/        # ArticleViewModel
│   ├── network/          # Retrofit and API models
│   ├── MainActivity.kt   # Entry point
├── gradle/libs.versions.toml  # Modern dependency catalog
```

## ✅ Requirements

- Android Studio Hedgehog or newer
- Kotlin 1.9+
- Internet permission declared in `AndroidManifest.xml`

## 📌 Next Steps

Want to explore more?

- ✅ Jetpack Compose UI
- ✅ RecyclerView list
- ✅ Room database (CoreData equivalent)
- ✅ Hilt for dependency injection (like Swinject)

---

> Feel free to fork, clone, and modify! Happy learning! ✨
