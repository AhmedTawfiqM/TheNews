package dependencies


object Dependencies {
    const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val androidx_core = "androidx.core:core-ktx:1.3.2"
    const val appCompact = "androidx.appcompat:appcompat:${Versions.app_compact_version}"
    const val materialDesign =
        "com.google.android.material:material:${Versions.materialDesign_version}"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val space_navigation_bar =
        "com.github.armcha:SpaceNavigationView:${Versions.space_navigation_bar}"

    //Test Dependencies
    const val jUnit = "junit:junit:${Versions.junit}"
    const val androidx_test = "androidx.test.ext:junit:${Versions.androidx_test}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"

    //network
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val retrofitConvertor =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"

    //DI   //koin
    const val koin = "org.koin:koin-android:${Versions.koinVersion}"
    const val koin_scope = "org.koin:koin-android-scope:${Versions.koinVersion}"
    const val koin_viewModel = "org.koin:koin-android-viewmodel:${Versions.koinVersion}"
    const val koin_java = "org.koin:koin-java:${Versions.koinVersion}"
    const val koin_ext = "org.koin:koin-android-ext:${Versions.koinVersion}"

    //coroutine
    const val coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.courotine}"
    const val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.courotine}"
}