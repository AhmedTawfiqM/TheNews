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
}