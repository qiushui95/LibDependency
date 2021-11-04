package son.ysy.dependencies

sealed class PluginConfig(
    val group: String,
    val name: String,
    val version: String,
    val key: String
) {

    object Android : PluginConfig("com.android.tools.build", "gradle", "7.0.3", "androidPlugin")

    object Kotlin : PluginConfig(
        DependencyConfig.Group.Kotlin.Stdlib.group,
        "kotlin-gradle-plugin",
        DependencyConfig.Group.Kotlin.Stdlib.version,
        "kotlinPlugin"
    ) {
        object Android : LibPluginId("kotlin-android")

        object Reflect : LibPluginId("kotlin-reflect")

        object Kapt : LibPluginId("kotlin-kapt")
    }

    object Maven : PluginConfig(
        DependencyConfig.Single.MavenPublish.group,
        DependencyConfig.Single.MavenPublish.name,
        DependencyConfig.Single.MavenPublish.version,
        "mavenPlugin"
    ) {
        object Plugin : LibPluginId("com.vanniktech.maven.publish")
    }

    object Navigation: PluginConfig(
        DependencyConfig.Group.Navigation.Fragment.group,
        "navigation-safe-args-gradle-plugin",
        DependencyConfig.Group.Navigation.Fragment.version,
        "navigation"
    ){
        object Plugin : LibPluginId("androidx.navigation.safeargs.kotlin")
    }
}