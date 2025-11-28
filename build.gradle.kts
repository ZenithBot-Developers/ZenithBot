plugins {
    id("java")
}

group = "org.YTmaxgamesYT.ZenithBot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    implementation("net.dv8tion:JDA:6.1.2")
    implementation("io.github.cdimascio:dotenv-java:3.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}