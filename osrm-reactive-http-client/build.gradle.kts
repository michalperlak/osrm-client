plugins {
    kotlin("jvm")
}

val reactorNettyVersion: String by project

dependencies {
    implementation(project(":osrm-api"))
    implementation(kotlin("stdlib"))
    implementation("io.projectreactor.netty", "reactor-netty", reactorNettyVersion)
}