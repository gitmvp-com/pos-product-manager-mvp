# POS Product Manager MVP

A simplified MVP version of [Solite-POS](https://github.com/denisyordanp/Solite-POS) focusing on Product Management.

## Features

- ✅ Product List with Jetpack Compose UI
- ✅ Add/Edit/Delete Products
- ✅ Local Storage with Room Database
- ✅ MVVM Architecture
- ✅ Dependency Injection with Hilt
- ✅ Kotlin Coroutines for async operations

## Tech Stack

- **Language**: Kotlin 1.7.10
- **UI**: Jetpack Compose (BOM 2022.10.00)
- **Database**: Room 2.4.3
- **DI**: Hilt 2.44
- **Architecture**: MVVM with Clean Architecture principles
- **Min SDK**: 23
- **Target SDK**: 33

## Project Structure

```
app/
├── data/          # Room Database, DAO, Entities
├── domain/        # Use Cases, Repository Interface
├── ui/            # Compose UI, ViewModels
└── di/            # Hilt Modules
```

## Building

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle
4. Run the app

## License

This project is a simplified educational MVP based on Solite-POS.
