plugins {
    kotlin("jvm") version "1.6.10"
}

group = project.properties["group"]!!
version = project.properties["version"]!!

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin="org.jetbrains.kotlin.jvm")
}