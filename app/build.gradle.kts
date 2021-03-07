plugins {
    id("com.android.application")
    kotlin("android")
}

apply(from = "$rootDir/buildSrc/android-base.kts")

android {

    defaultConfig { applicationId = "com.learning.pokemon.showcase" }
}

dependencies {

    implementation(Libraries.Kotlin.stdLib)
    implementation(project(":modules:design"))

}
