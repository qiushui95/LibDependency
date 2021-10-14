plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

apply(from = "plugins.gradle.kts")

dependencies {
    implementation(rootProject.extra["androidPlugin"].toString())
}
