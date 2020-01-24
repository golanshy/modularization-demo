package uk.co.applylogic.modularization.buildsrc

object Libs {

    object Kotlin {
        private const val version = "1.3.61"
        const val stdLibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }

    object Coroutines {
        // Check here for updates: https://github.com/Kotlin/kotlinx.coroutines
        private const val version = "1.3.3"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0-alpha01"
        const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        const val multiDex = "androidx.multidex:multidex:2.0.1"
        const val androidxAnnotations = "androidx.annotation:annotation:1.1.0"
        const val coreKtx = "androidx.core:core-ktx:1.1.0"
        const val pagingKtx = "androidx.paging:paging-runtime-ktx:2.1.1"

        const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha01"
        const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0-alpha03"
        const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
        const val preferenceKtx = "androidx.preference:preference-ktx:1.1.0"
        const val biometric = "androidx.biometric:biometric:1.0.1"

        object Lifecycle {
            private const val version = "2.2.0"
            const val common = "androidx.lifecycle:lifecycle-common:$version"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
            const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$version"
        }

        object ViewModel {
            private const val version = "2.2.0"
            const val ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:1.0.0"
        }

        object Navigation {
            private const val version = "2.2.0"
            const val ktx = "androidx.navigation:navigation-ui-ktx:$version"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        }

        object Room {
            private const val version = "2.2.3"
            const val ktx = "androidx.room:room-ktx:$version"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val testing = "androidx.room:room-testing:$version"
        }

        object Test {
            private const val version = "1.2.0"
            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"
            const val jUnit = "androidx.test.ext:junit:1.1.1"
            const val androidxTruth = "androidx.test.ext:truth:1.0.0"
            const val googleTruth = "com.google.truth:truth:0.42"

            object Espresso {
                private const val version = "3.2.0"
                const val core = "androidx.test.espresso:espresso-core:$version"
                const val contrib = "androidx.test.espresso:espresso-contrib:$version"
                const val intents = "androidx.test.espresso:espresso-intents:$version"
                const val accessibility = "androidx.test.espresso:espresso-accessibility:$version"
                const val web = "androidx.test.espresso:espresso-web:$version"
                const val idlingConcurrent = "androidx.test.espresso:espresso-idling-concurrent:$version"
                const val idlingResource = "androidx.test.espresso:espresso-idling-resource:$version"
            }
        }
    }

    object Google {
        // Check here for updates: https://github.com/material-components/material-components-android/releases
        const val material = "com.google.android.material:material:1.2.0-alpha04"
        const val gson = "com.google.code.gson:gson:2.8.6"

        object Firebase {
            // Check here for updates: https://firebase.google.com/support/release-notes/android
            const val analytics = "com.google.firebase:firebase-analytics:17.2.2"
            const val messaging = "com.google.firebase:firebase-messaging:20.1.0"
            const val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.10.1"
            const val performance = "com.google.firebase:firebase-perf:19.0.5"
            const val inAppMessaging = "com.google.firebase:firebase-inappmessaging-ktx:19.0.3"
            const val inAppMessagingDisplay = "com.google.firebase:firebase-inappmessaging-display-ktx:19.0.3"
            const val database = "com.google.firebase:firebase-database-ktx:19.2.0 "
            const val remoteConfig = "com.google.firebase:firebase-config-ktx:19.1.0"
        }

        object Dagger {
            // Check here for updates: https://github.com/google/dagger/releases
            private const val version = "2.25.4"
            const val dagger = "com.google.dagger:dagger:$version"
            const val compiler = "com.google.dagger:dagger-compiler:$version"
            //const val daggerAndroid = "com.google.dagger:dagger-android:$version"
            //const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$version"
            //const val processor = "com.google.dagger:dagger-android-processor:$version"
        }
    }

    object SquareUp {
        object OkHttp3 {
            // Check here for updates: https://square.github.io/okhttp/
            private const val version = "4.3.1"
            const val okHttp3 = "com.squareup.okhttp3:okhttp:$version"
            const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
        }

        object Retrofit2 {
            // Check here for updates: https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit
            private const val version = "2.7.1"
            const val retrofit = "com.squareup.retrofit2:retrofit:$version"
            const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
            const val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:1.0.0"
        }

        const val otto = "com.squareup:otto:1.3.8"
    }

    object Glide {
        // Check here for updates: https://github.com/bumptech/glide
        private const val version = "4.11.0"
        const val glide = "com.github.bumptech.glide:glide:$version"
        const val compiler = "com.github.bumptech.glide:compiler:$version"
    }
}
