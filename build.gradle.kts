plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.dokka") version "1.5.31"
    id("com.diffplug.spotless") version "6.1.0"
}

repositories {
    mavenCentral()
}

spotless {
    kotlin {
        ktlint("0.43.0")
    }
}
