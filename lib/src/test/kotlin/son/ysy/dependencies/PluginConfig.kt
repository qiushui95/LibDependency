package son.ysy.dependencies

sealed class PluginConfig(
    val group: String,
    val name: String,
    val version: String,
    val key: String
) {

    object Android : PluginConfig("com.android.tools.build", "gradle", "7.1.2", "androidPlugin")

    object Kotlin : PluginConfig(
        DependencyConfig.Group.Kotlin.Stdlib.group,
        "kotlin-gradle-plugin",
        DependencyConfig.Group.Kotlin.Stdlib.version,
        "kotlinPlugin"
    ) {
        object Android : LibPluginId("kotlin-android")

        object Reflect : LibPluginId("kotlin-reflect")

        object Kapt : LibPluginId("kotlin-kapt")

        object Ksp : LibPluginId("com.google.devtools.ksp", "1.6.10-1.0.4")
    }

    object Maven : PluginConfig(
        DependencyConfig.Single.MavenPublish.group,
        DependencyConfig.Single.MavenPublish.name,
        DependencyConfig.Single.MavenPublish.version,
        "mavenPlugin"
    ) {
        object Plugin : LibPluginId("com.vanniktech.maven.publish")
    }

    object Navigation : PluginConfig(
        DependencyConfig.Group.Navigation.Fragment.group,
        "navigation-safe-args-gradle-plugin",
        DependencyConfig.Group.Navigation.Fragment.version,
        "navigation"
    ) {
        object Plugin : LibPluginId("androidx.navigation.safeargs.kotlin")
    }

    object RocketX : PluginConfig(
        "io.github.trycatchx",
        "rocketx",
        "1.0.18",
        "rocketX"
    ){
        object Plugin : LibPluginId("com.rocketx")
    }

    sealed class Asm(name: String, key: String) : PluginConfig(
        "org.ow2.asm",
        name,
        "9.2",
        "asm.$key"
    ) {
        object Common : Asm("asm-commons", "common")
        object Util : Asm("asm-util", "util")
    }
}