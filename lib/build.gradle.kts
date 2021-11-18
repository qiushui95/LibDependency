import gradle.build.dependency
import son.ysy.dependencies.LibDependencies

plugins {
    id("kotlin")
    id("com.vanniktech.maven.publish")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    dependency(LibDependencies.Test.Junit)
    dependency(LibDependencies.Group.Kotlin.Reflect)
    testImplementation("com.squareup:kotlinpoet:1.10.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}