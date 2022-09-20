plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 24
        targetSdk = 31
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.google.accompanist:accompanist-appcompat-theme:+")
    implementation("com.google.accompanist:accompanist-drawablepainter:+")
    implementation("com.google.accompanist:accompanist-flowlayout:+")
    implementation("com.google.accompanist:accompanist-insets:+")
    implementation("com.google.accompanist:accompanist-navigation-animation:+")
    implementation("com.google.accompanist:accompanist-navigation-material:+")
    implementation("com.google.accompanist:accompanist-pager:+")
    implementation("com.google.accompanist:accompanist-permissions:+")
    implementation("com.google.accompanist:accompanist-placeholder:+")
    implementation("com.google.accompanist:accompanist-placeholder-material:+")
    implementation("com.google.accompanist:accompanist-swiperefresh:+")
    implementation("com.google.accompanist:accompanist-systemuicontroller:+")
    implementation("androidx.constraintlayout:constraintlayout-compose:+")
    implementation("com.github.fornewid:material-motion-compose:+")

    implementation("androidx.compose.animation:animation:+")
    implementation("androidx.compose.compiler:compiler:+")
    implementation("androidx.compose.foundation:foundation:+")
    implementation("androidx.compose.runtime:runtime-livedata:+")
    implementation("androidx.compose.material:material:+")
    implementation("androidx.compose.material:material-icons-core:+")
    implementation("androidx.compose.material:material-icons-extended:+")
    implementation("androidx.compose.ui:ui-tooling-preview:+")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:+")
    implementation("androidx.compose.ui:ui:+")
    implementation("androidx.compose.ui:ui-tooling:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:+")



    implementation("androidx.activity:activity-compose:+")
    implementation("androidx.activity:activity-ktx:+")

    implementation("com.tencent.bugly:crashreport:+")
    implementation("com.tencent.bugly:crashreport_upgrade:+")

    implementation("androidx.camera:camera-camera2:+")
    implementation("androidx.camera:camera-core:+")
    implementation("androidx.camera:camera-extensions:+")
    implementation("androidx.camera:camera-lifecycle:+")
    implementation("androidx.camera:camera-video:+")
    implementation("androidx.camera:camera-view:+")

    debugImplementation("com.github.chuckerteam.chucker:library:+")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:+")

    implementation("androidx.core:core-ktx:+")
    implementation("androidx.core:core-splashscreen:+")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:+")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:+")

    kapt("me.laoyuyu.aria:compiler:+")
    implementation("me.laoyuyu.aria:core:+")
    implementation("me.laoyuyu.aria:ftp:+")
    implementation("me.laoyuyu.aria:m3u8:+")
    implementation("me.laoyuyu.aria:sftp:+")

    kapt("com.airbnb.android:epoxy-processor:+")
    implementation("com.airbnb.android:epoxy-compose:+")
    implementation("com.airbnb.android:epoxy:+")
    implementation("com.airbnb.android:epoxy-glide-preloading:+")

    implementation("androidx.tonyodev.fetch2:xfetch2:+")
    implementation("androidx.tonyodev.fetch2okhttp:xfetch2okhttp:+")

    implementation("io.github.reactivecircus.flowbinding:flowbinding-activity:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-android:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-appcompat:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-core:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-drawerlayout:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-lifecycle:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-material:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-navigation:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-preference:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-recyclerview:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-swiperefreshlayout:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager:+")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager2:+")

    implementation("androidx.fragment:fragment-ktx:+")
    testImplementation("androidx.fragment:fragment-testing:+")

    kapt("com.github.bumptech.glide:compiler:+")
    implementation("com.github.bumptech.glide:glide:+")
    implementation("com.github.bumptech.glide:okhttp3-integration:+")

    implementation("com.geyifeng.immersionbar:immersionbar:+")
    implementation("com.geyifeng.immersionbar:immersionbar-ktx:+")

    implementation("io.insert-koin:koin-android:+")
    implementation("io.insert-koin:koin-annotations:+")
    implementation("io.insert-koin:koin-ksp-compiler:+")
    implementation("io.insert-koin:koin-core:+")
    implementation("io.insert-koin:koin-androidx-navigation:+")
    testImplementation("io.insert-koin:koin-test-junit5:+")
    implementation("io.insert-koin:koin-androidx-workmanager:+")

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:+")
    implementation("org.jetbrains.kotlin:kotlin-reflect:+")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:+")

    implementation("androidx.lifecycle:lifecycle-common:+")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:+")
    implementation("androidx.lifecycle:lifecycle-process:+")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:+")
    implementation("androidx.lifecycle:lifecycle-service:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:+")

    implementation("com.airbnb.android:mavericks-compose:+")
    implementation("com.airbnb.android:mavericks:+")
    implementation("com.airbnb.android:mavericks-navigation:+")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:+")
    implementation("com.squareup.moshi:moshi:+")

    implementation("androidx.navigation:navigation-compose:+")
    implementation("androidx.navigation:navigation-fragment-ktx:+")
    testImplementation("androidx.navigation:navigation-testing:+")
    implementation("androidx.navigation:navigation-ui-ktx:+")

    implementation("com.liulishuo.okdownload:okdownload:+")
    implementation("com.liulishuo.okdownload:filedownloader:+")
    implementation("com.liulishuo.okdownload:ktx:+")
    implementation("com.liulishuo.okdownload:okhttp:+")
    implementation("com.liulishuo.okdownload:sqlite:+")

    implementation("com.squareup.okhttp3:okhttp:+")
    implementation("com.squareup.okhttp3:logging-interceptor:+")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:+")

    kapt("com.airbnb.android:paris-processor:+")
    implementation("com.airbnb.android:paris:+")

    implementation("com.squareup.retrofit2:retrofit:+")
    implementation("com.squareup.retrofit2:converter-moshi:+")
    implementation("com.squareup.retrofit2:converter-scalars:+")

    kapt("androidx.room:room-compiler:+")
    implementation("androidx.room:room-runtime:+")
    implementation("androidx.room:room-ktx:+")
    testImplementation("androidx.room:room-testing:+")

    implementation("com.amazonaws:aws-android-sdk-mobile-client:+")
    implementation("com.amazonaws:aws-android-sdk-s3:+")

    implementation("com.facebook.stetho:stetho:+")
    implementation("com.facebook.stetho:stetho-okhttp3:+")

    implementation("jp.wasabeef.transformers:coil:+")
    implementation("jp.wasabeef.transformers:coil-gpu:+")
    implementation("jp.wasabeef.transformers:core:+")
    implementation("jp.wasabeef.transformers:glide:+")
    implementation("jp.wasabeef.transformers:glide-gpu:+")

    implementation("com.umeng.umsdk:asms:+")
    implementation("com.umeng.umsdk:common:+")

    implementation("androidx.work:work-runtime-ktx:+")
    testImplementation("androidx.work:work-testing:+")



    implementation("com.aliyun.dpa:oss-android-sdk:+")
    implementation("com.aliyun.ams:alicloud-android-push:+")
    implementation("com.blankj:utilcodex:+")
    implementation("androidx.annotation:annotation:+")
    implementation("androidx.appcompat:appcompat:+")
    implementation("com.github.JavaNoober.BackgroundLibrary:libraryx:+")
    implementation("io.github.razerdp:BasePopup:+")
    implementation("me.jorgecastillo:androidcolorx:+")
    implementation("id.zelory:compressor:+")
    implementation("com.github.loperSeven:DateTimePicker:+")
    implementation("com.github.princekin-f:EasyFloat:+")
    implementation("androidx.exifinterface:exifinterface:+")
    implementation("io.github.hoc081098:FlowExt-jvm:+")
    implementation("com.ypx.yimagepicker:androidx:+")
    implementation("com.github.iielse:imageviewer:+")
    implementation("joda-time:joda-time:+")
    implementation("com.squareup.leakcanary:leakcanary-android:+")
    implementation("com.vanniktech:gradle-maven-publish-plugin:+")
    implementation("com.tencent:mmkv-static:+")
    implementation("androidx.paging:paging-runtime-ktx:+")
    implementation("com.github.DSAppTeam:PanelSwitchHelper:+")
    implementation("com.guolindev.permissionx:permissionx:+")
    implementation("com.localebro:okhttpprofiler:+")
    implementation("com.github.jenly1314:zxing-lite:+")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:+")
    implementation("com.github.qiushui95:AndroidInitializer:+")
    implementation("com.dropbox.mobile.store:store4:+")
    implementation("com.tencent.vasdolly:helper:+")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:+")
    implementation("com.iqiyi.xcrash:xcrash-android-lib:+")
    implementation("com.github.li-xiaojun:XPopup:+")
    implementation("net.lingala.zip4j:zip4j:+")



    androidTestImplementation("androidx.test.espresso:espresso-core:+")
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("androidx.test.ext:junit-ktx:+")



    implementation("com.github.Justson.AgentWeb:agentweb-core:+")
    implementation("com.github.xiaohaibin:XBanner:+")
    implementation("com.github.Dimezis:BlurView:+")
    implementation("com.ashokvarma.android:bottom-navigation-bar:+")
    implementation("me.majiajie:pager-bottom-tab-strip:+")
    implementation("androidx.constraintlayout:constraintlayout:+")
    implementation("io.github.csdn-mobile:RoundView:+")
    implementation("com.tbuonomo:dotsindicator:+")
    implementation("com.google.android.flexbox:flexbox:+")
    implementation("com.github.dkzwm:fet-core:+")
    implementation("com.airbnb.android:lottie:+")
    implementation("com.google.android.material:material:+")
    implementation("com.github.mhiew:android-pdf-viewer:+")
    implementation("com.github.chrisbanes:PhotoView:+")
    implementation("io.github.chaosleung:pinview:+")
    implementation("androidx.recyclerview:recyclerview:+")
    implementation("com.github.fondesa:recycler-view-divider:+")
    implementation("com.github.rubensousa:gravitysnaphelper:+")
    implementation("com.github.donkingliang:ConsecutiveScroller:+")

    implementation("io.github.scwang90:refresh-footer-classics:+")
    implementation("io.github.scwang90:refresh-header-classics:+")
    implementation("io.github.scwang90:refresh-layout-kernel:+")
    implementation("io.github.scwang90:refresh-header-two-level:+")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:+")
    implementation("com.kyleduo.switchbutton:library:+")

    implementation("com.github.angcyo.DslTablayout:TabLayout:+")
    implementation("com.github.angcyo.DslTablayout:ViewPager2Delegate:+")
    implementation("androidx.viewpager2:viewpager2:+")
}