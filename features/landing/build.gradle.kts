plugins {
    id("com.android.library")
    kotlin("android")
}

apply(from = "$rootDir/buildSrc/android-base.kts")

dependencies {

    implementation(Libraries.Kotlin.stdLib)
    implementation(project(":modules:design"))

    implementation(Libraries.Android.appcompat)
    implementation(Libraries.Android.constraintLayout)

}