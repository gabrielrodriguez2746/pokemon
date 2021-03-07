import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

fun DependencyHandler.api(depName: String) {
    add("api", depName)
}

