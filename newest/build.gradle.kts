plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp") version "1.6.10-1.0.4"
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
    implementation("com.aliyun.dpa:oss-android-sdk:+")
    implementation("com.aliyun.ams:alicloud-android-push:+")
    implementation("com.blankj:utilcodex:+")
    implementation("androidx.annotation:annotation:+")
    implementation("androidx.appcompat:appcompat:+")
    implementation("com.github.JavaNoober.BackgroundLibrary:libraryx:+")
    implementation("io.github.razerdp:BasePopup:+")
    implementation("me.jorgecastillo:androidcolorx:+")
    implementation("com.github.loperSeven:DateTimePicker:+")
    implementation("com.github.princekin-f:EasyFloat:+")
    implementation("com.ypx.yimagepicker:androidx:+")
    implementation("joda-time:joda-time:+")
    implementation("com.squareup.leakcanary:leakcanary-android:+")
    implementation("com.tencent:mmkv-static:+")
    implementation("com.guolindev.permissionx:permissionx:+")
    implementation("androidx.paging:paging-runtime:+")
    implementation("com.github.jenly1314:zxing-lite:+")
    implementation("com.github.qiushui95:AndroidInitializer:+")
    implementation("com.dropbox.mobile.store:store4:+")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:+")
    implementation("com.iqiyi.xcrash:xcrash-android-lib:+")
    implementation("com.localebro:okhttpprofiler:+")
    implementation("com.vanniktech:gradle-maven-publish-plugin:+")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:+")
    implementation("net.lingala.zip4j:zip4j:+")

    implementation("com.github.Justson.AgentWeb:agentweb-core:+")
    implementation("com.github.xiaohaibin:XBanner:+")
    implementation("com.eightbitlab:blurview:+")
    implementation("com.ashokvarma.android:bottom-navigation-bar:+")
    implementation("androidx.constraintlayout:constraintlayout:+")
    implementation("io.github.csdn-mobile:RoundView:+")
    implementation("com.google.android.flexbox:flexbox:+")
    implementation("com.github.dkzwm:fet-core:+")
    implementation("com.airbnb.android:lottie:+")
    implementation("com.google.android.material:material:+")
    implementation("com.github.mhiew:android-pdf-viewer:+")
    implementation("com.github.chrisbanes:PhotoView:+")
    implementation("io.github.chaosleung:pinview:+")
    implementation("androidx.recyclerview:recyclerview:+")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:+")
    implementation("com.kyleduo.switchbutton:library:+")
    implementation("androidx.viewpager2:viewpager2:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:+")

    androidTestImplementation("androidx.test.espresso:espresso-core:+")
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("androidx.test.ext:junit-ktx:+")

    implementation("androidx.constraintlayout:constraintlayout-compose:+")
    implementation("com.github.fornewid:material-motion-compose:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:+")

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


    implementation("androidx.activity:activity-ktx:+")
    implementation("androidx.activity:activity-compose:+")

    implementation("androidx.camera:camera-camera2:+")
    implementation("androidx.camera:camera-core:+")
    implementation("androidx.camera:camera-lifecycle:+")
    implementation("androidx.camera:camera-video:+")
    implementation("androidx.camera:camera-view:+")
    implementation("androidx.camera:camera-extensions:+")

    debugImplementation("com.github.chuckerteam.chucker:library:+")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:+")

    implementation("io.coil-kt:coil:+")
    implementation("io.coil-kt:coil-compose:+")
    implementation("io.coil-kt:coil-svg:+")
    implementation("io.coil-kt:coil-gif:+")
    implementation("io.coil-kt:coil-video:+")

    implementation("androidx.core:core-ktx:+")
    implementation("androidx.core:core-splashscreen:+")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:+")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:+")

    implementation("me.laoyuyu.aria:core:+")
    implementation("me.laoyuyu.aria:ftp:+")
    implementation("me.laoyuyu.aria:sftp:+")
    implementation("me.laoyuyu.aria:m3u8:+")
    kapt("me.laoyuyu.aria:compiler:+")

    implementation("com.airbnb.android:epoxy:+")
    ksp("com.airbnb.android:epoxy-processor:+")
    implementation("com.airbnb.android:epoxy-compose:+")
    implementation("com.airbnb.android:epoxy-glide-preloading:+")

    implementation("androidx.fragment:fragment-ktx:+")
    testImplementation("androidx.fragment:fragment-testing:+")

    implementation("io.insert-koin:koin-android:+")
    implementation("io.insert-koin:koin-core:+")
    implementation("io.insert-koin:koin-androidx-workmanager:+")
    testImplementation("io.insert-koin:koin-test-junit5:+")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:+")
    implementation("org.jetbrains.kotlin:kotlin-reflect:+")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:+")

    implementation("androidx.lifecycle:lifecycle-common:+")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:+")
    implementation("androidx.lifecycle:lifecycle-process:+")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:+")
    implementation("androidx.lifecycle:lifecycle-service:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:+")

    implementation("com.airbnb.android:mavericks:+")
    implementation("com.airbnb.android:mavericks-compose:+")
    implementation("com.airbnb.android:mavericks-navigation:+")

    implementation("com.squareup.moshi:moshi:+")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:+")

    implementation("androidx.navigation:navigation-fragment-ktx:+")
    implementation("androidx.navigation:navigation-ui-ktx:+")
    implementation("androidx.navigation:navigation-compose:+")
    testImplementation("androidx.navigation:navigation-testing:+")

    implementation("com.squareup.okhttp3:okhttp:+")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:+")

    implementation("com.squareup.retrofit2:retrofit:+")
    implementation("com.squareup.retrofit2:converter-moshi:+")
    implementation("com.squareup.retrofit2:converter-scalars:+")

    implementation("androidx.room:room-runtime:+")
    implementation("androidx.room:room-ktx:+")
    kapt("androidx.room:room-compiler:+")
    testImplementation("androidx.room:room-testing:+")

    implementation("jp.wasabeef.transformers:coil:+")
    implementation("jp.wasabeef.transformers:coil-gpu:+")
    implementation("jp.wasabeef.transformers:glide:+")
    implementation("jp.wasabeef.transformers:glide-gpu:+")

    implementation("androidx.work:work-runtime-ktx:+")
    testImplementation("androidx.work:work-testing:+")

}