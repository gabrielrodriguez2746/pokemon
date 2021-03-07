plugins {
    id("java-library")
    kotlin("jvm")
    kotlin("kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(Libraries.Kotlin.stdLib)
    
    implementation(Libraries.Externals.retrofit)

    implementation(Libraries.Externals.dagger)
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    kapt(Libraries.Externals.daggerCompiler)
}