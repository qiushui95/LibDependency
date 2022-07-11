package son.ysy.dependencies

@Suppress("unused")
sealed class DependencyConfig(
    val group: String,
    val name: String,
    val version: String,
    val remark: String,
    val link: String,
    val dependencyMethod: DependencyMethod,
) {

    override fun toString(): String {
        return "son.ysy.dependencies.DependencyConfig( group='$group', name='$name', version='$version', remark='$remark', link='$link', dependencyMethod=$dependencyMethod)"
    }

    private fun getKDoc(remark: String?, link: String?) = listOf(remark, link)
        .mapNotNull { it }
        .joinToString("\n")
        .ifBlank { null }

    //region Single
    sealed class Single(
        group: String,
        name: String,
        version: String,
        remark: String,
        link: String,
        dependencyMethod: DependencyMethod,
    ) : DependencyConfig(group, name, version, remark, link, dependencyMethod) {
        //region AliOss(阿里云存储)
        object AliOss : Single(
            group = "com.aliyun.dpa",
            name = "oss-android-sdk",
            version = "2.9.12",
            remark = "阿里云存储",
            link = "https://help.aliyun.com/document_detail/32043.html",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region AliPush(阿里推送)
        object AliPush : Single(
            group = "com.aliyun.ams",
            name = "alicloud-android-push",
            version = "3.7.4",
            remark = "阿里推送",
            link = "https://help.aliyun.com/document_detail/190009.html?spm=a2c4g.11174283.3.2.52eb6d163QVxjG",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region AndroidUtil(多功能工具包)
        object AndroidUtil : Single(
            group = "com.blankj",
            name = "utilcodex",
            version = "1.31.0",
            remark = "多功能工具包",
            link = "https://github.com/Blankj/AndroidUtilCode",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Annotation
        object Annotation : Single(
            group = "androidx.annotation",
            name = "annotation",
            version = "1.4.0",
            remark = "Annotation",
            link = "https://developer.android.com/jetpack/androidx/releases/annotation",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Appcompat
        object Appcompat : Single(
            group = "androidx.appcompat",
            name = "appcompat",
            version = "1.4.2",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/appcompat",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Background(背景生成工具库)
        object Background : Single(
            group = "com.github.JavaNoober.BackgroundLibrary",
            name = "libraryx",
            version = "1.7.4",
            remark = "背景生成工具库",
            link = "https://github.com/JavaNoober/BackgroundLibrary",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BasePopup(弹窗)
        object BasePopup : Single(
            group = "io.github.razerdp",
            name = "BasePopup",
            version = "3.2.0",
            remark = "弹窗",
            link = "https://github.com/razerdp/BasePopup",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ColorKtx(颜色帮助库)
        object ColorKtx : Single(
            group = "me.jorgecastillo",
            name = "androidcolorx",
            version = "0.2.0",
            remark = "颜色帮助库",
            link = "https://github.com/JorgeCastilloPrz/AndroidColorX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Compressor(图片压缩库)
        object Compressor : Single(
            group = "id.zelory",
            name = "compressor",
            version = "3.0.1",
            remark = "图片压缩库",
            link = "https://github.com/zetbaitsu/Compressor",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region DateTimePicker(时间选择器)
        object DateTimePicker : Single(
            group = "com.github.loperSeven",
            name = "DateTimePicker",
            version = "0.5.8",
            remark = "时间选择器",
            link = "https://github.com/loperSeven/DateTimePicker",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region EasyFloat(悬浮窗)
        object EasyFloat : Single(
            group = "com.github.princekin-f",
            name = "EasyFloat",
            version = "2.0.4",
            remark = "悬浮窗",
            link = "https://github.com/princekin-f/EasyFloat",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Exif图片信息
        object Exif : Single(
            group = "androidx.exifinterface",
            name = "exifinterface",
            version = "1.3.3",
            remark = "图片信息",
            link = "https://developer.android.com/jetpack/androidx/releases/exifinterface",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Flow扩展
        object FlowExt : Single(
            group = "io.github.hoc081098",
            name = "FlowExt-jvm",
            version = "0.3.0",
            remark = "Flow扩展",
            link = "https://github.com/hoc081098/FlowExt",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ImagePicker(多媒体选择库)
        object ImagePicker : Single(
            group = "com.ypx.yimagepicker",
            name = "androidx",
            version = "3.1.4",
            remark = "多媒体选择库",
            link = "https://github.com/yangpeixing/YImagePicker",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ImageWatcher(图片预览框架)
        object ImageWatcher : Single(
            group = "com.github.iielse",
            name = "imageviewer",
            version = "2.1.13",
            remark = "图片预览框架",
            link = "https://github.com/iielse/imageviewer",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region JodaTime(时间处理库)
        object JodaTime : Single(
            group = "joda-time",
            name = "joda-time",
            version = "2.10.14",
            remark = "时间处理库",
            link = "https://github.com/JodaOrg/joda-time",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region LeakCanary(内存泄露监控)
        object LeakCanary : Single(
            group = "com.squareup.leakcanary",
            name = "leakcanary-android",
            version = "2.9.1",
            remark = "内存泄露监控",
            link = "https://square.github.io/leakcanary/getting_started/",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Mmkv(持久KV数据存储)
        object Mmkv : Single(
            group = "com.tencent",
            name = "mmkv-static",
            version = "1.2.13",
            remark = "持久KV数据存储",
            link = "https://github.com/Tencent/MMKV/blob/master/README_CN.md",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PermissionX(权限请求)
        object PermissionX : Single(
            group = "com.guolindev.permissionx",
            name = "permissionx",
            version = "1.6.4",
            remark = "权限请求",
            link = "https://github.com/guolindev/PermissionX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Paging(分页请求)
        object Paging : Single(
            group = "androidx.paging",
            name = "paging-runtime-ktx",
            version = "3.1.1",
            remark = "分页请求",
            link = "https://developer.android.com/jetpack/androidx/releases/paging",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PanelSwitchHelper(聊天键盘优化)
        object PanelSwitch : Single(
            group = "com.github.YummyLau",
            name = "PanelSwitchHelper",
            version = "1.4.0",
            remark = "聊天键盘优化",
            link = "https://github.com/DSAppTeam/PanelSwitchHelper",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region QrScanner(二维码扫描)
        object QrScanner : Single(
            group = "com.github.jenly1314",
            name = "zxing-lite",
            version = "2.2.1",
            remark = "二维码扫描",
            link = "https://github.com/jenly1314/ZXingLite",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Startup(app启动初始化)
        object Startup : Single(
            group = "com.github.qiushui95",
            name = "AndroidInitializer",
            version = "1.0.9",
            remark = "app启动初始化",
            link = "https://github.com/qiushui95/AndroidInitializer",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Store(多数据源)
        object Store : Single(
            group = "com.dropbox.mobile.store",
            name = "store4",
            version = "4.0.5",
            remark = "多数据源",
            link = "https://github.com/dropbox/Store",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region WeChat(微信开发Sdk)
        object WeChat : Single(
            group = "com.tencent.mm.opensdk",
            name = "wechat-sdk-android-without-mta",
            version = "6.8.0",
            remark = "微信开发Sdk",
            link = "https://developers.weixin.qq.com/doc/oplatform/Mobile_App/Resource_Center_Homepage.html",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region XCrash(奔溃日志收集)
        object XCrash : Single(
            group = "com.iqiyi.xcrash",
            name = "xcrash-android-lib",
            version = "3.1.0",
            remark = "奔溃日志收集",
            link = "https://github.com/iqiyi/xCrash/blob/master/README.zh-CN.md",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region XPopup(弹窗)
        object XPopup : Single(
            group = "com.github.li-xiaojun",
            name = "XPopup",
            version = "2.8.11",
            remark = "弹窗",
            link = "https://github.com/li-xiaojun/XPopup",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Profiler(AS OkHttp 拦截器)
        object Profiler : Single(
            group = "com.localebro",
            name = "okhttpprofiler",
            version = "1.0.8",
            remark = "AS OkHttp 拦截器",
            link = "https://github.com/itkacher/OkHttpProfiler",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region MavenPublish(Maven上传)
        object MavenPublish : Single(
            group = "com.vanniktech",
            name = "gradle-maven-publish-plugin",
            version = "0.20.0",
            remark = "Maven上传",
            link = "https://github.com/vanniktech/gradle-maven-publish-plugin",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            const val PLUGIN_ID = "com.vanniktech.maven.publish"
        }

        //endregion
        //region Json序列化
        object Serialization : Single(
            group = "org.jetbrains.kotlinx",
            name = "kotlinx-serialization-json",
            version = "1.3.3",
            remark = "Json序列化",
            link = "https://github.com/Kotlin/kotlinx.serialization",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            const val PLUGIN_ID = "plugin.serialization"
        }

        //endregion
        //region VasDolly(多渠道打包)
        object VasDolly : Single(
            group = "com.tencent.vasdolly",
            name = "helper",
            version = "3.0.4",
            remark = "多渠道打包",
            link = "https://github.com/Tencent/VasDolly",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            const val PLUGIN_ID = "plugin.serialization"
        }

        //endregion
        //region zip压缩相关
        object Zip4J : Single(
            group = "net.lingala.zip4j",
            name = "zip4j",
            version = "2.11.1",
            remark = "zip压缩相关",
            link = "https://github.com/srikanth-lingala/zip4j",
            dependencyMethod = DependencyMethod.Implementation,
        )
        //endregion
    }

    //endregion
    //region View
    sealed class View(
        group: String,
        name: String,
        version: String,
        remark: String,
        link: String,
        dependencyMethod: DependencyMethod,
    ) : DependencyConfig(group, name, version, remark, link, dependencyMethod) {
        //region AgentWeb(浏览器)
        object AgentWeb : View(
            group = "com.github.Justson.AgentWeb",
            name = "agentweb-core",
            version = "v4.1.9-androidx",
            remark = "浏览器",
            link = "https://github.com/Justson/AgentWeb",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BannerView(轮播控件)
        object BannerView : View(
            group = "com.github.xiaohaibin",
            name = "XBanner",
            version = "androidx_v1.2.8",
            remark = "轮播控件",
            link = "https://github.com/xiaohaibin/XBanner/tree/androidX",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BlurView(高斯模糊)
        object BlurView : View(
            group = "com.github.Dimezis",
            name = "BlurView",
            version = "version-2.0.0",
            remark = "高斯模糊",
            link = "https://github.com/Dimezis/BlurView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BottomNavigation(底部导航)
        object BottomNavigation : View(
            group = "com.ashokvarma.android",
            name = "bottom-navigation-bar",
            version = "2.2.0",
            remark = "底部导航",
            link = "https://github.com/Ashok-Varma/BottomNavigation",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region BottomTab(底部导航)
        object BottomTab : View(
            group = "me.majiajie",
            name = "pager-bottom-tab-strip",
            version = "2.4.0",
            remark = "底部导航",
            link = "https://github.com/tyzlmjj/PagerBottomTabStrip",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ConstraintLayout(约束布局)
        object ConstraintLayout : View(
            group = "androidx.constraintlayout",
            name = "constraintlayout",
            version = "2.1.4",
            remark = "约束布局",
            link = "https://developer.android.com/jetpack/androidx/releases/constraintlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region CornerView(圆角控件)
        object CornerView : View(
            group = "io.github.csdn-mobile",
            name = "RoundView",
            version = "1.8.0",
            remark = "圆角控件",
            link = "https://github.com/csdn-mobile/RoundView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region DotsIndicator(指示器控件)
        object DotsIndicator : View(
            group = "com.tbuonomo",
            name = "dotsindicator",
            version = "4.3",
            remark = "指示器控件",
            link = "https://github.com/tommybuonomo/dotsindicator",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region FlexBox(流式布局)
        object FlexBox : View(
            group = "com.google.android.flexbox",
            name = "flexbox",
            version = "3.0.0",
            remark = "流式布局",
            link = "https://github.com/google/flexbox-layout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region FormatterEdit(输入格式化控件)
        object FormatterEdit : View(
            group = "com.github.dkzwm",
            name = "fet-core",
            version = "0.2.1",
            remark = "输入格式化控件",
            link = "https://github.com/dkzwm/FormatEditText",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region LottieView(动画框架)
        object LottieView : View(
            group = "com.airbnb.android",
            name = "lottie",
            version = "5.2.0",
            remark = "动画框架",
            link = "https://github.com/airbnb/lottie-android",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Material
        object Material : View(
            group = "com.google.android.material",
            name = "material",
            version = "1.6.1",
            remark = "",
            link = "https://github.com/material-components/material-components-android",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PdfViewer(pdf查看)
        object PdfViewer : View(
            group = "com.github.mhiew",
            name = "android-pdf-viewer",
            version = "3.2.0-beta.3",
            remark = "pdf查看",
            link = "https://github.com/barteksc/AndroidPdfViewer",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PhotoView(图片预览)
        object PhotoView : View(
            group = "com.github.chrisbanes",
            name = "PhotoView",
            version = "2.3.0",
            remark = "图片预览",
            link = "https://github.com/Baseflow/PhotoView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region PinView(密码输入框)
        object PinView : View(
            group = "io.github.chaosleung",
            name = "pinview",
            version = "1.4.4",
            remark = "密码输入框",
            link = "https://github.com/ChaosLeung/PinView",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region RecyclerView
        object RecyclerView : View(
            group = "androidx.recyclerview",
            name = "recyclerview",
            version = "1.2.1",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/recyclerview",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region RecyclerView分割线
        object RecyclerViewDivider : View(
            group = "com.github.fondesa",
            name = "recycler-view-divider",
            version = "3.5.0",
            remark = "RecyclerView分割线",
            link = "https://github.com/fondesa/recycler-view-divider",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region RecyclerView页面滑动效果
        object RecyclerViewSnap : View(
            group = "com.github.rubensousa",
            name = "gravitysnaphelper",
            version = "2.2.2",
            remark = "RecyclerView分割线",
            link = "https://github.com/rubensousa/GravitySnapHelper",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region SwipeRefreshLayout(下拉刷新控件)
        object SwipeRefreshLayout : View(
            group = "androidx.swiperefreshlayout",
            name = "swiperefreshlayout",
            version = "1.2.0-alpha01",
            remark = "下拉刷新控件",
            link = "https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region SmartRefreshLayout(下拉刷新控件)
        sealed class SmartRefreshLayout(name: String) : View(
            group = "io.github.scwang90",
            name = name,
            version = "2.0.5",
            remark = "下拉刷新控件",
            link = "https://github.com/scwang90/SmartRefreshLayout",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : SmartRefreshLayout("refresh-layout-kernel")
            object ClassicsHeader : SmartRefreshLayout("refresh-header-classics")
            object TwoLevelHeader : SmartRefreshLayout("refresh-header-two-level")
            object ClassicsFooter : SmartRefreshLayout("refresh-footer-classics")
        }

        //endregion
        //region SwitchButton(开关按钮)
        object SwitchButton : View(
            group = "com.kyleduo.switchbutton",
            name = "library",
            version = "2.1.0",
            remark = "开关按钮",
            link = "https://github.com/kyleduo/SwitchButton",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region ViewPager2
        object ViewPager2 : View(
            group = "androidx.viewpager2",
            name = "viewpager2",
            version = "1.1.0-beta01",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/viewpager2",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region TabLayout
        sealed class TabLayout(name: String) : View(
            group = "com.github.angcyo.DslTablayout",
            name = name,
            version = "3.2.4",
            remark = "",
            link = "https://github.com/angcyo/DslTabLayout",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : TabLayout("TabLayout")
            object VP2 : TabLayout("ViewPager2Delegate")
        }
        //endregion
    }

    //endregion
    //region Test
    sealed class Test(
        group: String,
        name: String,
        version: String,
        remark: String,
        link: String,
        dependencyMethod: DependencyMethod,
    ) : DependencyConfig(group, name, version, remark, link, dependencyMethod) {
        //region Espresso(UI自动化测试)
        object Espresso : Test(
            group = "androidx.test.espresso",
            name = "espresso-core",
            version = "3.4.0",
            remark = "UI自动化测试",
            link = "https://mvnrepository.com/artifact/androidx.test.espresso/espresso-core",
            dependencyMethod = DependencyMethod.AndroidTest.Implementation,
        )

        //endregion
        //region Junit(单元测试)
        object Junit : Test(
            group = "org.junit.jupiter",
            name = "junit-jupiter",
            version = "5.8.2",
            remark = "单元测试",
            link = "https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter",
            dependencyMethod = DependencyMethod.Test.Implementation,
        )

        //endregion
        //region JunitExt(单元测试扩展)
        object JunitExt : Test(
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
    sealed class Compose(
        group: String,
        name: String,
        version: String,
        remark: String,
        link: String,
        dependencyMethod: DependencyMethod,
    ) : DependencyConfig(group, name, version, remark, link, dependencyMethod) {
        //region Accompanist
        sealed class Accompanist(name: String) : Compose(
            group = "com.google.accompanist",
            name = name,
            version = "0.23.1",
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
        object ConstraintLayout : Compose(
            group = "androidx.constraintlayout",
            name = "constraintlayout-compose",
            version = "1.0.1",
            remark = "Compose约束布局",
            link = "https://developer.android.com/jetpack/androidx/releases/constraintlayout",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region NavigationAnimation
        object NavigationAnimation : Compose(
            group = "com.github.fornewid",
            name = "material-motion-compose",
            version = "0.8.1",
            remark = "Compose导航动画",
            link = "https://github.com/fornewid/material-motion-compose",
            dependencyMethod = DependencyMethod.Implementation,
        )

        //endregion
        //region Official
        sealed class Official(
            group: String,
            name: String,
            version: String = "1.2.0-rc03",
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Compose(
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
        object ViewModel : Compose(
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
    sealed class Group(
        group: String,
        name: String,
        version: String,
        remark: String,
        link: String,
        dependencyMethod: DependencyMethod,
    ) : DependencyConfig(group, name, version, remark, link, dependencyMethod) {
        //region Activity
        sealed class Activity(name: String) : Group(
            group = "androidx.activity",
            name = name,
            version = "1.5.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/activity",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : Activity("activity-ktx")
            object Compose : Activity("activity-compose")
        }

        //endregion
        //region Bugly
        sealed class Bugly(name: String, version: String) : Group(
            group = "com.tencent.bugly",
            name = name,
            version = version,
            remark = "",
            link = "https://bugly.qq.com/docs/user-guide/instruction-manual-android/?v=1.0.0",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Crash : Bugly("crashreport", "4.0.4")
            object Upgrade : Bugly("crashreport_upgrade", "1.6.1")
        }

        //endregion
        //region CameraX(相机相关)
        sealed class CameraX(name: String) : Group(
            group = "androidx.camera",
            name = name,
            version = "1.1.0",
            remark = "相机相关",
            link = "https://developer.android.com/jetpack/androidx/releases/camera",
            dependencyMethod = DependencyMethod.Implementation,
        ) {

            object Camera2 : CameraX("camera-camera2")
            object Core : CameraX("camera-core")
            object Lifecycle : CameraX("camera-lifecycle")
            object Video : CameraX("camera-video")
            object View : CameraX("camera-view")
            object Extensions : CameraX("camera-extensions")
        }

        //endregion
        //region Chucker(网络请求监控)
        sealed class Chucker(name: String, dependencyMethod: DependencyMethod) : Group(
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
        sealed class Coil(name: String) : Group(
            group = "io.coil-kt",
            name = name,
            version = "2.1.0",
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
        sealed class Core(name: String, version: String) : Group(
            group = "androidx.core",
            name = name,
            version = version,
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/core",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Ktx : Core("core-ktx", "1.8.0")
            object Splash : Core("core-splashscreen", "1.0.0-rc01")
        }

        //endregion
        //region Coroutines(协程)
        sealed class Coroutines(name: String, dependencyMethod: DependencyMethod) : Group(
            group = "org.jetbrains.kotlinx",
            name = name,
            version = "1.6.3",
            remark = "协程",
            link = "https://github.com/Kotlin/kotlinx.coroutines",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Coroutines("kotlinx-coroutines-android", DependencyMethod.Implementation)
            object Test :
                Coroutines("kotlinx-coroutines-test", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Download(下载)
        sealed class Download(name: String, dependencyMethod: DependencyMethod) : Group(
            group = "me.laoyuyu.aria",
            name = name,
            version = "3.8.16",
            remark = "下载",
            link = "https://github.com/AriaLyy/Aria",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Download("core", DependencyMethod.Implementation)
            object Ftp : Download("ftp", DependencyMethod.Implementation)
            object Sftp : Download("sftp", DependencyMethod.Implementation)
            object M3u8 : Download("m3u8", DependencyMethod.Implementation)
            object Compiler : Download(
                "compiler",
                DependencyMethod.Kapt
            )
        }

        //endregion
        //region Epoxy(RecyclerView适配库)
        sealed class Epoxy(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.airbnb.android",
            name = name,
            version = "5.0.0-beta05",
            remark = "",
            link = "https://github.com/airbnb/epoxy",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Epoxy("epoxy")
            object Compiler : Epoxy("epoxy-processor", DependencyMethod.Ksp)
            object Compose : Epoxy("epoxy-compose")
            object Glide : Epoxy("epoxy-glide-preloading")
        }

        //endregion
        //region FlowBinding
        sealed class FlowBinding(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "io.github.reactivecircus.flowbinding",
            name = name,
            version = "1.2.0",
            remark = "FlowBinding",
            link = "https://github.com/ReactiveCircus/FlowBinding",
            dependencyMethod = dependencyMethod,
        ) {
            object Android : FlowBinding("flowbinding-android")
            object Activity : FlowBinding("flowbinding-activity")
            object AppCompat : FlowBinding("flowbinding-appcompat")
            object Core : FlowBinding("flowbinding-core")
            object DrawerLayout : FlowBinding("flowbinding-drawerlayout")
            object Lifecycle : FlowBinding("flowbinding-lifecycle")
            object Navigation : FlowBinding("flowbinding-navigation")
            object Preference : FlowBinding("flowbinding-preference")
            object RecyclerView : FlowBinding("flowbinding-recyclerview")
            object SwipeRefreshLayout : FlowBinding("flowbinding-swiperefreshlayout")
            object ViewPager : FlowBinding("flowbinding-viewpager")
            object ViewPager2 : FlowBinding("flowbinding-viewpager2")
            object Material : FlowBinding("flowbinding-material")
        }

        //endregion
        //region Fragment
        sealed class Fragment(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "androidx.fragment",
            name = name,
            version = "1.5.0",
            remark = "",
            link = "https://developer.android.com/jetpack/androidx/releases/fragment",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Fragment("fragment-ktx")
            object Test : Fragment("fragment-testing", DependencyMethod.Test.Implementation)
        }

        //endregion
        //region Fetch
        sealed class Fetch(
            group: String,
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = group,
            name = name,
            version = "3.1.6",
            remark = "下载框架",
            link = "https://github.com/tonyofrancis/Fetch",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Fetch("androidx.tonyodev.fetch2", "xfetch2")
            object OkHttp : Fetch("androidx.tonyodev.fetch2okhttp", "xfetch2okhttp")
        }

        //endregion
        //region Glide(图片加载)
        sealed class Glide(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.github.bumptech.glide",
            name = name,
            version = "4.13.2",
            remark = "图片加载",
            link = "https://github.com/bumptech/glide",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Glide("glide")
            object OkHttp : Glide("okhttp3-integration")
            object Compiler : Glide("compiler", DependencyMethod.Kapt)
        }

        //endregion
        //region ImmersionBar(状态栏)
        sealed class ImmersionBar(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.geyifeng.immersionbar",
            name = name,
            version = "3.2.2",
            remark = "状态栏",
            link = "https://github.com/gyf-dev/ImmersionBar",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : ImmersionBar("immersionbar")
            object Ktx : ImmersionBar("immersionbar-ktx")
        }

        //endregion
        //region Koin(依赖注入库)
        sealed class Koin(
            name: String,
            version: Version,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "io.insert-koin",
            name = name,
            version = version.value,
            remark = "依赖注入库",
            link = "https://github.com/InsertKoinIO/koin",
            dependencyMethod = dependencyMethod,
        ) {
            sealed class Version(val value: String) {
                object Version1 : Version("1.0.1")
                object Version2 : Version("3.2.0")
            }

            object Android : Koin("koin-android", Version.Version2)
            object Core : Koin("koin-core", Version.Version2)
            object WorkManager : Koin("koin-androidx-workmanager", Version.Version2)
            object Navigation : Koin("koin-androidx-navigation", Version.Version2)
            object Compose : Koin("koin-androidx-compose", Version.Version2)
            object Test : Koin(
                "koin-test-junit5",
                Version.Version2, DependencyMethod.Test.Implementation
            )

            object Annotations : Koin("koin-annotations", Version.Version1)
            object Compiler : Koin("koin-ksp-compiler", Version.Version1)
        }

        //endregion
        //region Kotlin
        sealed class Kotlin(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "org.jetbrains.kotlin",
            name = name,
            version = "1.6.21",
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
        ) : Group(
            group = "androidx.lifecycle",
            name = name,
            version = "2.5.0",
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
        //region Mavericks架构
        sealed class Mavericks(name: String) : Group(
            group = "com.airbnb.android",
            name = name,
            version = "2.7.0",
            remark = "Mavericks架构",
            link = "https://github.com/airbnb/mavericks",
            dependencyMethod = DependencyMethod.Implementation,
        ) {
            object Core : Mavericks("mavericks")
            object Compose : Mavericks("mavericks-compose")
            object Navigation : Mavericks("mavericks-navigation")
        }

        //endregion
        //region MoShi(json解析库)
        sealed class MoShi(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
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
        //region Navigation(导航库)
        sealed class Navigation(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "androidx.navigation",
            name = name,
            version = "2.5.0",
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
        //region OkHttp
        sealed class OkHttp(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.squareup.okhttp3",
            name = name,
            version = "4.10.0",
            remark = "",
            link = "https://github.com/square/okhttp",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : OkHttp("okhttp")
            object Mock : OkHttp("mockwebserver", DependencyMethod.AndroidTest.Implementation)
        }

        //endregion
        //region OkDownload
        sealed class OkDownload(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.liulishuo.okdownload",
            name = name,
            version = "1.0.7",
            remark = "",
            link = "https://github.com/lingochamp/okdownload",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : OkDownload("okdownload")
            object Sqlite : OkDownload("sqlite")
            object OkHttp : OkDownload("okhttp")
            object FileDownloader : OkDownload("filedownloader")
            object Ktx : OkDownload("ktx")
        }

        //endregion
        //region Paris
        sealed class Paris(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.airbnb.android",
            name = name,
            version = "2.0.1",
            remark = "",
            link = "https://github.com/airbnb/paris",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Paris("paris")
            object Compiler : Paris("paris-processor", DependencyMethod.Ksp)
        }

        //endregion
        //region Retrofit(网络请求)
        sealed class Retrofit(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
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
        ) : Group(
            group = "androidx.room",
            name = name,
            version = "2.4.2",
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
        //region Stetho(调试工具)
        sealed class Stetho(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.facebook.stetho",
            name = name,
            version = "1.6.0",
            remark = "调试工具",
            link = "https://github.com/facebook/stetho",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Stetho("stetho")
            object OkHttp : Stetho("stetho-okhttp3")
        }

        //endregion
        //region S3(亚马逊云存储)
        sealed class S3(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.amazonaws",
            name = name,
            version = "2.49.0",
            remark = "亚马逊云存储",
            link = "https://github.com/aws-amplify/aws-sdk-android",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : S3("aws-android-sdk-s3")
            object Client : S3("aws-android-sdk-mobile-client")
        }

        //endregion
        //region Transformer(图片裁剪器)
        sealed class Transformer(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "jp.wasabeef.transformers",
            name = name,
            version = "1.0.6",
            remark = "图片裁剪器",
            link = "https://github.com/wasabeef/transformers",
            dependencyMethod = dependencyMethod,
        ) {
            object Core : Transformer("core")
            object Coil : Transformer("coil")
            object CoilGpu : Transformer("coil-gpu")
            object Glide : Transformer("glide")
            object GlideGpu : Transformer("glide-gpu")
        }

        //endregion
        //region 友盟
        sealed class UMeng(
            name: String,
            version: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
            group = "com.umeng.umsdk",
            name = name,
            version = version,
            remark = "友盟",
            link = "https://developer.umeng.com/docs/119267/detail/118584",
            dependencyMethod = dependencyMethod,
        ) {
            object Asms : UMeng("asms", "1.6.3")
            object Common : UMeng("common", "9.5.0")
        }

        //endregion
        //region WorkManager(任务管理器)
        sealed class WorkManager(
            name: String,
            dependencyMethod: DependencyMethod = DependencyMethod.Implementation,
        ) : Group(
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
    }
    //endregion
}
