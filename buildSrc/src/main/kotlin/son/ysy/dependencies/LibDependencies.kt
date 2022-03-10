package son.ysy.dependencies

import kotlin.String
import kotlin.Suppress

@Suppress("MemberVisibilityCanBePrivate","unused","RedundantVisibilityModifier")
sealed class LibDependencies(
  val group: String,
  val name: String,
  val version: String,
  val dependencyMethod: DependencyMethod
) {
  interface Single {
    /**
     * 阿里云存储
     * https://help.aliyun.com/document_detail/32043.html
     */
    object AliOss : LibDependencies("com.aliyun.dpa", "oss-android-sdk", "2.9.11",
        DependencyMethod.Implementation)

    /**
     * 阿里推送
     * https://help.aliyun.com/document_detail/190009.html?spm=a2c4g.11174283.3.2.52eb6d163QVxjG
     */
    object AliPush : LibDependencies("com.aliyun.ams", "alicloud-android-push", "3.7.4",
        DependencyMethod.Implementation)

    /**
     * 多功能工具包
     * https://github.com/Blankj/AndroidUtilCode
     */
    object AndroidUtil : LibDependencies("com.blankj", "utilcodex", "1.31.0",
        DependencyMethod.Implementation)

    /**
     * Annotation
     * https://developer.android.com/jetpack/androidx/releases/annotation
     */
    object Annotation : LibDependencies("androidx.annotation", "annotation", "1.3.0",
        DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/appcompat
     */
    object Appcompat : LibDependencies("androidx.appcompat", "appcompat", "1.4.1",
        DependencyMethod.Implementation)

    /**
     * 背景生成工具库
     * https://github.com/JavaNoober/BackgroundLibrary
     */
    object Background : LibDependencies("com.github.JavaNoober.BackgroundLibrary",
        "libraryx", "1.7.3", DependencyMethod.Implementation)

    /**
     * 弹窗
     * https://github.com/razerdp/BasePopup
     */
    object BasePopup : LibDependencies("io.github.razerdp", "BasePopup", "3.2.0",
        DependencyMethod.Implementation)

    /**
     * 颜色帮助库
     * https://github.com/JorgeCastilloPrz/AndroidColorX
     */
    object ColorKtx : LibDependencies("me.jorgecastillo", "androidcolorx", "0.2.0",
        DependencyMethod.Implementation)

    /**
     * 时间选择器
     * https://github.com/loperSeven/DateTimePicker
     */
    object DateTimePicker : LibDependencies("com.github.loperSeven", "DateTimePicker",
        "0.5.7", DependencyMethod.Implementation)

    /**
     * 悬浮窗
     * https://github.com/princekin-f/EasyFloat
     */
    object EasyFloat : LibDependencies("com.github.princekin-f", "EasyFloat", "2.0.4",
        DependencyMethod.Implementation)

    /**
     * 多媒体选择库
     * https://github.com/yangpeixing/YImagePicker
     */
    object ImagePicker : LibDependencies("com.ypx.yimagepicker", "androidx", "3.1.4",
        DependencyMethod.Implementation)

    /**
     * 时间处理库
     * https://github.com/JodaOrg/joda-time
     */
    object JodaTime : LibDependencies("joda-time", "joda-time", "2.10.13",
        DependencyMethod.Implementation)

    /**
     * 内存泄露监控
     * https://square.github.io/leakcanary/getting_started/
     */
    object LeakCanary : LibDependencies("com.squareup.leakcanary", "leakcanary-android",
        "2.8.1", DependencyMethod.Implementation)

    /**
     * 持久KV数据存储
     * https://github.com/Tencent/MMKV/blob/master/README_CN.md
     */
    object Mmkv : LibDependencies("com.tencent", "mmkv-static", "1.2.12",
        DependencyMethod.Implementation)

    /**
     * 权限请求
     * https://github.com/guolindev/PermissionX
     */
    object PermissionX : LibDependencies("com.guolindev.permissionx", "permissionx", "1.6.1",
        DependencyMethod.Implementation)

    /**
     * 分页请求
     * https://developer.android.com/jetpack/androidx/releases/paging
     */
    object Paging : LibDependencies("androidx.paging", "paging-runtime", "3.1.1",
        DependencyMethod.Implementation)

    /**
     * 二维码扫描
     * https://github.com/jenly1314/ZXingLite
     */
    object QrScanner : LibDependencies("com.github.jenly1314", "zxing-lite", "2.1.1",
        DependencyMethod.Implementation)

    /**
     * app启动初始化
     * https://github.com/qiushui95/AndroidInitializer
     */
    object Startup : LibDependencies("com.github.qiushui95", "AndroidInitializer", "1.0.8",
        DependencyMethod.Implementation)

    /**
     * 多数据源
     * https://github.com/dropbox/Store
     */
    object Store : LibDependencies("com.dropbox.mobile.store", "store4", "4.0.4-KT15",
        DependencyMethod.Implementation)

    /**
     * 微信开发Sdk
     * https://developers.weixin.qq.com/doc/oplatform/Mobile_App/Resource_Center_Homepage.html
     */
    object WeChat : LibDependencies("com.tencent.mm.opensdk",
        "wechat-sdk-android-without-mta", "6.8.0", DependencyMethod.Implementation)

    /**
     * 奔溃日志收集
     * https://github.com/iqiyi/xCrash/blob/master/README.zh-CN.md
     */
    object XCrash : LibDependencies("com.iqiyi.xcrash", "xcrash-android-lib", "3.1.0",
        DependencyMethod.Implementation)

    /**
     * AS OkHttp 拦截器
     * https://github.com/itkacher/OkHttpProfiler
     */
    object Profiler : LibDependencies("com.localebro", "okhttpprofiler", "1.0.8",
        DependencyMethod.Implementation)

    /**
     * Maven上传
     * https://github.com/vanniktech/gradle-maven-publish-plugin
     */
    object MavenPublish : LibDependencies("com.vanniktech", "gradle-maven-publish-plugin",
        "0.19.0", DependencyMethod.Implementation)

    /**
     * Json序列化
     * https://github.com/Kotlin/kotlinx.serialization
     */
    object Serialization : LibDependencies("org.jetbrains.kotlinx",
        "kotlinx-serialization-json", "1.3.2", DependencyMethod.Implementation)

    /**
     * zip压缩相关
     * https://github.com/srikanth-lingala/zip4j
     */
    object Zip4J : LibDependencies("net.lingala.zip4j", "zip4j", "2.9.1",
        DependencyMethod.Implementation)
  }

  interface View {
    /**
     * 浏览器
     * https://github.com/Justson/AgentWeb
     */
    object AgentWeb : LibDependencies("com.github.Justson.AgentWeb", "agentweb-core",
        "v4.1.9-androidx", DependencyMethod.Implementation)

    /**
     * 轮播控件
     * https://github.com/xiaohaibin/XBanner/tree/androidX
     */
    object BannerView : LibDependencies("com.github.xiaohaibin", "XBanner",
        "androidx_v1.2.8", DependencyMethod.Implementation)

    /**
     * 高斯模糊
     * https://github.com/Dimezis/BlurView
     */
    object BlurView : LibDependencies("com.eightbitlab", "blurview", "1.6.6",
        DependencyMethod.Implementation)

    /**
     * 底部导航
     * https://github.com/Ashok-Varma/BottomNavigation
     */
    object BottomNavigation : LibDependencies("com.ashokvarma.android",
        "bottom-navigation-bar", "2.2.0", DependencyMethod.Implementation)

    /**
     * 约束布局
     * https://developer.android.com/jetpack/androidx/releases/constraintlayout
     */
    object ConstraintLayout : LibDependencies("androidx.constraintlayout",
        "constraintlayout", "2.1.3", DependencyMethod.Implementation)

    /**
     * 圆角控件
     * https://github.com/csdn-mobile/RoundView
     */
    object CornerView : LibDependencies("io.github.csdn-mobile", "RoundView", "1.7.1",
        DependencyMethod.Implementation)

    /**
     * 流式布局
     * https://github.com/google/flexbox-layout
     */
    object FlexBox : LibDependencies("com.google.android.flexbox", "flexbox", "3.0.0",
        DependencyMethod.Implementation)

    /**
     * 输入格式化控件
     * https://github.com/dkzwm/FormatEditText
     */
    object FormatterEdit : LibDependencies("com.github.dkzwm", "fet-core", "0.2.1",
        DependencyMethod.Implementation)

    /**
     * 动画框架
     * https://github.com/airbnb/lottie-android
     */
    object LottieView : LibDependencies("com.airbnb.android", "lottie", "5.0.3",
        DependencyMethod.Implementation)

    /**
     * https://github.com/material-components/material-components-android
     */
    object Material : LibDependencies("com.google.android.material", "material", "1.5.0",
        DependencyMethod.Implementation)

    /**
     * pdf查看
     * https://github.com/barteksc/AndroidPdfViewer
     */
    object PdfViewer : LibDependencies("com.github.mhiew", "android-pdf-viewer",
        "3.2.0-beta.2", DependencyMethod.Implementation)

    /**
     * 图片预览
     * https://github.com/Baseflow/PhotoView
     */
    object PhotoView : LibDependencies("com.github.chrisbanes", "PhotoView", "2.3.0",
        DependencyMethod.Implementation)

    /**
     * 密码输入框
     * https://github.com/ChaosLeung/PinView
     */
    object PinView : LibDependencies("io.github.chaosleung", "pinview", "1.4.4",
        DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/recyclerview
     */
    object RecyclerView : LibDependencies("androidx.recyclerview", "recyclerview", "1.2.1",
        DependencyMethod.Implementation)

    /**
     * 下拉刷新控件
     * https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout
     */
    object SwipeRefreshLayout : LibDependencies("androidx.swiperefreshlayout",
        "swiperefreshlayout", "1.2.0-alpha01", DependencyMethod.Implementation)

    /**
     * 开关按钮
     * https://github.com/kyleduo/SwitchButton
     */
    object SwitchButton : LibDependencies("com.kyleduo.switchbutton", "library", "2.1.0",
        DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/viewpager2
     */
    object ViewPager2 : LibDependencies("androidx.viewpager2", "viewpager2", "1.1.0-beta01",
        DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/lifecycle
     */
    object ViewModel : LibDependencies("androidx.lifecycle", "lifecycle-viewmodel-compose",
        "2.4.1", DependencyMethod.Implementation)
  }

  interface Test {
    /**
     * UI自动化测试
     * https://mvnrepository.com/artifact/androidx.test.espresso/espresso-core
     */
    object Espresso : LibDependencies("androidx.test.espresso", "espresso-core", "3.4.0",
        DependencyMethod.AndroidTest.Implementation)

    /**
     * 单元测试
     * https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter
     */
    object Junit : LibDependencies("org.junit.jupiter", "junit-jupiter", "5.8.2",
        DependencyMethod.Test.Implementation)

    /**
     * 单元测试扩展
     * https://mvnrepository.com/artifact/androidx.test.ext/junit-ktx
     */
    object JunitExt : LibDependencies("androidx.test.ext", "junit-ktx", "1.1.3",
        DependencyMethod.Test.Implementation)
  }

  interface Compose {
    /**
     * Compose约束布局
     * https://developer.android.com/jetpack/androidx/releases/constraintlayout
     */
    object ConstraintLayout : LibDependencies("androidx.constraintlayout",
        "constraintlayout-compose", "1.0.0", DependencyMethod.Implementation)

    /**
     * Compose导航动画
     * https://github.com/fornewid/material-motion-compose
     */
    object NavigationAnimation : LibDependencies("com.github.fornewid",
        "material-motion-compose", "0.8.1", DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/lifecycle
     */
    object ViewModel : LibDependencies("androidx.lifecycle", "lifecycle-viewmodel-compose",
        "2.4.1", DependencyMethod.Implementation)

    /**
     * https://github.com/google/accompanist
     */
    interface Accompanist {
      object AppcompatTheme : LibDependencies("com.google.accompanist",
          "accompanist-appcompat-theme", "0.23.1", DependencyMethod.Implementation)

      object DrawablePainter : LibDependencies("com.google.accompanist",
          "accompanist-drawablepainter", "0.23.1", DependencyMethod.Implementation)

      object FlowLayout : LibDependencies("com.google.accompanist", "accompanist-flowlayout",
          "0.23.1", DependencyMethod.Implementation)

      object Insets : LibDependencies("com.google.accompanist", "accompanist-insets",
          "0.23.1", DependencyMethod.Implementation)

      object NavigationAnimation : LibDependencies("com.google.accompanist",
          "accompanist-navigation-animation", "0.23.1", DependencyMethod.Implementation)

      object NavigationMaterial : LibDependencies("com.google.accompanist",
          "accompanist-navigation-material", "0.23.1", DependencyMethod.Implementation)

      object Pager : LibDependencies("com.google.accompanist", "accompanist-pager", "0.23.1",
          DependencyMethod.Implementation)

      object Permissions : LibDependencies("com.google.accompanist",
          "accompanist-permissions", "0.23.1", DependencyMethod.Implementation)

      object PlaceHolder : LibDependencies("com.google.accompanist",
          "accompanist-placeholder", "0.23.1", DependencyMethod.Implementation)

      object PlaceHolderMaterial : LibDependencies("com.google.accompanist",
          "accompanist-placeholder-material", "0.23.1", DependencyMethod.Implementation)

      object SwipeRefresh : LibDependencies("com.google.accompanist",
          "accompanist-swiperefresh", "0.23.1", DependencyMethod.Implementation)

      object SystemUiController : LibDependencies("com.google.accompanist",
          "accompanist-systemuicontroller", "0.23.1", DependencyMethod.Implementation)
    }

    /**
     * Compose官方
     * https://developer.android.com/jetpack/androidx/releases/compose
     */
    interface Official {
      object Animation : LibDependencies("androidx.compose.animation", "animation", "1.1.1",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("androidx.compose.compiler", "compiler", "1.1.1",
          DependencyMethod.Implementation)

      object Foundation : LibDependencies("androidx.compose.foundation", "foundation",
          "1.1.1", DependencyMethod.Implementation)

      object LiveData : LibDependencies("androidx.compose.runtime", "runtime-livedata",
          "1.1.1", DependencyMethod.Implementation)

      object Material : LibDependencies("androidx.compose.material", "material", "1.1.1",
          DependencyMethod.Implementation)

      object MaterialIcon : LibDependencies("androidx.compose.material",
          "material-icons-core", "1.1.1", DependencyMethod.Implementation)

      object MaterialIconExtended : LibDependencies("androidx.compose.material",
          "material-icons-extended", "1.1.1", DependencyMethod.Implementation)

      object Preview : LibDependencies("androidx.compose.ui", "ui-tooling-preview", "1.1.1",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.compose.ui", "ui-test-junit4", "1.1.1",
          DependencyMethod.AndroidTest.Implementation)

      object Ui : LibDependencies("androidx.compose.ui", "ui", "1.1.1",
          DependencyMethod.Implementation)

      object UiTooling : LibDependencies("androidx.compose.ui", "ui-tooling", "1.1.1",
          DependencyMethod.Implementation)
    }
  }

  interface Group {
    /**
     * https://developer.android.com/jetpack/androidx/releases/activity
     */
    interface Activity {
      object Core : LibDependencies("androidx.activity", "activity-ktx", "1.4.0",
          DependencyMethod.Implementation)

      object Compose : LibDependencies("androidx.activity", "activity-compose", "1.4.0",
          DependencyMethod.Implementation)
    }

    /**
     * 相机相关
     * https://developer.android.com/jetpack/androidx/releases/camera
     */
    interface CameraX {
      object Camera2 : LibDependencies("androidx.camera", "camera-camera2", "1.1.0-beta02",
          DependencyMethod.Implementation)

      object Core : LibDependencies("androidx.camera", "camera-core", "1.1.0-beta02",
          DependencyMethod.Implementation)

      object Lifecycle : LibDependencies("androidx.camera", "camera-lifecycle",
          "1.1.0-beta02", DependencyMethod.Implementation)

      object Video : LibDependencies("androidx.camera", "camera-video", "1.1.0-beta02",
          DependencyMethod.Implementation)

      object View : LibDependencies("androidx.camera", "camera-view", "1.1.0-beta02",
          DependencyMethod.Implementation)

      object Extensions : LibDependencies("androidx.camera", "camera-extensions",
          "1.1.0-beta02", DependencyMethod.Implementation)
    }

    /**
     * 网络请求监控
     * https://github.com/ChuckerTeam/chucker
     */
    interface Chucker {
      object Debug : LibDependencies("com.github.chuckerteam.chucker", "library", "3.5.2",
          DependencyMethod.Debug.Implementation)

      object Release : LibDependencies("com.github.chuckerteam.chucker", "library-no-op",
          "3.5.2", DependencyMethod.Release.Implementation)
    }

    /**
     * 图片加载
     * https://coil-kt.github.io/coil/README-zh/
     */
    interface Coil {
      object Core : LibDependencies("io.coil-kt", "coil", "1.4.0",
          DependencyMethod.Implementation)

      object Compose : LibDependencies("io.coil-kt", "coil-compose", "1.4.0",
          DependencyMethod.Implementation)

      object Svg : LibDependencies("io.coil-kt", "coil-svg", "1.4.0",
          DependencyMethod.Implementation)

      object Gif : LibDependencies("io.coil-kt", "coil-gif", "1.4.0",
          DependencyMethod.Implementation)

      object Video : LibDependencies("io.coil-kt", "coil-video", "1.4.0",
          DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/core
     */
    interface Core {
      object Ktx : LibDependencies("androidx.core", "core-ktx", "1.7.0",
          DependencyMethod.Implementation)

      object Splash : LibDependencies("androidx.core", "core-splashscreen", "1.0.0-beta01",
          DependencyMethod.Implementation)
    }

    /**
     * 协程
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    interface Coroutines {
      object Core : LibDependencies("org.jetbrains.kotlinx", "kotlinx-coroutines-android",
          "1.6.0", DependencyMethod.Implementation)

      object Test : LibDependencies("org.jetbrains.kotlinx", "kotlinx-coroutines-test",
          "1.6.0", DependencyMethod.Test.Implementation)
    }

    /**
     * 下载
     * https://github.com/AriaLyy/Aria
     */
    interface Download {
      object Core : LibDependencies("me.laoyuyu.aria", "core", "3.8.16",
          DependencyMethod.Implementation)

      object Ftp : LibDependencies("me.laoyuyu.aria", "ftp", "3.8.16",
          DependencyMethod.Implementation)

      object Sftp : LibDependencies("me.laoyuyu.aria", "sftp", "3.8.16",
          DependencyMethod.Implementation)

      object M3u8 : LibDependencies("me.laoyuyu.aria", "m3u8", "3.8.16",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("me.laoyuyu.aria", "compiler", "3.8.16",
          DependencyMethod.Kapt)
    }

    /**
     * https://github.com/airbnb/epoxy
     */
    interface Epoxy {
      object Core : LibDependencies("com.airbnb.android", "epoxy", "5.0.0-beta05",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("com.airbnb.android", "epoxy-processor",
          "5.0.0-beta05", DependencyMethod.Ksp)

      object Compose : LibDependencies("com.airbnb.android", "epoxy-compose", "5.0.0-beta05",
          DependencyMethod.Implementation)

      object Glide : LibDependencies("com.airbnb.android", "epoxy-glide-preloading",
          "5.0.0-beta05", DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/fragment
     */
    interface Fragment {
      object Core : LibDependencies("androidx.fragment", "fragment-ktx", "1.4.1",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.fragment", "fragment-testing", "1.4.1",
          DependencyMethod.Test.Implementation)
    }

    /**
     * 依赖注入库
     * https://github.com/InsertKoinIO/koin
     */
    interface Koin {
      object Android : LibDependencies("io.insert-koin", "koin-android", "3.1.5",
          DependencyMethod.Implementation)

      object Core : LibDependencies("io.insert-koin", "koin-core", "3.1.5",
          DependencyMethod.Implementation)

      object WorkManager : LibDependencies("io.insert-koin", "koin-androidx-workmanager",
          "3.1.5", DependencyMethod.Implementation)

      object Test : LibDependencies("io.insert-koin", "koin-test-junit5", "3.1.5",
          DependencyMethod.Test.Implementation)
    }

    /**
     * https://github.com/JetBrains/kotlin
     */
    interface Kotlin {
      object Stdlib : LibDependencies("org.jetbrains.kotlin", "kotlin-stdlib", "1.6.10",
          DependencyMethod.Implementation)

      object Reflect : LibDependencies("org.jetbrains.kotlin", "kotlin-reflect", "1.6.10",
          DependencyMethod.Implementation)

      object Plugin : LibDependencies("org.jetbrains.kotlin", "kotlin-gradle-plugin",
          "1.6.10", DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/lifecycle
     */
    interface Lifecycle {
      object Common : LibDependencies("androidx.lifecycle", "lifecycle-common", "2.4.1",
          DependencyMethod.Implementation)

      object LiveData : LibDependencies("androidx.lifecycle", "lifecycle-livedata-ktx",
          "2.4.1", DependencyMethod.Implementation)

      object Process : LibDependencies("androidx.lifecycle", "lifecycle-process", "2.4.1",
          DependencyMethod.Implementation)

      object Runtime : LibDependencies("androidx.lifecycle", "lifecycle-runtime-ktx",
          "2.4.1", DependencyMethod.Implementation)

      object SavedState : LibDependencies("androidx.lifecycle",
          "lifecycle-viewmodel-savedstate", "2.4.1", DependencyMethod.Implementation)

      object Service : LibDependencies("androidx.lifecycle", "lifecycle-service", "2.4.1",
          DependencyMethod.Implementation)

      object ViewModel : LibDependencies("androidx.lifecycle", "lifecycle-viewmodel-ktx",
          "2.4.1", DependencyMethod.Implementation)
    }

    /**
     * Mavericks架构
     * https://github.com/airbnb/mavericks
     */
    interface Mavericks {
      object Core : LibDependencies("com.airbnb.android", "mavericks", "2.6.1",
          DependencyMethod.Implementation)

      object Compose : LibDependencies("com.airbnb.android", "mavericks-compose", "2.6.1",
          DependencyMethod.Implementation)

      object Navigation : LibDependencies("com.airbnb.android", "mavericks-navigation",
          "2.6.1", DependencyMethod.Implementation)
    }

    /**
     * json解析库
     * https://github.com/square/moshi
     */
    interface MoShi {
      object Core : LibDependencies("com.squareup.moshi", "moshi", "1.13.0",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("com.squareup.moshi", "moshi-kotlin-codegen",
          "1.13.0", DependencyMethod.Ksp)
    }

    /**
     * 导航库
     * https://developer.android.com/jetpack/androidx/releases/navigation
     */
    interface Navigation {
      object Fragment : LibDependencies("androidx.navigation", "navigation-fragment-ktx",
          "2.4.1", DependencyMethod.Implementation)

      object Ui : LibDependencies("androidx.navigation", "navigation-ui-ktx", "2.4.1",
          DependencyMethod.Implementation)

      object Compose : LibDependencies("androidx.navigation", "navigation-compose", "2.4.1",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.navigation", "navigation-testing", "2.4.1",
          DependencyMethod.Test.Implementation)
    }

    /**
     * https://github.com/square/okhttp
     */
    interface OkHttp {
      object Core : LibDependencies("com.squareup.okhttp3", "okhttp", "4.9.3",
          DependencyMethod.Implementation)

      object Mock : LibDependencies("com.squareup.okhttp3", "mockwebserver", "4.9.3",
          DependencyMethod.AndroidTest.Implementation)
    }

    /**
     * 网络请求
     * https://github.com/square/retrofit
     */
    interface Retrofit {
      object Core : LibDependencies("com.squareup.retrofit2", "retrofit", "2.9.0",
          DependencyMethod.Implementation)

      object MoShi : LibDependencies("com.squareup.retrofit2", "converter-moshi", "2.9.0",
          DependencyMethod.Implementation)

      object Scalars : LibDependencies("com.squareup.retrofit2", "converter-scalars",
          "2.9.0", DependencyMethod.Implementation)
    }

    /**
     * Sqlite数据库
     * https://developer.android.com/jetpack/androidx/releases/room
     */
    interface Room {
      object Core : LibDependencies("androidx.room", "room-runtime", "2.4.2",
          DependencyMethod.Implementation)

      object Ktx : LibDependencies("androidx.room", "room-ktx", "2.4.2",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("androidx.room", "room-compiler", "2.4.2",
          DependencyMethod.Kapt)

      object Test : LibDependencies("androidx.room", "room-testing", "2.4.2",
          DependencyMethod.Test.Implementation)
    }

    /**
     * 图片裁剪器
     * https://github.com/wasabeef/transformers
     */
    interface Transformer {
      object Coil : LibDependencies("jp.wasabeef.transformers", "coil", "1.0.5",
          DependencyMethod.Implementation)

      object CoilGpu : LibDependencies("jp.wasabeef.transformers", "coil-gpu", "1.0.5",
          DependencyMethod.Implementation)

      object Glide : LibDependencies("jp.wasabeef.transformers", "glide", "1.0.5",
          DependencyMethod.Implementation)

      object GlideGpu : LibDependencies("jp.wasabeef.transformers", "glide-gpu", "1.0.5",
          DependencyMethod.Implementation)
    }

    /**
     * 任务管理器
     * https://developer.android.com/jetpack/androidx/releases/work
     */
    interface WorkManager {
      object Core : LibDependencies("androidx.work", "work-runtime-ktx", "2.7.1",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.work", "work-testing", "2.7.1",
          DependencyMethod.Test.Implementation)
    }
  }
}
