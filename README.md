# 🎬 Movie Tracker App – Lab 02 (INFO6130)

This Android application allows users to input and save movies along with their genres using a simple and clean user interface. Built as part of Lab 02 for INFO6130 – Android Application Development, the app uses `RecyclerView`, `ViewModel`, and `LiveData` to dynamically display and manage a list of movies.

DEMO 
https://github.com/user-attachments/assets/1918a28a-7cdc-4451-9e56-4d50d5921ca8

## 📱 Features

- Add a movie name and genre through input fields
- Save entries with a Material Design button
- View the list of saved movies in a scrollable `RecyclerView`
- Real-time updates using `LiveData` and `ViewModel`

## 💡 Technologies Used

- Kotlin
- Android Jetpack (ViewModel, LiveData)
- RecyclerView
- Material Components
- MVVM Architecture

## 📸 Screenshots

Portrait and Landscape layouts supported  
📲 Emulator: Pixel 5 - API 33

<img src="https://github.com/user-attachments/assets/3ab71ef8-960e-4b7c-a630-893a4e43bbed" width="200"/>

<img src="https://github.com/user-attachments/assets/0f9dbf59-a4e7-4b45-929b-f3fe80010544" width="200"/>

## 📁 Project Structure

- `MainActivity.kt` – App entry point and UI logic
- `Movie.kt` – Data class representing a movie
- `MovieAdapter.kt` – RecyclerView adapter for movie items
- `MovieViewModel.kt` – ViewModel managing the movie list
- `activity_main.xml` – Layout for main UI
- `item_movie.xml` – Layout for individual movie items


