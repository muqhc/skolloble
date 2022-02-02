dependencies {
    implementation("org.antlr:antlr4-runtime:4.9.3")
    implementation(project(":${rootProject.name}-parser"))
    implementation(project(":${rootProject.name}-to-xml"))
}