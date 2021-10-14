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
    implementation("com.aliyun.dpa:oss-android-sdk:2.9.9")
    implementation("com.aliyun.ams:alicloud-android-push:3.5.0")
    implementation("com.blankj:utilcodex:1.30.6")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.github.JavaNoober.BackgroundLibrary:libraryx:1.7.2")
    implementation("io.github.razerdp:BasePopup:3.1.8")
    implementation("me.jorgecastillo:androidcolorx:0.2.0")
    implementation("com.github.loperSeven:DateTimePicker:0.4.1")
    implementation("com.github.princekin-f:EasyFloat:2.0.3")
    implementation("com.ypx.yimagepicker:androidx:3.1.4")
    implementation("joda-time:joda-time:2.10.12")
    implementation("com.squareup.leakcanary:leakcanary-android:2.7")
    implementation("com.tencent:mmkv-static:1.2.10")
    implementation("com.guolindev.permissionx:permissionx:1.6.0")
    implementation("com.github.jenly1314:zxing-lite:2.1.1")
    implementation("androidx.startup:startup-runtime:1.1.0")
    implementation("com.dropbox.mobile.store:store4:4.0.2-KT15")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:6.8.0")
    implementation("com.iqiyi.xcrash:xcrash-android-lib:3.0.0")
    implementation("com.localebro:okhttpprofiler:1.0.8")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.18.0")

    implementation("com.github.Justson.AgentWeb:agentweb-core:v4.1.9-androidx")
    implementation("com.github.xiaohaibin:XBanner:androidx_v1.2.0")
    implementation("com.eightbitlab:blurview:1.6.6")
    implementation("com.ashokvarma.android:bottom-navigation-bar:2.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation("io.github.csdn-mobile:RoundView:1.0.0")
    implementation("com.google.android.flexbox:flexbox:3.0.0")
    implementation("com.github.dkzwm:fet-core:0.2.1")
    implementation("com.airbnb.android:lottie:4.2.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")
    implementation("com.github.chrisbanes:PhotoView:2.3.0")
    implementation("io.github.chaosleung:pinview:1.4.4")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")
    implementation("com.kyleduo.switchbutton:library:2.1.0")
    implementation("androidx.viewpager2:viewpager2:1.1.0-beta01")
    implementation("com.tencent.tbs:tbssdk:44085")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-rc01")

    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("androidx.test.ext:junit-ktx:1.1.3")

    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0-rc01")
    implementation("com.github.fornewid:material-motion-compose:0.7.3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-rc01")

    implementation("com.google.accompanist:accompanist-appcompat-theme:0.19.0")
    implementation("com.google.accompanist:accompanist-drawablepainter:0.19.0")
    implementation("com.google.accompanist:accompanist-flowlayout:0.19.0")
    implementation("com.google.accompanist:accompanist-insets:0.19.0")
    implementation("com.google.accompanist:accompanist-navigation-animation:0.19.0")
    implementation("com.google.accompanist:accompanist-navigation-material:0.19.0")
    implementation("com.google.accompanist:accompanist-pager:0.19.0")
    implementation("com.google.accompanist:accompanist-permissions:0.19.0")
    implementation("com.google.accompanist:accompanist-placeholder:0.19.0")
    implementation("com.google.accompanist:accompanist-placeholder-material:0.19.0")
    implementation("com.google.accompanist:accompanist-swiperefresh:0.19.0")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.19.0")

    implementation("androidx.compose.animation:animation:1.1.0-alpha06")
    implementation("androidx.compose.compiler:compiler:1.1.0-alpha06")
    implementation("androidx.compose.foundation:foundation:1.1.0-alpha06")
    implementation("androidx.compose.runtime:runtime-livedata:1.1.0-alpha06")
    implementation("androidx.compose.material:material:1.1.0-alpha06")
    implementation("androidx.compose.material:material-icons-core:1.1.0-alpha06")
    implementation("androidx.compose.material:material-icons-extended:1.1.0-alpha06")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.0-alpha06")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.1.0-alpha06")
    implementation("androidx.compose.ui:ui:1.1.0-alpha06")
    implementation("androidx.compose.ui:ui-tooling:1.1.0-alpha06")


    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")

    implementation("androidx.camera:camera-camera2:1.0.2")
    implementation("androidx.camera:camera-core:1.0.2")
    implementation("androidx.camera:camera-lifecycle:1.0.2")
    implementation("androidx.camera:camera-view:1.0.0-alpha30")
    implementation("androidx.camera:camera-extensions:1.0.0-alpha30")

    debugImplementation("com.github.chuckerteam.chucker:library:3.5.2")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:3.5.2")

    implementation("io.coil-kt:coil:1.4.0")
    implementation("io.coil-kt:coil-compose:1.4.0")

    implementation("androidx.core:core-ktx:1.7.0-rc01")
    implementation("androidx.core:core-splashscreen:1.0.0-alpha02")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2")

    implementation("com.airbnb.android:epoxy:4.6.4")
    kapt("com.airbnb.android:epoxy-processor:4.6.4")
    implementation("com.airbnb.android:epoxy-glide-preloading:4.6.4")

    implementation("androidx.fragment:fragment-ktx:1.3.6")
    testImplementation("androidx.fragment:fragment-testing:1.3.6")

    implementation("io.insert-koin:koin-android:3.1.2")
    implementation("io.insert-koin:koin-core:3.1.2")
    implementation("io.insert-koin:koin-androidx-workmanager:3.1.2")
    testImplementation("io.insert-koin:koin-test-junit5:3.1.2")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")

    implementation("androidx.lifecycle:lifecycle-common:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-process:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-service:2.4.0-rc01")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0-rc01")

    implementation("com.squareup.moshi:moshi:1.12.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")

    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:4.9.1")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    implementation("androidx.room:room-runtime:2.3.0")
    implementation("androidx.room:room-ktx:2.3.0")
    kapt("androidx.room:room-compiler:2.3.0")
    testImplementation("androidx.room:room-testing:2.3.0")

    implementation("androidx.work:work-runtime-ktx:2.7.0")
    testImplementation("androidx.work:work-testing:2.7.0")

}