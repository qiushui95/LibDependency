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
    object AliOss : LibDependencies("com.aliyun.dpa", "oss-android-sdk", "2.9.12",
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
    object Annotation : LibDependencies("androidx.annotation", "annotation", "1.4.0",
        DependencyMethod.Implementation)

    /**
     * https://developer.android.com/jetpack/androidx/releases/appcompat
     */
    object Appcompat : LibDependencies("androidx.appcompat", "appcompat", "1.5.1",
        DependencyMethod.Implementation)

    /**
     * 背景生成工具库
     * https://github.com/JavaNoober/BackgroundLibrary
     */
    object Background : LibDependencies("com.github.JavaNoober.BackgroundLibrary",
        "libraryx", "1.7.5", DependencyMethod.Implementation)

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
     * 图片压缩库
     * https://github.com/zetbaitsu/Compressor
     */
    object Compressor : LibDependencies("id.zelory", "compressor", "3.0.1",
        DependencyMethod.Implementation)

    /**
     * 时间选择器
     * https://github.com/loperSeven/DateTimePicker
     */
    object DateTimePicker : LibDependencies("com.github.loperSeven", "DateTimePicker",
        "0.5.8", DependencyMethod.Implementation)

    /**
     * 悬浮窗
     * https://github.com/princekin-f/EasyFloat
     */
    object EasyFloat : LibDependencies("com.github.princekin-f", "EasyFloat", "2.0.4",
        DependencyMethod.Implementation)

    /**
     * 图片信息
     * https://developer.android.com/jetpack/androidx/releases/exifinterface
     */
    object Exif : LibDependencies("androidx.exifinterface", "exifinterface", "1.3.3",
        DependencyMethod.Implementation)

    /**
     * Flow扩展
     * https://github.com/hoc081098/FlowExt
     */
    object FlowExt : LibDependencies("io.github.hoc081098", "FlowExt-jvm", "0.4.0",
        DependencyMethod.Implementation)

    /**
     * 多媒体选择库
     * https://github.com/yangpeixing/YImagePicker
     */
    object ImagePicker : LibDependencies("com.ypx.yimagepicker", "androidx", "3.1.4",
        DependencyMethod.Implementation)

    /**
     * 图片预览框架
     * https://github.com/iielse/imageviewer
     */
    object ImageWatcher : LibDependencies("com.github.iielse", "imageviewer", "2.1.19",
        DependencyMethod.Implementation)

    /**
     * 时间处理库
     * https://github.com/JodaOrg/joda-time
     */
    object JodaTime : LibDependencies("joda-time", "joda-time", "2.11.1",
        DependencyMethod.Implementation)

    /**
     * 内存泄露监控
     * https://square.github.io/leakcanary/getting_started/
     */
    object LeakCanary : LibDependencies("com.squareup.leakcanary", "leakcanary-android",
        "2.9.1", DependencyMethod.Implementation)

    /**
     * Maven上传
     * https://github.com/vanniktech/gradle-maven-publish-plugin
     */
    object MavenPublish : LibDependencies("com.vanniktech", "gradle-maven-publish-plugin",
        "0.21.0", DependencyMethod.Implementation)

    /**
     * 持久KV数据存储
     * https://github.com/Tencent/MMKV/blob/master/README_CN.md
     */
    object Mmkv : LibDependencies("com.tencent", "mmkv-static", "1.2.14",
        DependencyMethod.Implementation)

    /**
     * 分页请求
     * https://developer.android.com/jetpack/androidx/releases/paging
     */
    object Paging : LibDependencies("androidx.paging", "paging-runtime-ktx", "3.1.1",
        DependencyMethod.Implementation)

    /**
     * 聊天键盘优化
     * https://github.com/DSAppTeam/PanelSwitchHelper
     */
    object PanelSwitch : LibDependencies("com.github.DSAppTeam", "PanelSwitchHelper",
        "v1.5.0", DependencyMethod.Implementation)

    /**
     * 权限请求
     * https://github.com/guolindev/PermissionX
     */
    object PermissionX : LibDependencies("com.guolindev.permissionx", "permissionx", "1.6.4",
        DependencyMethod.Implementation)

    /**
     * AS OkHttp 拦截器
     * https://github.com/itkacher/OkHttpProfiler
     */
    object Profiler : LibDependencies("com.localebro", "okhttpprofiler", "1.0.8",
        DependencyMethod.Implementation)

    /**
     * 二维码扫描
     * https://github.com/jenly1314/ZXingLite
     */
    object QrScanner : LibDependencies("com.github.jenly1314", "zxing-lite", "2.2.1",
        DependencyMethod.Implementation)

    /**
     * Json序列化
     * https://github.com/Kotlin/kotlinx.serialization
     */
    object Serialization : LibDependencies("org.jetbrains.kotlinx",
        "kotlinx-serialization-json", "1.4.0", DependencyMethod.Implementation)

    /**
     * app启动初始化
     * https://github.com/qiushui95/AndroidInitializer
     */
    object Startup : LibDependencies("com.github.qiushui95", "AndroidInitializer", "1.0.9",
        DependencyMethod.Implementation)

    /**
     * 多数据源
     * https://github.com/dropbox/Store
     */
    object Store : LibDependencies("com.dropbox.mobile.store", "store4", "4.0.5",
        DependencyMethod.Implementation)

    /**
     * 多渠道打包
     * https://github.com/Tencent/VasDolly
     */
    object VasDolly : LibDependencies("com.tencent.vasdolly", "helper", "3.0.4",
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
     * 弹窗
     * https://github.com/li-xiaojun/XPopup
     */
    object XPopup : LibDependencies("com.github.li-xiaojun", "XPopup", "2.9.0",
        DependencyMethod.Implementation)

    /**
     * zip压缩相关
     * https://github.com/srikanth-lingala/zip4j
     */
    object Zip4J : LibDependencies("net.lingala.zip4j", "zip4j", "2.11.1",
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
    object BlurView : LibDependencies("com.github.Dimezis", "BlurView", "version-2.0.0",
        DependencyMethod.Implementation)

    /**
     * 底部导航
     * https://github.com/Ashok-Varma/BottomNavigation
     */
    object BottomNavigation : LibDependencies("com.ashokvarma.android",
        "bottom-navigation-bar", "2.2.0", DependencyMethod.Implementation)

    /**
     * 底部导航
     * https://github.com/tyzlmjj/PagerBottomTabStrip
     */
    object BottomTab : LibDependencies("me.majiajie", "pager-bottom-tab-strip", "2.4.0",
        DependencyMethod.Implementation)

    /**
     * 约束布局
     * https://developer.android.com/jetpack/androidx/releases/constraintlayout
     */
    object ConstraintLayout : LibDependencies("androidx.constraintlayout",
        "constraintlayout", "2.1.4", DependencyMethod.Implementation)

    /**
     * 圆角控件
     * https://github.com/csdn-mobile/RoundView
     */
    object CornerView : LibDependencies("io.github.csdn-mobile", "RoundView", "1.8.0",
        DependencyMethod.Implementation)

    /**
     * 指示器控件
     * https://github.com/tommybuonomo/dotsindicator
     */
    object DotsIndicator : LibDependencies("com.tbuonomo", "dotsindicator", "4.3",
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
    object LottieView : LibDependencies("com.airbnb.android", "lottie", "5.2.0",
        DependencyMethod.Implementation)

    /**
     * https://github.com/material-components/material-components-android
     */
    object Material : LibDependencies("com.google.android.material", "material", "1.6.1",
        DependencyMethod.Implementation)

    /**
     * pdf查看
     * https://github.com/barteksc/AndroidPdfViewer
     */
    object PdfViewer : LibDependencies("com.github.mhiew", "android-pdf-viewer",
        "3.2.0-beta.3", DependencyMethod.Implementation)

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
     * RecyclerView分割线
     * https://github.com/fondesa/recycler-view-divider
     */
    object RecyclerViewDivider : LibDependencies("com.github.fondesa",
        "recycler-view-divider", "3.5.0", DependencyMethod.Implementation)

    /**
     * RecyclerView分割线
     * https://github.com/rubensousa/GravitySnapHelper
     */
    object RecyclerViewSnap : LibDependencies("com.github.rubensousa", "gravitysnaphelper",
        "2.2.2", DependencyMethod.Implementation)

    /**
     * 嵌套滑动组件
     * https://github.com/donkingliang/ConsecutiveScroller
     */
    object ScrollContainer : LibDependencies("com.github.donkingliang",
        "ConsecutiveScroller", "4.6.3", DependencyMethod.Implementation)

    /**
     * 下拉刷新控件
     * https://github.com/scwang90/SmartRefreshLayout
     */
    interface SmartRefreshLayout {
      object ClassicsFooter : LibDependencies("io.github.scwang90",
          "refresh-footer-classics", "2.0.5", DependencyMethod.Implementation)

      object ClassicsHeader : LibDependencies("io.github.scwang90",
          "refresh-header-classics", "2.0.5", DependencyMethod.Implementation)

      object Core : LibDependencies("io.github.scwang90", "refresh-layout-kernel", "2.0.5",
          DependencyMethod.Implementation)

      object TwoLevelHeader : LibDependencies("io.github.scwang90",
          "refresh-header-two-level", "2.0.5", DependencyMethod.Implementation)
    }

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
     * https://github.com/angcyo/DslTabLayout
     */
    interface TabLayout {
      object Core : LibDependencies("com.github.angcyo.DslTablayout", "TabLayout", "3.2.4",
          DependencyMethod.Implementation)

      object VP2 : LibDependencies("com.github.angcyo.DslTablayout", "ViewPager2Delegate",
          "3.2.4", DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/viewpager2
     */
    object ViewPager2 : LibDependencies("androidx.viewpager2", "viewpager2", "1.1.0-beta01",
        DependencyMethod.Implementation)
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
    object Junit : LibDependencies("org.junit.jupiter", "junit-jupiter", "5.9.0",
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
     * https://github.com/google/accompanist
     */
    interface Accompanist {
      object AppcompatTheme : LibDependencies("com.google.accompanist",
          "accompanist-appcompat-theme", "0.25.1", DependencyMethod.Implementation)

      object DrawablePainter : LibDependencies("com.google.accompanist",
          "accompanist-drawablepainter", "0.25.1", DependencyMethod.Implementation)

      object FlowLayout : LibDependencies("com.google.accompanist", "accompanist-flowlayout",
          "0.25.1", DependencyMethod.Implementation)

      object Insets : LibDependencies("com.google.accompanist", "accompanist-insets",
          "0.25.1", DependencyMethod.Implementation)

      object NavigationAnimation : LibDependencies("com.google.accompanist",
          "accompanist-navigation-animation", "0.25.1", DependencyMethod.Implementation)

      object NavigationMaterial : LibDependencies("com.google.accompanist",
          "accompanist-navigation-material", "0.25.1", DependencyMethod.Implementation)

      object Pager : LibDependencies("com.google.accompanist", "accompanist-pager", "0.25.1",
          DependencyMethod.Implementation)

      object Permissions : LibDependencies("com.google.accompanist",
          "accompanist-permissions", "0.25.1", DependencyMethod.Implementation)

      object PlaceHolder : LibDependencies("com.google.accompanist",
          "accompanist-placeholder", "0.25.1", DependencyMethod.Implementation)

      object PlaceHolderMaterial : LibDependencies("com.google.accompanist",
          "accompanist-placeholder-material", "0.25.1", DependencyMethod.Implementation)

      object SwipeRefresh : LibDependencies("com.google.accompanist",
          "accompanist-swiperefresh", "0.25.1", DependencyMethod.Implementation)

      object SystemUiController : LibDependencies("com.google.accompanist",
          "accompanist-systemuicontroller", "0.25.1", DependencyMethod.Implementation)
    }

    /**
     * Compose约束布局
     * https://developer.android.com/jetpack/androidx/releases/constraintlayout
     */
    object ConstraintLayout : LibDependencies("androidx.constraintlayout",
        "constraintlayout-compose", "1.0.1", DependencyMethod.Implementation)

    /**
     * Compose导航动画
     * https://github.com/fornewid/material-motion-compose
     */
    object NavigationAnimation : LibDependencies("com.github.fornewid",
        "material-motion-compose", "0.8.1", DependencyMethod.Implementation)

    /**
     * Compose官方
     * https://developer.android.com/jetpack/androidx/releases/compose
     */
    interface Official {
      object Animation : LibDependencies("androidx.compose.animation", "animation", "1.2.1",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("androidx.compose.compiler", "compiler", "1.3.1",
          DependencyMethod.Implementation)

      object Foundation : LibDependencies("androidx.compose.foundation", "foundation",
          "1.2.1", DependencyMethod.Implementation)

      object LiveData : LibDependencies("androidx.compose.runtime", "runtime-livedata",
          "1.2.1", DependencyMethod.Implementation)

      object Material : LibDependencies("androidx.compose.material", "material", "1.2.1",
          DependencyMethod.Implementation)

      object MaterialIcon : LibDependencies("androidx.compose.material",
          "material-icons-core", "1.2.1", DependencyMethod.Implementation)

      object MaterialIconExtended : LibDependencies("androidx.compose.material",
          "material-icons-extended", "1.2.1", DependencyMethod.Implementation)

      object Preview : LibDependencies("androidx.compose.ui", "ui-tooling-preview", "1.2.1",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.compose.ui", "ui-test-junit4", "1.2.1",
          DependencyMethod.AndroidTest.Implementation)

      object Ui : LibDependencies("androidx.compose.ui", "ui", "1.2.1",
          DependencyMethod.Implementation)

      object UiTooling : LibDependencies("androidx.compose.ui", "ui-tooling", "1.2.1",
          DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/lifecycle
     */
    object ViewModel : LibDependencies("androidx.lifecycle", "lifecycle-viewmodel-compose",
        "2.5.1", DependencyMethod.Implementation)
  }

  interface Group {
    /**
     * https://developer.android.com/jetpack/androidx/releases/activity
     */
    interface Activity {
      object Compose : LibDependencies("androidx.activity", "activity-compose", "1.5.1",
          DependencyMethod.Implementation)

      object Core : LibDependencies("androidx.activity", "activity-ktx", "1.5.1",
          DependencyMethod.Implementation)
    }

    /**
     * https://bugly.qq.com/docs/user-guide/instruction-manual-android/?v=1.0.0
     */
    interface Bugly {
      object Crash : LibDependencies("com.tencent.bugly", "crashreport", "4.1.9",
          DependencyMethod.Implementation)

      object Upgrade : LibDependencies("com.tencent.bugly", "crashreport_upgrade", "1.6.1",
          DependencyMethod.Implementation)
    }

    /**
     * 相机相关
     * https://developer.android.com/jetpack/androidx/releases/camera
     */
    interface CameraX {
      object Camera2 : LibDependencies("androidx.camera", "camera-camera2", "1.1.0",
          DependencyMethod.Implementation)

      object Core : LibDependencies("androidx.camera", "camera-core", "1.1.0",
          DependencyMethod.Implementation)

      object Extensions : LibDependencies("androidx.camera", "camera-extensions", "1.1.0",
          DependencyMethod.Implementation)

      object Lifecycle : LibDependencies("androidx.camera", "camera-lifecycle", "1.1.0",
          DependencyMethod.Implementation)

      object Video : LibDependencies("androidx.camera", "camera-video", "1.1.0",
          DependencyMethod.Implementation)

      object View : LibDependencies("androidx.camera", "camera-view", "1.1.0",
          DependencyMethod.Implementation)
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
     * https://developer.android.com/jetpack/androidx/releases/core
     */
    interface Core {
      object Ktx : LibDependencies("androidx.core", "core-ktx", "1.9.0",
          DependencyMethod.Implementation)

      object Splash : LibDependencies("androidx.core", "core-splashscreen", "1.0.0",
          DependencyMethod.Implementation)
    }

    /**
     * 协程
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    interface Coroutines {
      object Core : LibDependencies("org.jetbrains.kotlinx", "kotlinx-coroutines-android",
          "1.6.4", DependencyMethod.Implementation)

      object Test : LibDependencies("org.jetbrains.kotlinx", "kotlinx-coroutines-test",
          "1.6.4", DependencyMethod.Test.Implementation)
    }

    /**
     * 下载
     * https://github.com/AriaLyy/Aria
     */
    interface Download {
      object Compiler : LibDependencies("me.laoyuyu.aria", "compiler", "3.8.16",
          DependencyMethod.Kapt)

      object Core : LibDependencies("me.laoyuyu.aria", "core", "3.8.16",
          DependencyMethod.Implementation)

      object Ftp : LibDependencies("me.laoyuyu.aria", "ftp", "3.8.16",
          DependencyMethod.Implementation)

      object M3u8 : LibDependencies("me.laoyuyu.aria", "m3u8", "3.8.16",
          DependencyMethod.Implementation)

      object Sftp : LibDependencies("me.laoyuyu.aria", "sftp", "3.8.16",
          DependencyMethod.Implementation)
    }

    /**
     * https://github.com/airbnb/epoxy
     */
    interface Epoxy {
      object Compiler : LibDependencies("com.airbnb.android", "epoxy-processor",
          "5.0.0-beta05", DependencyMethod.Kapt)

      object Compose : LibDependencies("com.airbnb.android", "epoxy-compose", "5.0.0-beta05",
          DependencyMethod.Implementation)

      object Core : LibDependencies("com.airbnb.android", "epoxy", "5.0.0-beta05",
          DependencyMethod.Implementation)

      object Glide : LibDependencies("com.airbnb.android", "epoxy-glide-preloading",
          "5.0.0-beta05", DependencyMethod.Implementation)
    }

    /**
     * 下载框架
     * https://github.com/tonyofrancis/Fetch
     */
    interface Fetch {
      object Core : LibDependencies("androidx.tonyodev.fetch2", "xfetch2", "3.1.6",
          DependencyMethod.Implementation)

      object OkHttp : LibDependencies("androidx.tonyodev.fetch2okhttp", "xfetch2okhttp",
          "3.1.6", DependencyMethod.Implementation)
    }

    /**
     * FlowBinding
     * https://github.com/ReactiveCircus/FlowBinding
     */
    interface FlowBinding {
      object Activity : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-activity", "1.2.0", DependencyMethod.Implementation)

      object Android : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-android", "1.2.0", DependencyMethod.Implementation)

      object AppCompat : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-appcompat", "1.2.0", DependencyMethod.Implementation)

      object Core : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-core", "1.2.0", DependencyMethod.Implementation)

      object DrawerLayout : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-drawerlayout", "1.2.0", DependencyMethod.Implementation)

      object Lifecycle : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-lifecycle", "1.2.0", DependencyMethod.Implementation)

      object Material : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-material", "1.2.0", DependencyMethod.Implementation)

      object Navigation : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-navigation", "1.2.0", DependencyMethod.Implementation)

      object Preference : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-preference", "1.2.0", DependencyMethod.Implementation)

      object RecyclerView : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-recyclerview", "1.2.0", DependencyMethod.Implementation)

      object SwipeRefreshLayout : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-swiperefreshlayout", "1.2.0", DependencyMethod.Implementation)

      object ViewPager : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-viewpager", "1.2.0", DependencyMethod.Implementation)

      object ViewPager2 : LibDependencies("io.github.reactivecircus.flowbinding",
          "flowbinding-viewpager2", "1.2.0", DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/fragment
     */
    interface Fragment {
      object Core : LibDependencies("androidx.fragment", "fragment-ktx", "1.5.2",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.fragment", "fragment-testing", "1.5.2",
          DependencyMethod.Test.Implementation)
    }

    /**
     * 图片加载
     * https://github.com/bumptech/glide
     */
    interface Glide {
      object Compiler : LibDependencies("com.github.bumptech.glide", "compiler", "4.13.2",
          DependencyMethod.Kapt)

      object Core : LibDependencies("com.github.bumptech.glide", "glide", "4.13.2",
          DependencyMethod.Implementation)

      object OkHttp : LibDependencies("com.github.bumptech.glide", "okhttp3-integration",
          "4.13.2", DependencyMethod.Implementation)
    }

    /**
     * 状态栏
     * https://github.com/gyf-dev/ImmersionBar
     */
    interface ImmersionBar {
      object Core : LibDependencies("com.geyifeng.immersionbar", "immersionbar", "3.2.2",
          DependencyMethod.Implementation)

      object Ktx : LibDependencies("com.geyifeng.immersionbar", "immersionbar-ktx", "3.2.2",
          DependencyMethod.Implementation)
    }

    /**
     * 依赖注入库
     * https://github.com/InsertKoinIO/koin
     */
    interface Koin {
      object Android : LibDependencies("io.insert-koin", "koin-android", "3.2.0",
          DependencyMethod.Implementation)

      object Annotations : LibDependencies("io.insert-koin", "koin-annotations", "1.0.1",
          DependencyMethod.Implementation)

      object Compiler : LibDependencies("io.insert-koin", "koin-ksp-compiler", "1.0.1",
          DependencyMethod.Implementation)

      object Compose : LibDependencies("io.insert-koin", "koin-androidx-compose", "3.2.0",
          DependencyMethod.Implementation)

      object Core : LibDependencies("io.insert-koin", "koin-core", "3.2.0",
          DependencyMethod.Implementation)

      object Navigation : LibDependencies("io.insert-koin", "koin-androidx-navigation",
          "3.2.0", DependencyMethod.Implementation)

      object Test : LibDependencies("io.insert-koin", "koin-test-junit5", "3.2.0",
          DependencyMethod.Test.Implementation)

      object WorkManager : LibDependencies("io.insert-koin", "koin-androidx-workmanager",
          "3.2.0", DependencyMethod.Implementation)
    }

    /**
     * https://github.com/JetBrains/kotlin
     */
    interface Kotlin {
      object Plugin : LibDependencies("org.jetbrains.kotlin", "kotlin-gradle-plugin",
          "1.7.10", DependencyMethod.Implementation)

      object Reflect : LibDependencies("org.jetbrains.kotlin", "kotlin-reflect", "1.7.10",
          DependencyMethod.Implementation)

      object Stdlib : LibDependencies("org.jetbrains.kotlin", "kotlin-stdlib", "1.7.10",
          DependencyMethod.Implementation)
    }

    /**
     * https://developer.android.com/jetpack/androidx/releases/lifecycle
     */
    interface Lifecycle {
      object Common : LibDependencies("androidx.lifecycle", "lifecycle-common", "2.5.1",
          DependencyMethod.Implementation)

      object LiveData : LibDependencies("androidx.lifecycle", "lifecycle-livedata-ktx",
          "2.5.1", DependencyMethod.Implementation)

      object Process : LibDependencies("androidx.lifecycle", "lifecycle-process", "2.5.1",
          DependencyMethod.Implementation)

      object Runtime : LibDependencies("androidx.lifecycle", "lifecycle-runtime-ktx",
          "2.5.1", DependencyMethod.Implementation)

      object SavedState : LibDependencies("androidx.lifecycle",
          "lifecycle-viewmodel-savedstate", "2.5.1", DependencyMethod.Implementation)

      object Service : LibDependencies("androidx.lifecycle", "lifecycle-service", "2.5.1",
          DependencyMethod.Implementation)

      object ViewModel : LibDependencies("androidx.lifecycle", "lifecycle-viewmodel-ktx",
          "2.5.1", DependencyMethod.Implementation)
    }

    /**
     * Mavericks架构
     * https://github.com/airbnb/mavericks
     */
    interface Mavericks {
      object Compose : LibDependencies("com.airbnb.android", "mavericks-compose", "2.7.0",
          DependencyMethod.Implementation)

      object Core : LibDependencies("com.airbnb.android", "mavericks", "2.7.0",
          DependencyMethod.Implementation)

      object Navigation : LibDependencies("com.airbnb.android", "mavericks-navigation",
          "2.7.0", DependencyMethod.Implementation)
    }

    /**
     * json解析库
     * https://github.com/square/moshi
     */
    interface MoShi {
      object Compiler : LibDependencies("com.squareup.moshi", "moshi-kotlin-codegen",
          "1.14.0", DependencyMethod.Kapt)

      object Core : LibDependencies("com.squareup.moshi", "moshi", "1.14.0",
          DependencyMethod.Implementation)
    }

    /**
     * 导航库
     * https://developer.android.com/jetpack/androidx/releases/navigation
     */
    interface Navigation {
      object Compose : LibDependencies("androidx.navigation", "navigation-compose", "2.5.2",
          DependencyMethod.Implementation)

      object Fragment : LibDependencies("androidx.navigation", "navigation-fragment-ktx",
          "2.5.2", DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.navigation", "navigation-testing", "2.5.2",
          DependencyMethod.Test.Implementation)

      object Ui : LibDependencies("androidx.navigation", "navigation-ui-ktx", "2.5.2",
          DependencyMethod.Implementation)
    }

    /**
     * https://github.com/lingochamp/okdownload
     */
    interface OkDownload {
      object Core : LibDependencies("com.liulishuo.okdownload", "okdownload", "1.0.7",
          DependencyMethod.Implementation)

      object FileDownloader : LibDependencies("com.liulishuo.okdownload", "filedownloader",
          "1.0.7", DependencyMethod.Implementation)

      object Ktx : LibDependencies("com.liulishuo.okdownload", "ktx", "1.0.7",
          DependencyMethod.Implementation)

      object OkHttp : LibDependencies("com.liulishuo.okdownload", "okhttp", "1.0.7",
          DependencyMethod.Implementation)

      object Sqlite : LibDependencies("com.liulishuo.okdownload", "sqlite", "1.0.7",
          DependencyMethod.Implementation)
    }

    /**
     * https://github.com/square/okhttp
     */
    interface OkHttp {
      object Core : LibDependencies("com.squareup.okhttp3", "okhttp", "4.10.0",
          DependencyMethod.Implementation)

      object Logging : LibDependencies("com.squareup.okhttp3", "logging-interceptor",
          "4.10.0", DependencyMethod.Implementation)

      object Mock : LibDependencies("com.squareup.okhttp3", "mockwebserver", "4.10.0",
          DependencyMethod.AndroidTest.Implementation)
    }

    /**
     * https://github.com/airbnb/paris
     */
    interface Paris {
      object Compiler : LibDependencies("com.airbnb.android", "paris-processor", "2.0.1",
          DependencyMethod.Kapt)

      object Core : LibDependencies("com.airbnb.android", "paris", "2.0.1",
          DependencyMethod.Implementation)
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
      object Compiler : LibDependencies("androidx.room", "room-compiler", "2.4.3",
          DependencyMethod.Kapt)

      object Core : LibDependencies("androidx.room", "room-runtime", "2.4.3",
          DependencyMethod.Implementation)

      object Ktx : LibDependencies("androidx.room", "room-ktx", "2.4.3",
          DependencyMethod.Implementation)

      object Test : LibDependencies("androidx.room", "room-testing", "2.4.3",
          DependencyMethod.Test.Implementation)
    }

    /**
     * 亚马逊云存储
     * https://github.com/aws-amplify/aws-sdk-android
     */
    interface S3 {
      object Client : LibDependencies("com.amazonaws", "aws-android-sdk-mobile-client",
          "2.50.1", DependencyMethod.Implementation)

      object Core : LibDependencies("com.amazonaws", "aws-android-sdk-s3", "2.50.1",
          DependencyMethod.Implementation)
    }

    /**
     * 调试工具
     * https://github.com/facebook/stetho
     */
    interface Stetho {
      object Core : LibDependencies("com.facebook.stetho", "stetho", "1.6.0",
          DependencyMethod.Implementation)

      object OkHttp : LibDependencies("com.facebook.stetho", "stetho-okhttp3", "1.6.0",
          DependencyMethod.Implementation)
    }

    /**
     * 图片裁剪器
     * https://github.com/wasabeef/transformers
     */
    interface Transformer {
      object Coil : LibDependencies("jp.wasabeef.transformers", "coil", "1.0.6",
          DependencyMethod.Implementation)

      object CoilGpu : LibDependencies("jp.wasabeef.transformers", "coil-gpu", "1.0.6",
          DependencyMethod.Implementation)

      object Core : LibDependencies("jp.wasabeef.transformers", "core", "1.0.6",
          DependencyMethod.Implementation)

      object Glide : LibDependencies("jp.wasabeef.transformers", "glide", "1.0.6",
          DependencyMethod.Implementation)

      object GlideGpu : LibDependencies("jp.wasabeef.transformers", "glide-gpu", "1.0.6",
          DependencyMethod.Implementation)
    }

    /**
     * 友盟
     * https://developer.umeng.com/docs/119267/detail/118584
     */
    interface UMeng {
      object Asms : LibDependencies("com.umeng.umsdk", "asms", "1.6.3",
          DependencyMethod.Implementation)

      object Common : LibDependencies("com.umeng.umsdk", "common", "9.5.2",
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
