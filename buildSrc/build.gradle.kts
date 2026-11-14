plugins {
    `kotlin-dsl`
}

repositories {
    maven("https://maven.fabricmc.net/") {
        name = "Fabric"
    }
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:8.11.0")
    implementation("net.fabricmc:fabric-loom:1.19.4")
    implementation("org.ow2.asm:asm:9.11.1")
    implementation("com.github.spotbugs.snom:spotbugs-gradle-plugin:6.5.13")
    implementation("net.ltgt.errorprone:net.ltgt.errorprone.gradle.plugin:5.2.0")
    implementation("org.openrewrite:plugin:7.41.0")
    implementation("net.kyori:indra-git:4.1.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

kotlin {
    jvmToolchain(25)
}
