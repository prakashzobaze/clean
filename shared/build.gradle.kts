plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization")
    //kotlin("native.cocoapods")//TODO enable with adding iosAp Target
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    ios()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                val libs = project.extensions.getByName("libs") as org.gradle.accessors.dm.LibrariesForLibs
                // Coroutines
                implementation(libs.kotlinx.coroutines)
                // Serialization
                implementation(libs.kotlinx.serialization)
                implementation(libs.kotlinx.serializationJson)
                // Ktor
                implementation(libs.ktor.client.core)
//                // SqlDelight
//                implementation(libs.sqldelight.runtime)
//                implementation(libs.sqldelight.ext)
                // Arkitekt
                api(libs.arkitekt.kmusecases)
                api(libs.kmmviewmodel)
                implementation(libs.koin.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.ktor.client.okhttp)

                implementation(libs.ktor.client.contentNegotiation)
                implementation(libs.ktor.client.serialization.gson)
                implementation(libs.okhttp.loggingInterceptor)
                // Ktor android engine
                implementation(libs.ktor.client.android)
//                // SqlDelight android driver
//                implementation(libs.sqldelight.android)
                implementation(libs.androidx.preferences)

                implementation(platform("com.google.firebase:firebase-bom:31.0.3"))
                implementation(libs.firebase.firestore)
                implementation(libs.firebase.analyticsKtx)
                implementation(libs.firebase.databaseKtx)
            }
        }
    }
}

android {
    namespace = "com.zobaze.mealsearch.shared"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}