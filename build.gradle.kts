plugins {
    kotlin("jvm") version "1.8.0"
    application
    id("org.jlleitschuh.gradle.ktlint") version "11.2.0"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(16)
}

application {
    mainClass.set("MainKt")
}