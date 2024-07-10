plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("kapt") version "1.9.23"
}

group = "eu.wohlbrecht"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jmolecules:jmolecules-bom:2023.1.3"))
    kapt(platform("org.jmolecules:jmolecules-bom:2023.1.3"))

    implementation("org.jmolecules:kmolecules-ddd")
    kapt("org.jmolecules.integrations:jmolecules-apt")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
