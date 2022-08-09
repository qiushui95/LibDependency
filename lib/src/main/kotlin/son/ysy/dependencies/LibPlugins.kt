package son.ysy.dependencies

import kotlin.String
import kotlin.Suppress

@Suppress("MemberVisibilityCanBePrivate","unused","RedundantVisibilityModifier")
sealed class LibPlugins(
  val group: String,
  val name: String,
  val version: String
) {
  object Android : LibPlugins("com.android.tools.build", "gradle", "7.2.2")

  object Kotlin : LibPlugins("org.jetbrains.kotlin", "kotlin-gradle-plugin", "1.6.21") {
    object Android : LibPluginId("kotlin-android")

    object Kapt : LibPluginId("kotlin-kapt")

    object Ksp : LibPluginId("com.google.devtools.ksp", "1.6.21-1.0.6")

    object Reflect : LibPluginId("kotlin-reflect")
  }

  object Maven : LibPlugins("com.vanniktech", "gradle-maven-publish-plugin", "0.21.0") {
    object Plugin : LibPluginId("com.vanniktech.maven.publish")
  }

  object Navigation : LibPlugins("androidx.navigation", "navigation-safe-args-gradle-plugin",
      "2.5.1") {
    object Plugin : LibPluginId("androidx.navigation.safeargs.kotlin")
  }

  object RocketX : LibPlugins("io.github.trycatchx", "rocketx", "1.1.1") {
    object Plugin : LibPluginId("com.rocketx")
  }

  object VasDolly : LibPlugins("com.tencent.vasdolly", "plugin", "3.0.4") {
    object Plugin : LibPluginId("com.tencent.vasdolly")
  }
}
