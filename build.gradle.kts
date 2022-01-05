/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.3.3/samples
 */

plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "io.novasql"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        url = uri("https://repo.novasql.io/repository/public")
    }
}

dependencies {
//    implementation("io.novasql", "API", "1.0.0-SNAPSHOT")
    api("io.novasql:API:1.0.0-SNAPSHOT")
    implementation("org.slf4j:slf4j-api:2.0.0-alpha5")
    implementation("org.slf4j:slf4j-simple:2.0.0-alpha5")
}