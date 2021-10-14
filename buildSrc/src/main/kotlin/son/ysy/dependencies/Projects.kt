package son.ysy

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import son.ysy.dependencies.*
import java.io.File

fun Project.setupLibraryModule(block: LibraryExtension.() -> Unit = {}) {
    setupBaseModule<LibraryExtension> {

        block()
    }
}

private const val signConfigName = "signConfig"


fun Project.setupAppModule(
    keyAlias: String,
    keyPassword: String,
    storePassword: String,
    keyFile: File,
    block: BaseAppModuleExtension.() -> Unit = {}
) {
    setupBaseModule<BaseAppModuleExtension> {
        defaultConfig {
            versionCode = project.versionCode
            versionName = project.versionName
            vectorDrawables.useSupportLibrary = true
        }

        signingConfigs {
            create(signConfigName) {
                this.keyAlias = keyAlias
                this.keyPassword = keyPassword
                this.storeFile = keyFile
                this.storePassword = storePassword
            }
        }

        buildTypes {
            debug {
                isMinifyEnabled = false
                signingConfig = signingConfigs.getByName(signConfigName)
            }
            release {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
                signingConfig = signingConfigs.getByName(signConfigName)
            }
        }

        block()
    }
}

private inline fun <reified T : BaseExtension> Project.setupBaseModule(crossinline block: T.() -> Unit = {}) {
    extensions.configure<BaseExtension>("android") {
        compileSdkVersion(project.compileSdk)
        defaultConfig {
            minSdk = project.minSdk
            targetSdk = project.targetSdk
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

            consumerProguardFiles("consumer-rules.pro")
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
        packagingOptions {
            resources.pickFirsts += "META-INF/AL2.0"
            resources.pickFirsts += "META-INF/LGPL2.1"
            resources.pickFirsts += "META-INF/*kotlin_module"
        }
        (this as T).block()
    }
}
