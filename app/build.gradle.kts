plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id 'kotlin-kapt'
}

android {
    namespace = "com.example.newsapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.newsapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("junit:junit:4.13.2")
    implementation 'androidx.test.ext:junit:1.1.5'
    implementation ("androidx.test.espresso:espresso-core:3.5.1")

    implementation platform('com.google.firebase:firebase-bom:31.2.0')
    implementation 'com.google.firebase:firebase-analytics-ktx'

    implementation 'com.google.firebase:firebase-firestore-ktx'

    implementation 'com.google.firebase:firebase-auth-ktx'

    // Storage
    implementation 'com.google.firebase:firebase-storage-ktx'


    // Glide
    implementation 'com.github.bumptech.glide:glide:4.14.2'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.14.2'
}