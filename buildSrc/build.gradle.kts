plugins {
    `kotlin-dsl`
    `embedded-kotlin`
}

repositories {
    google()
    mavenCentral()
}

apply(from = "plugins.gradle.kts")

dependencies {
//    implementation(rootProject.extra["libDependency"].toString())
}
