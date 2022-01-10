package son.ysy.dependencies

@Suppress("unused")
sealed class DependencyConfig(
    val group: String,
    val name: String,
    val version: String,
    val remark: String,
    val link: String,
    val dependencyMethod: DependencyMethod,
    val sort: Int = 0,
) {

    override fun toString(): String {
        return "son.ysy.dependencies.DependencyConfig( group='$group', name='$name', version='$version', remark='$remark', link='$link', dependencyMethod=$dependencyMethod, sort=$sort)"
    }

    private fun getKDoc(remark: String?, link: String?) = listOf(remark, link)
        .mapNotNull { it }
        .joinToString("\n")
        .ifBlank { null }

    //region Single
    interface Single {
        //region AliOss(阿里云存储)
        object AliOss : DependencyConfig(
            group = "com.aliyun.dpa",
            name = "oss-android-sdk",
            version = "2.9.11",
            remark = "阿里云存储",
            link = "https://help.aliyun.com/document_detail/32043.html",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region AliPush(阿里推送)
        object AliPush : DependencyConfig(
            group = "com.aliyun.ams",
            name = "alicloud-android-push",
            version = "3.7.2",
            remark = "阿里推送",
            link = "https://help.aliyun.com/document_detail/190009.html?spm=a2c4g.11174283.3.2.52eb6d163QVxjG",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region AndroidUtil(多功能工具包)
        object AndroidUtil : DependencyConfig(
            group = "com.blankj",
            name = "utilcodex",
            version = "1.31.0",
            remark = "多功能工具包",
            link = "https://github.com/Blankj/AndroidUtilCode",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Annotation
        object Annotation : DependencyConfig(
            group = "androidx.annotation",
            name = "annotation",
            version = "1.3.0",
            remark = "Annotation",
            link = "https://developer.android.com/jetpack/androidx/releases/annotation",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Appcompat
        object Appcompat : DependencyConfig(
            group = "androidx.appcompat",
            name = "appcompat",
            version = "1.4.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/appcompat",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Background(背景生成工具库)
        object Background : DependencyConfig(
            group = "com.github.JavaNoober.BackgroundLibrary",
            name = "libraryx",
            version = "1.7.3",
            remark = "背景生成工具库",
            link = "https://github.com/JavaNoober/BackgroundLibrary",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BasePopup(弹窗)
        object BasePopup : DependencyConfig(
            group = "io.github.razerdp",
            name = "BasePopup",
            version = "3.2.0",
            remark = "弹窗",
            link = "https://github.com/razerdp/BasePopup",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ColorKtx(颜色帮助库)
        object ColorKtx : DependencyConfig(
            group = "me.jorgecastillo",
            name = "androidcolorx",
            version = "0.2.0",
            remark = "颜色帮助库",
            link = "https://github.com/JorgeCastilloPrz/AndroidColorX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region DateTimePicker(时间选择器)
        object DateTimePicker : DependencyConfig(
            group = "com.github.loperSeven",
            name = "DateTimePicker",
            version = "0.5.2",
            remark = "时间选择器",
            link = "https://github.com/loperSeven/DateTimePicker",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region EasyFloat(悬浮窗)
        object EasyFloat : DependencyConfig(
            group = "com.github.princekin-f",
            name = "EasyFloat",
            version = "2.0.4",
            remark = "悬浮窗",
            link = "https://github.com/princekin-f/EasyFloat",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ImagePicker(多媒体选择库)
        object ImagePicker : DependencyConfig(
            group = "com.ypx.yimagepicker",
            name = "androidx",
            version = "3.1.4",
            remark = "多媒体选择库",
            link = "https://github.com/yangpeixing/YImagePicker",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region JodaTime(时间处理库)
        object JodaTime : DependencyConfig(
            group = "joda-time",
            name = "joda-time",
            version = "2.10.13",
            remark = "时间处理库",
            link = "https://github.com/JodaOrg/joda-time",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region LeakCanary(内存泄露监控)
        object LeakCanary : DependencyConfig(
            group = "com.squareup.leakcanary",
            name = "leakcanary-android",
            version = "2.8.1",
            remark = "内存泄露监控",
            link = "https://square.github.io/leakcanary/getting_started/",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Mmkv(持久KV数据存储)
        object Mmkv : DependencyConfig(
            group = "com.tencent",
            name = "mmkv-static",
            version = "1.2.11",
            remark = "持久KV数据存储",
            link = "https://github.com/Tencent/MMKV/blob/master/README_CN.md",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PermissionX(权限请求)
        object PermissionX : DependencyConfig(
            group = "com.guolindev.permissionx",
            name = "permissionx",
            version = "1.6.1",
            remark = "权限请求",
            link = "https://github.com/guolindev/PermissionX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region QrScanner(二维码扫描)
        object QrScanner : DependencyConfig(
            group = "com.github.jenly1314",
            name = "zxing-lite",
            version = "2.1.1",
            remark = "二维码扫描",
            link = "https://github.com/jenly1314/ZXingLite",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Startup(app启动初始化)
        object Startup : DependencyConfig(
            group = "com.github.qiushui95",
            name = "AndroidInitializer",
            version = "1.0.7",
            remark = "app启动初始化",
            link = "https://github.com/qiushui95/AndroidInitializer",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Store(多数据源)
        object Store : DependencyConfig(
            group = "com.dropbox.mobile.store",
            name = "store4",
            version = "4.0.3-KT15",
            remark = "多数据源",
            link = "https://github.com/dropbox/Store",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region WeChat(微信开发Sdk)
        object WeChat : DependencyConfig(
            group = "com.tencent.mm.opensdk",
            name = "wechat-sdk-android-without-mta",
            version = "6.8.0",
            remark = "微信开发Sdk",
            link = "https://developers.weixin.qq.com/doc/oplatform/Mobile_App/Resource_Center_Homepage.html",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region XCrash(奔溃日志收集)
        object XCrash : DependencyConfig(
            group = "com.iqiyi.xcrash",
            name = "xcrash-android-lib",
            version = "3.0.0",
            remark = "奔溃日志收集",
            link = "https://github.com/iqiyi/xCrash/blob/master/README.zh-CN.md",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Profiler(AS OkHttp 拦截器)
        object Profiler : DependencyConfig(
            group = "com.localebro",
            name = "okhttpprofiler",
            version = "1.0.8",
            remark = "AS OkHttp 拦截器",
            link = "https://github.com/itkacher/OkHttpProfiler",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region MavenPublish(Maven上传)
        object MavenPublish : DependencyConfig(
            group = "com.vanniktech",
            name = "gradle-maven-publish-plugin",
            version = "0.18.0",
            remark = "Maven上传",
            link = "https://github.com/vanniktech/gradle-maven-publish-plugin",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            const val PLUGIN_ID = "com.vanniktech.maven.publish"
        }

        //endregion
        //region Json序列化
        object Serialization : DependencyConfig(
            group = "org.jetbrains.kotlinx",
            name = "kotlinx-serialization-json",
            version = "1.3.2",
            remark = "Json序列化",
            link = "https://github.com/Kotlin/kotlinx.serialization",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            const val PLUGIN_ID = "plugin.serialization"
        }
        //endregion
    }

    //endregion
    //region View
    interface View {
        //region AgentWeb(浏览器)
        object AgentWeb : DependencyConfig(
            group = "com.github.Justson.AgentWeb",
            name = "agentweb-core",
            version = "v4.1.9-androidx",
            remark = "浏览器",
            link = "https://github.com/Justson/AgentWeb",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BannerView(轮播控件)
        object BannerView : DependencyConfig(
            group = "com.github.xiaohaibin",
            name = "XBanner",
            version = "androidx_v1.2.1",
            remark = "轮播控件",
            link = "https://github.com/xiaohaibin/XBanner/tree/androidX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BlurView(高斯模糊)
        object BlurView : DependencyConfig(
            group = "com.eightbitlab",
            name = "blurview",
            version = "1.6.6",
            remark = "高斯模糊",
            link = "https://github.com/Dimezis/BlurView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BottomNavigation(底部导航)
        object BottomNavigation : DependencyConfig(
            group = "com.ashokvarma.android",
            name = "bottom-navigation-bar",
            version = "2.2.0",
            remark = "底部导航",
            link = "https://github.com/Ashok-Varma/BottomNavigation",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ConstraintLayout(约束布局)
        object ConstraintLayout : DependencyConfig(
            group = "androidx.constraintlayout",
            name = "constraintlayout",
            version = "2.1.2",
            remark = "约束布局",
            link = "https://developer.android.com/jetpack/androidx/releases/constraintlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region CornerView(圆角控件)
        object CornerView : DependencyConfig(
            group = "io.github.csdn-mobile",
            name = "RoundView",
            version = "1.7.1",
            remark = "圆角控件",
            link = "https://github.com/csdn-mobile/RoundView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region FlexBox(流式布局)
        object FlexBox : DependencyConfig(
            group = "com.google.android.flexbox",
            name = "flexbox",
            version = "3.0.0",
            remark = "流式布局",
            link = "https://github.com/google/flexbox-layout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region FormatterEdit(输入格式化控件)
        object FormatterEdit : DependencyConfig(
            group = "com.github.dkzwm",
            name = "fet-core",
            version = "0.2.1",
            remark = "输入格式化控件",
            link = "https://github.com/dkzwm/FormatEditText",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region LottieView(动画框架)
        object LottieView : DependencyConfig(
            group = "com.airbnb.android",
            name = "lottie",
            version = "4.2.2",
            remark = "动画框架",
            link = "https://github.com/airbnb/lottie-android",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Material
        object Material : DependencyConfig(
            group = "com.google.android.material",
            name = "material",
            version = "1.4.0",
            remark = "",
            link = "https://github.com/material-components/material-components-android",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PdfViewer(pdf查看)
        object PdfViewer : DependencyConfig(
            group = "com.github.barteksc",
            name = "android-pdf-viewer",
            version = "3.2.0-beta.1",
            remark = "pdf查看",
            link = "https://github.com/barteksc/AndroidPdfViewer",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PhotoView(图片预览)
        object PhotoView : DependencyConfig(
            group = "com.github.chrisbanes",
            name = "PhotoView",
            version = "2.3.0",
            remark = "图片预览",
            link = "https://github.com/Baseflow/PhotoView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PinView(密码输入框)
        object PinView : DependencyConfig(
            group = "io.github.chaosleung",
            name = "pinview",
            version = "1.4.4",
            remark = "密码输入框",
            link = "https://github.com/ChaosLeung/PinView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region RecyclerView
        object RecyclerView : DependencyConfig(
            group = "androidx.recyclerview",
            name = "recyclerview",
            version = "1.2.1",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/recyclerview",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region SwipeRefreshLayout(下拉刷新控件)
        object SwipeRefreshLayout : DependencyConfig(
            group = "androidx.swiperefreshlayout",
            name = "swiperefreshlayout",
            version = "1.2.0-alpha01",
            remark = "下拉刷新控件",
            link = "https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region SwitchButton(开关按钮)
        object SwitchButton : DependencyConfig(
            group = "com.kyleduo.switchbutton",
            name = "library",
            version = "2.1.0",
            remark = "开关按钮",
            link = "https://github.com/kyleduo/SwitchButton",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ViewPager2
        object ViewPager2 : DependencyConfig(
            group = "androidx.viewpager2",
            name = "viewpager2",
            version = "1.1.0-beta01",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/viewpager2",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region WebX5(X5浏览器)
        object WebX5 : DependencyConfig(
            group = "com.tencent.tbs",
            name = "tbssdk",
            version = "44136",
            remark = "X5浏览器",
            link = "https://x5.tencent.com/docs/access.html",
            dependencyMethod = DependencyMethod.Implementation,
        )
        //endregion
    }

    //endregion
    //region Test
    interface Test {
        //region Espresso(UI自动化测试)
        object Espresso : DependencyConfig(
            group = "androidx.test.espresso",
            name = "espresso-core",
            version = "3.4.0",
            remark = "UI自动化测试",
            link = "https://mvnrepository.com/artifact/androidx.test.espresso/espresso-core",
            dependencyMethod = DependencyMethod.AndroidTest.Implementation,
        )

        //endregion
        //region Junit(单元测试)
        object Junit : DependencyConfig(
            group = "org.junit.jupiter",
            name = "junit-jupiter",
            version = "5.8.2",
            remark = "单元测试",
            link = "https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter",
            dependencyMethod = DependencyMethod.Test.Implementation,
        )

        //endregion
        //region JunitExt(单元测试扩展)
        object JunitExt : DependencyConfig(
            group = "androidx.test.ext",
            name = "junit-ktx",
            version = "1.1.3",
            remark = "单元测试扩展",
            link = "https://mvnrepository.com/artifact/androidx.test.ext/junit-ktx",
            dependencyMethod = DependencyMethod.Test.Implementation,
        )
        //endregion
    }

    //endregion
    //region Compose
    interface Compose {
        //region Accompanist
        sealed class Accompanist(name: String) : DependencyConfig(
            group = "com.google.accompanist",
            name = name,
            version = "0.22.0-rc",
            remark = "",
            link = "https://github.com/google/accompanist",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object AppcompatTheme : Accompanist("accompanist-appcompat-theme")
            object DrawablePainter : Accompanist("accompanist-drawablepainter")
            object FlowLayout : Accompanist("accompanist-flowlayout")
            object Insets : Accompanist("accompanist-insets")
            object NavigationAnimation : Accompanist("accompanist-navigation-animation")
            object NavigationMaterial : Accompanist("accompanist-navigation-material")
            object Pager : Accompanist("accompanist-pager")
            object Permissions : Accompanist("accompanist-permissions")
            object PlaceHolder : Accompanist("accompanist-placeholder")
            object PlaceHolderMaterial : Accompanist("accompanist-placeholder-material")
            object SwipeRefresh : Accompanist("accompanist-swiperefresh")
            object SystemUiController : Accompanist("accompanist-systemuicontroller")
        }

        //endregion
        //region ConstraintLayout
        object ConstraintLayout : DependencyConfig(
            group = "androidx.constraintlayout",
            name = "constraintlayout-compose",
            version = "1.0.0-rc02",
            remark = "Compose约束布局",
            link = "https://developer.android.com/jetpack/androidx/releases/constraintlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region NavigationAnimation
        object NavigationAnimation : DependencyConfig(
            group = "com.github.fornewid",
            name = "material-motion-compose",
            version = "0.7.7",
            remark = "Compose导航动画",
            link = "https://github.com/fornewid/material-motion-compose",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Official
        sealed class Official(
            group: String,
            name: String,
            version: String = "1.1.0-rc01",
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = group,
            name = name,
            version = version,
            remark = "Compose官方",
            link = "https://developer.android.com/jetpack/androidx/releases/compose",
            dependencyMethod = dependencyMethod,
        ) {
            //region Animation
            object Animation : Official(group = "androidx.compose.animation", name = "animation")
            //endregion

            //region Compiler
            object Compiler : Official(
                group = "androidx.compose.compiler",
                name = "compiler",
                version = "1.1.0-rc02"
            )
            //endregion

            //region Foundation
            object Foundation : Official(group = "androidx.compose.foundation", name = "foundation")
            //endregion

            //region LiveData
            object LiveData :
                Official(group = "androidx.compose.runtime", name = "runtime-livedata")
            //endregion

            //region Material
            object Material : Official(group = "androidx.compose.material", name = "material")
            //endregion

            //region MaterialIcon
            object MaterialIcon :
                Official(group = "androidx.compose.material", name = "material-icons-core")
            //endregion

            //region MaterialIconExtended
            object MaterialIconExtended :
                Official(group = "androidx.compose.material", name = "material-icons-extended")
            //endregion

            //region Preview
            object Preview : Official(group = "androidx.compose.ui", name = "ui-tooling-preview")
            //endregion

            //region Test
            object Test : Official(
                group = "androidx.compose.ui",
                name = "ui-test-junit4",
                dependencyMethod = DependencyMethod.AndroidTest.Implementation
            )
            //endregion

            //region Ui
            object Ui : Official(group = "androidx.compose.ui", name = "ui")
            //endregion

            //region UiTooling
            object UiTooling : Official(group = "androidx.compose.ui", name = "ui-tooling")
            //endregion
        }

        //endregion
        //region ViewModel
        object ViewModel : DependencyConfig(
            group = "androidx.lifecycle",
            name = "lifecycle-viewmodel-compose",
            version = Group.Lifecycle.ViewModel.version,
            remark = "",
            link = Group.Lifecycle.ViewModel.link,
            dependencyMethod = DependencyMethod.Implementation,
        )
        //endregion
    }

    //endregion
    //region Group
    interface Group {
        //region Activity
        sealed class Activity(name: String) : DependencyConfig(
            group = "androidx.activity",
            name = name,
            version = "1.4.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/activity",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : Activity("activity-ktx")
            object Compose : Activity("activity-compose")
        }

        //endregion
        //region CameraX(相机相关)
        sealed class CameraX(name: String, version: Version) : DependencyConfig(
            group = "androidx.camera",
            name = name,
            version = version.version,
            remark = "相机相关",
            link = "https://developer.android.com/jetpack/androidx/releases/camera",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            sealed class Version(val version: String) {
                object Core : Version("1.1.0-alpha12")
                object Extends : Version("1.0.0-alpha32")
            }

            object Camera2 : CameraX("camera-camera2", Version.Core)
            object Core : CameraX("camera-core", Version.Core)
            object Lifecycle : CameraX("camera-lifecycle", Version.Core)
            object Video : CameraX("camera-video", Version.Core)
            object View : CameraX("camera-view", Version.Extends)
            object Extensions : CameraX("camera-extensions", Version.Extends)
        }

        //endregion
        //region Chucker(网络请求监控)
        sealed class Chucker(name: String, dependencyMethod: DependencyMethod) : DependencyConfig(
            group = "com.github.chuckerteam.chucker",
            name = name,
            version = "3.5.2",
            remark = "网络请求监控",
            link = "https://github.com/ChuckerTeam/chucker",
            dependencyMethod = dependencyMethod,
        ) {
            object Debug : Chucker("library", DependencyMethod.Debug.Implementation)
            object Release : Chucker("library-no-op", DependencyMethod.Release.Implementation)
        }

        //endregion
        //region Coil(图片加载)
        sealed class Coil(name: String) : DependencyConfig(
            group = "io.coil-kt",
            name = name,
            version = "1.4.0",
            remark = "图片加载",
            link = "https://coil-kt.github.io/coil/README-zh/",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : Coil("coil")
            object Compose : Coil("coil-compose")
            object Svg : Coil("coil-svg")
            object Gif : Coil("coil-gif")
            object Video : Coil("coil-video")
        }

        //endregion
        //region Core
        sealed class Core(name: String, version: String) : DependencyConfig(
            group = "androidx.core",
            name = name,
            version = version,
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/core",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Ktx : Core("core-ktx", "1.7.0")
            object Splash : Core("core-splashscreen", "1.0.0-alpha02")
        }

        //endregion
        //region Coroutines(协程)
        sealed class Coroutines(name: String, dependencyMethod: DependencyMethod) :
            DependencyConfig(
                group = "org.jetbrains.kotlinx",
                name = name,
                version = "1.6.0",
                remark = "core",
                link = "https://github.com/Kotlin/kotlinx.coroutines",
                dependencyMethod = dependencyMethod,
            ) {
            object Core : Coroutines("kotlinx-coroutines-android", DependencyMethod.Implementation)
            object Test :
                Coroutines("kotlinx-coroutines-test", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Epoxy(RecyclerView适配库)
        sealed class Epoxy(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "com.airbnb.android",
            name = name,
            version = "5.0.0-beta05",
            remark = "core",
            link = "https://github.com/airbnb/epoxy",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Epoxy("epoxy")
            object Compiler : Epoxy("epoxy-processor", DependencyMethod.Ksp)
            object Compose : Epoxy("epoxy-compose")
            object Glide : Epoxy("epoxy-glide-preloading")
        }

        //endregion
        //region Fragment
        sealed class Fragment(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "androidx.fragment",
            name = name,
            version = "1.4.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/fragment",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Fragment("fragment-ktx")
            object Test : Fragment("fragment-testing", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Koin(依赖注入库)
        sealed class Koin(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "io.insert-koin",
            name = name,
            version = "3.1.5",
            remark = "依赖注入库",
            link = "https://github.com/InsertKoinIO/koin",
            dependencyMethod = dependencyMethod,
        ) {
            object Android : Koin("koin-android")
            object Core : Koin("koin-core")
            object WorkManager : Koin("koin-androidx-workmanager")
            object Test : Koin("koin-test-junit5", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Kotlin
        sealed class Kotlin(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "org.jetbrains.kotlin",
            name = name,
            version = "1.6.10",
            remark = "",
            link = "https://github.com/JetBrains/kotlin",
            dependencyMethod = dependencyMethod,
        ) {
            object Stdlib : Kotlin("kotlin-stdlib")
            object Reflect : Kotlin("kotlin-reflect")
            object Plugin : Kotlin("kotlin-gradle-plugin")
        }

        //endregion
        //region Lifecycle
        sealed class Lifecycle(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "androidx.lifecycle",
            name = name,
            version = "2.4.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/lifecycle",
            dependencyMethod = dependencyMethod,
        ) {
            object Common : Lifecycle("lifecycle-common")
            object LiveData : Lifecycle("lifecycle-livedata-ktx")
            object Process : Lifecycle("lifecycle-process")
            object Runtime : Lifecycle("lifecycle-runtime-ktx")
            object SavedState : Lifecycle("lifecycle-viewmodel-savedstate")
            object Service : Lifecycle("lifecycle-service")
            object ViewModel : Lifecycle("lifecycle-viewmodel-ktx")
        }

        //endregion
        //region MoShi(json解析库)
        sealed class MoShi(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "com.squareup.moshi",
            name = name,
            version = "1.13.0",
            remark = "json解析库",
            link = "https://github.com/square/moshi",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : MoShi("moshi")
            object Compiler : MoShi("moshi-kotlin-codegen", DependencyMethod.Ksp)
        }

        //endregion
        //region OkHttp
        sealed class OkHttp(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "com.squareup.okhttp3",
            name = name,
            version = "4.9.3",
            remark = "",
            link = "https://github.com/square/okhttp",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : OkHttp("okhttp")
            object Mock : OkHttp("mockwebserver", DependencyMethod.AndroidTest.Implementation)
        }

        //endregion
        //region Retrofit(网络请求)
        sealed class Retrofit(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "com.squareup.retrofit2",
            name = name,
            version = "2.9.0",
            remark = "网络请求",
            link = "https://github.com/square/retrofit",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Retrofit("retrofit")
            object MoShi : Retrofit("converter-moshi")
            object Scalars : Retrofit("converter-scalars")
        }

        //endregion
        //region Room(Sqlite数据库)
        sealed class Room(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "androidx.room",
            name = name,
            version = "2.4.0",
            remark = "Sqlite数据库",
            link = "https://developer.android.com/jetpack/androidx/releases/room",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Room("room-runtime")
            object Ktx : Room("room-ktx")
            object Compiler : Room("room-compiler", DependencyMethod.Kapt)
            object Test : Room("room-testing", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region WorkManager(任务管理器)
        sealed class WorkManager(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "androidx.work",
            name = name,
            version = "2.7.1",
            remark = "任务管理器",
            link = "https://developer.android.com/jetpack/androidx/releases/work",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : WorkManager("work-runtime-ktx")
            object Test : WorkManager("work-testing", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Navigation(导航库)
        sealed class Navigation(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : DependencyConfig(
            group = "androidx.navigation",
            name = name,
            version = "2.4.0-rc01",
            remark = "导航库",
            link = "https://developer.android.com/jetpack/androidx/releases/navigation",
            dependencyMethod = dependencyMethod,
        ) {
            object Fragment : Navigation("navigation-fragment-ktx")
            object Ui : Navigation("navigation-ui-ktx")
            object Compose : Navigation("navigation-compose")
            object Test : Navigation("navigation-testing", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Mavericks架构
        sealed class Mavericks(name: String) : DependencyConfig(
            group = "com.airbnb.android",
            name = name,
            version = "2.5.1",
            remark = "Mavericks架构",
            link = "https://github.com/airbnb/mavericks",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : Mavericks("mavericks")
            object Compose : Mavericks("mavericks-compose")
            object Navigation : Mavericks("mavericks-navigation")
            object Launcher : Mavericks("mavericks-launcher")
        }
        //endregion
    }
    //endregion
}
