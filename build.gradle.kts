// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    apply(from = "buildSrc/plugins.gradle.kts")

    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    dependencies {

        classpath(rootProject.extra["androidPlugin"].toString())
        classpath(rootProject.extra["kotlinPlugin"].toString())
        classpath(rootProject.extra["mavenPlugin"].toString())
        classpath(rootProject.extra["asm.common"].toString())
        classpath(rootProject.extra["asm.util"].toString())
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.aliyun.com/repository/public")
        jcenter()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}