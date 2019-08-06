plugins {
    application
    kotlin("jvm") version "1.3.41"
    id("com.squareup.wire") version "3.0.0-rc01" apply false 
}

buildscript {
    repositories {
        mavenCentral()
    }
}

application {
    mainClassName = "samples.HelloWorld"
}

dependencies {
    implementation(kotlin("stdlib"))
}

repositories {
    jcenter()
    mavenCentral()
}
