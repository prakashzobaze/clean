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
                implementation("io.ktor:ktor-client-okhttp:2.0.1")

                implementation("io.ktor:ktor-client-content-negotiation:2.0.1")
                implementation("io.ktor:ktor-serialization-gson:2.0.1")
                implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
                // Ktor android engine
                implementation(libs.ktor.client.android)
//                // SqlDelight android driver
//                implementation(libs.sqldelight.android)
                implementation(libs.androidx.preferences)

                implementation(platform("com.google.firebase:firebase-bom:31.0.3"))
                implementation("com.google.firebase:firebase-firestore")
                implementation("com.google.firebase:firebase-analytics-ktx")
                implementation("com.google.firebase:firebase-database-ktx")
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