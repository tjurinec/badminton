plugins {
    kotlin("jvm") version "1.9.23"
    id("application")
    id("com.github.johnrengelman.shadow") version "8.1.0" // Shadow plugin
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

// Heroku staging task configuration
tasks.register("stage") {
    dependsOn("shadowJar")
}