plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "org.fakhry.leetcode"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("org.fakhry.leetcode.MainKt")
}

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
    jvmToolchain(17)
}