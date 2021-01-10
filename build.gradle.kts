import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "5.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("org.junit.jupiter:junit-jupiter-params:5.0.0-M4")

    testImplementation("org.hamcrest:hamcrest:2.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "15"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "15"
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<ShadowJar> {

    manifest.attributes.apply {
        put("Main-Class", "example.MainKt")
    }
}
