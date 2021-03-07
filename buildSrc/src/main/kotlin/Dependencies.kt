const val kotlin = "1.4.30"

object Build {

    private object Versions {
        const val buildTools = "4.0.0"
    }

    const val androidGradle = "com.android.tools.build:gradle:${Versions.buildTools}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin"

}

object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = compile
}

object Plugins {
    object Versions {
        const val ktlint = "9.4.1"
        const val hilt = "2.33-beta"
    }

    const val ktlintName = "org.jlleitschuh.gradle.ktlint"
    const val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object Libraries {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin"
    }

    object Android {
        private object Versions {
            const val material = "1.3.0"
            const val appcompat = "1.2.0"
            const val constraintLayout = "2.0.4"
        }

        const val material = "com.google.android.material:material:${Versions.material}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Externals {

        private object Versions {
            const val dagger = "2.25.3"
            // Networking
            const val retrofit = "2.7.2"
        }

        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val hilt = "com.google.dagger:hilt-android:${Plugins.Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Plugins.Versions.hilt}"


        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

    }

}

