plugins {
    kotlin("jvm") version "1.9.23"
    id("application")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.0.0")
    implementation("io.ktor:ktor-server-netty:2.0.0")
}

application {
    mainClass.set("com.example.App")
}