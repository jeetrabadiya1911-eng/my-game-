plugins {
    id("com.android.application")
}

android {
    namespace = "com.wordpulse.game"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.wordpulse.game"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.webkit:webkit:1.10.0")
}
