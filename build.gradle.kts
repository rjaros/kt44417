plugins {
    kotlin("jvm") version "1.4.30-RC"
    kotlin("plugin.serialization") version "1.4.30-RC"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
}
