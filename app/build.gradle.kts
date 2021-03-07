plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

apply(from = "$rootDir/buildSrc/android-base.kts")

android {

    defaultConfig { applicationId = "com.learning.pokemon.showcase" }
}

dependencies {

    implementation(Libraries.Kotlin.stdLib)
    implementation(project(":modules:design"))
    implementation(project(":modules:network"))
    implementation(project(":features:landing"))

    implementation(Libraries.Externals.dagger)
    kapt(Libraries.Externals.daggerCompiler)
    implementation(Libraries.Externals.hilt)
    kapt(Libraries.Externals.hiltCompiler)
}
