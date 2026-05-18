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
    implementation("com.diffplug.spotless:spotless-plugin-gradle:8.5.1")
    implementation("net.fabricmc:fabric-loom:1.16.2")
    implementation("org.ow2.asm:asm:9.10")
    implementation("com.github.spotbugs.snom:spotbugs-gradle-plugin:6.5.4")
    implementation("net.ltgt.errorprone:net.ltgt.errorprone.gradle.plugin:5.1.0")
    implementation("org.openrewrite:plugin:7.32.2")
    implementation("net.kyori:indra-git:4.0.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

kotlin {
    jvmToolchain(25)
}
