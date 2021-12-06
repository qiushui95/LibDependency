import gradle.build.dependency
import org.jetbrains.kotlin.konan.properties.Properties
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

task("updateVersion") {
    doFirst {
        val properties = Properties()

        val file = file("version.properties")

        properties.load(file.inputStream())

        val oldVersionName = properties["VERSION_NAME"]?.toString() ?: "1.0.0"

        val newVersion = oldVersionName.split(".")
            .map { it.toInt() }
            .run {
                "${get(0)}.${get(1)}.${get(2) + 1}"
            }

        properties["VERSION_NAME"] = newVersion

        properties.store(file.writer(), null)
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