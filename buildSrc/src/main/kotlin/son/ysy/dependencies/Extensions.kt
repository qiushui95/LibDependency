@file:Suppress("NOTHING_TO_INLINE")

package son.ysy.dependencies

import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

val Project.minSdk: Int
    get() = intProperty("minSdk")

val Project.targetSdk: Int
    get() = intProperty("targetSdk")

val Project.compileSdk: Int
    get() = intProperty("compileSdk")

val Project.groupId: String
    get() = stringProperty("GROUP")

val Project.versionName: String
    get() = stringProperty("VERSION_NAME")

val Project.versionCode: Int
    get() = intProperty("VERSION_CODE")

private fun Project.stringProperty(name: String): String {
    return property(name) as String
}

private fun Project.intProperty(name: String): Int {
    return stringProperty(name).toInt()
}

internal fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? {
    return add("implementation", dependencyNotation)
}

internal fun DependencyHandler.api(dependencyNotation: Any): Dependency? {
    return add("api", dependencyNotation)
}

internal fun DependencyHandler.compileOnly(dependencyNotation: Any): Dependency? {
    return add("compileOnly", dependencyNotation)
}

internal fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? {
    return add("testImplementation", dependencyNotation)
}

internal fun DependencyHandler.androidTestImplementation(dependencyNotation: Any): Dependency? {
    return add("androidTestImplementation", dependencyNotation)
}
