plugins {
    id("java")
}

group = "org.blackjack"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
<<<<<<< HEAD
=======
    implementation("org.projectlombok:lombok:1.18.26")
    implementation("org.projectlombok:lombok:1.18.26")
>>>>>>> af05cae (initial)
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}