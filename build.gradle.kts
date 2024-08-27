plugins {
    id("java-library")
    id("maven-publish")
}

group = "uk.nhs.nia.gp2gp.schema"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.2")
    implementation("com.sun.xml.bind:jaxb-impl:4.0.5")
    implementation("org.apache.commons:commons-lang3:3.16.0")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}